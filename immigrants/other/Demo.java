package immigrants.other;

import immigrants.exceptions.PassportException;
import immigrants.exceptions.PoliceException;
import immigrants.exceptions.WeaponException;
import immigrants.people.Extremist;
import immigrants.people.Immigrant;
import immigrants.people.ImmigrantWithWeapons;
import immigrants.people.Normal;
import immigrants.people.Police;
import immigrants.people.PoliceOfficer;
import immigrants.people.Radical;
import immigrants.people.SpecialForces;
import immigrants.weapons.Automat;
import immigrants.weapons.Bomb;
import immigrants.weapons.Gun;
import immigrants.weapons.Weapon;

public class Demo {

	private static final int SHOOTERS = 20;
	private static final int PASSPORTS = 100;
	private static final int WEAPONS_TO_BUY = 5;
	private static final int WEAPONS_SIZE = 200;
	private static final int REALTIVES = 2;
	private static final int CHANCE_FOR_NORMAL = 60;
	private static final int CHANCE_FOR_EXTREMIST = 60;
	private static final int CHANCE_FOR_RADICAL = 25;
	private static final int IMMIGRANTS_SIZE = 100;
	private static final int CITIES = 5;
	private static final int MAX_OFFICERS = 25;


	public static void main(String[] args) throws Exception {

		// 1)

		final String[] cityNames = { "Sofia", "Burgas", "Plovdiv", "Varna", "Stara Zagora", "Carevo", "Nesebur",
				"Veliko Turnovo" };
		City[] cities = new City[CITIES];
		for (int index = 0; index < cities.length; index++) {
			cities[index] = new City(cityNames[(int) (Math.random() * cities.length)]);
		}
		Country bulgaria = new Country("Bulgaria", cities);

		final String[] names = { "Martin", "Ivan", "Petko", "Milena", "Iliana", "Grigor", "Alek", "Nataly", "Vasilena",
				"Svetoslav" };

		final Address[] addresses = new Address[cities.length];

		for (int index = 0; index < addresses.length; index++) {
			addresses[index] = new Address(bulgaria, cities[(int) (Math.random() * cities.length)]);
		}

		Police[] police = new Police[MAX_OFFICERS];
		for (int index = 0; index < MAX_OFFICERS; index++) {

			if (Math.random() > 0.5) {
				police[index] = new PoliceOfficer(names[(int) (Math.random() * names.length)],
						addresses[(int) (Math.random() * addresses.length)]);
			} else {
				police[index] = new SpecialForces(names[(int) (Math.random() * names.length)],
						addresses[(int) (Math.random() * addresses.length)]);
			}

		}

		Police[] randomPolice = new Police[police.length / CITIES];

		randomPolice = generatePolice(police, police.length);
		for (int index = 0; index < cities.length; index++) {
			cities[index] = new City(
					generateCityNames(cityNames, cityNames.length)[(int) (Math.random() * cityNames.length)],
					(long) (Math.random() * 100_000_000 + 1_000), randomPolice);
		}

		// 2)

		final Passport[] passports = new Passport[PASSPORTS];
		for (int index = 0; index < passports.length; index++) {
			passports[index] = new Passport(names[(int) (Math.random() * names.length)]);
		}

		Immigrant[] immigrants = new Immigrant[IMMIGRANTS_SIZE];

		for (int index = 0; index < immigrants.length; index++) {

			byte chance = (byte) (Math.random() * 100);

			Address randomAddress = new Address(bulgaria, cities[(int) (Math.random() * cities.length)]);
			Passport randomPass = new Passport(names[(int) (Math.random() * names.length)]);

			if (chance <= CHANCE_FOR_RADICAL) {

				immigrants[index] = new Radical((int) (Math.random() * 1_000 + 200), randomAddress);

				try {
					immigrants[index].setPassport(randomPass);
					// 35 % chance to have passport
				} catch (PassportException e) {
					e.printStackTrace();
				}
			}

			if (chance > CHANCE_FOR_RADICAL && chance <= CHANCE_FOR_EXTREMIST) {
				immigrants[index] = new Extremist((int) (Math.random() * 1_000 + 200), randomAddress);

			}

			if (chance > CHANCE_FOR_NORMAL) {
				immigrants[index] = new Normal((int) (Math.random() * 1_000 + 200), randomAddress, randomPass);
			}
		}

		for (int index = 0; index < immigrants.length; index++) {
			Immigrant[] randomRelatives = new Immigrant[REALTIVES];

			for (int index2 = 0; index2 < randomRelatives.length; index2++) {
				randomRelatives[index2] = immigrants[(int) (Math.random() * immigrants.length)];
			}

			immigrants[index].addRelatives(randomRelatives);
		}

		// 3)

		Weapon[] weapons = new Weapon[WEAPONS_SIZE];

		for (int index = 0; index < weapons.length; index++) {

			byte chance = (byte) (Math.random() * 3);

			switch (chance) {

			case 0:
				weapons[index] = new Gun((int) (Math.random() * 50 + 10));
				break;
			case 1:
				weapons[index] = new Bomb((int) (Math.random() * 50 + 10));
				break;
			case 2:
				weapons[index] = new Automat((int) (Math.random() * 50 + 10));
				break;

			}

		}

		Weapon[] weapons2 = generateWeapons(weapons).clone();

		for (int index = 0; index < immigrants.length; index++) {

			if (immigrants[index] instanceof ImmigrantWithWeapons) {
				((ImmigrantWithWeapons) immigrants[index]).buyWeapons(weapons2);

				for (int index2 = 0; index2 < weapons2.length; index2++) {
					weapons2[index2].setSold(true);
				}
			}
		}

		// 4)

		Immigrant[] migrators = generateImmigrants(immigrants, (int) (Math.random() * 90 + 10));
		for (int index = 0; index < migrators.length; index++) {
			Immigrant currentMigrator = migrators[index];
			City randomCity = cities[(int) (Math.random() * cities.length)];
			currentMigrator.migrate(randomCity, currentMigrator.getRelatives().length);
			Police randomPoliceOfficer = police[(int) (Math.random() * police.length)];
			try {
				if (randomPoliceOfficer.managedToCheck(currentMigrator)) {
					randomCity.addImmigrant(currentMigrator);
					Address currentAddress = new Address(bulgaria, randomCity);
					currentMigrator.setCurrentAddress(currentAddress);
				}
			} catch (PoliceException e) {
				e.printStackTrace();
			}
		}

		// 5)

		for (Immigrant immigrant : immigrants) {
			immigrant.showInfo();
		}

		// 6)

		ImmigrantWithWeapons[] immigrantsWithWeapons = new ImmigrantWithWeapons[immigrants.length];
		int size = 0;

		for (int index = 0; index < immigrants.length; index++) {
			if (immigrants[index] instanceof ImmigrantWithWeapons) {
				immigrantsWithWeapons[size++] = (ImmigrantWithWeapons) immigrants[index];
			}
		}

		ImmigrantWithWeapons[] shooters = generateShooters(immigrantsWithWeapons, SHOOTERS);

		for (int index = 0; index < shooters.length; index++) {

			City randomCity = cities[(int) (Math.random() * cities.length)];
			Weapon randomWeapon = weapons[(int) (Math.random() * weapons.length)];

			if (shooters[index] instanceof Extremist) {
				for (int index2 = 0; index2 < shooters[index].getWeapons().length; index2++) {

					if (shooters[index].getWeapons()[index2] instanceof Bomb) {
						((Extremist) shooters[index]).explode(randomCity);
						((Bomb) shooters[index].getWeapons()[index2]).setExploded(true);
					}

				}

			}
			if (shooters[index] instanceof Radical) {
				randomCity.reducePopulation(makeVicitims(((Radical) shooters[index]).shoot(randomCity, randomWeapon)));
			}
		}

		// 7)

		City[] sortedCities = sortCities(cities);

		for (City city : sortedCities) {
			System.out.println(city.getPopulation());
		}

		Immigrant[] sortedImmigrants = sort(immigrants);

		for (Immigrant immigrant : sortedImmigrants) {
			System.out.println(immigrant.getMoney());
		}

		//all extremists - they only have bomb:
		
		Extremist[] extremists = new Extremist[immigrants.length / 2];
		int size2 = 0;

		for (int index = 0; index < immigrants.length; index++) {
			if (immigrants[index] instanceof Extremist) {
				extremists[size2++] = (Extremist) immigrants[index];
			}
		}

		Extremist[] sortedExtremists = sortExtr(extremists);

		for (int index = 0; index < sortedExtremists.length; index++) {
			for (int ind = 0; ind < sortedExtremists[index].getWeapons().length; ind++) {
				if (sortedExtremists[index].getWeapons()[ind] instanceof Bomb) {
					System.out.println(((Bomb) sortedExtremists[index].getWeapons()[ind]).isExploded());
				}
			}
		}

		
	}
	
	
	public static Weapon[] generateWeapons(Weapon[] weapons) throws WeaponException {

		Weapon[] unsold = new Weapon[WEAPONS_TO_BUY];

		if (weapons != null) {
			int[] randomIndexes = generateRandomIndexesWithoutRepeating(WEAPONS_TO_BUY);

			for (int index = 0; index < unsold.length; index++) {

				int randomIndexWeapon = randomIndexes[index];
				boolean sold = weapons[randomIndexWeapon].isSold();

				do {

					if (Weapon.allWeaponsSold(weapons)) {
						System.out.println("All weapons are sold!");
						break;
					}

					if (sold) {
						sold = weapons[++randomIndexWeapon].isSold();
					} else {
						unsold[index] = weapons[randomIndexWeapon];
					}

				} while (sold || ++randomIndexWeapon > weapons.length - 1);

			}

		} else {
			throw new WeaponException("Invalid array of weapons given!");
		}
		return unsold;

	}

	public static Police[] generatePolice(Police[] police, int size) {
		Police[] randomP = new Police[size];
		int[] randomInd = generateRandomIndexesWithoutRepeating(size);

		for (int index = 0; index < randomP.length; index++) {
			int randomIndexP = randomInd[index];
			randomP[index] = police[randomIndexP];
		}

		return randomP;
	}

	public static Immigrant[] generateImmigrants(Immigrant[] immigrants, int size) {

		Immigrant[] randomI = new Immigrant[size];
		int[] randomInd = generateRandomIndexesWithoutRepeating(size);

		for (int index = 0; index < randomI.length; index++) {
			int randomIndexIm = randomInd[index];
			randomI[index] = immigrants[randomIndexIm];
		}

		return randomI;
	}

	public static ImmigrantWithWeapons[] generateShooters(Immigrant[] immigrants, int size) {

		ImmigrantWithWeapons[] randomI = new ImmigrantWithWeapons[size];
		int[] randomInd = generateRandomIndexesWithoutRepeating(size);

		for (int index = 0; index < randomI.length; index++) {
			int randomIndexIm = randomInd[index];
			if (!(immigrants[randomIndexIm] instanceof Normal) && immigrants[randomIndexIm] != null) {
				randomI[index] = (ImmigrantWithWeapons) immigrants[randomIndexIm];
			} else {
				continue;
			}
		}

		return randomI;
	}

	public static int[] generateRandomIndexesWithoutRepeating(int size) {

		int[] randomIndexes = new int[size];

		for (int index = 0; index < size; index++) {
			randomIndexes[index] = index;
		}

		int randomIndex = 0;

		for (int index = 0; index < randomIndexes.length; index++) {
			randomIndex = (int) (Math.random() * randomIndexes.length);

			int temp = randomIndexes[index];
			randomIndexes[index] = randomIndexes[randomIndex];
			randomIndexes[randomIndex] = temp;

		}

		return randomIndexes;

	}

	public static int makeVicitims(int size) {
		return (int) (Math.random() * size + 5);
	}

	public static Immigrant[] sort(Immigrant[] immigrants) {

		Immigrant[] result = new Immigrant[immigrants.length];
		for (int index = 0; index < immigrants.length; index++) {
			for (int ind = 0; ind < immigrants.length - index - 1; ind++) {

				if (immigrants[ind].getMoney() > immigrants[ind + 1].getMoney()) {
					Immigrant temp = immigrants[ind];
					immigrants[ind] = immigrants[ind + 1];
					immigrants[ind + 1] = temp;
				}
			}
		}

		result = immigrants;
		return result;
	}

	public static Extremist[] sortExtr(Extremist[] immigrants) {

		Extremist[] result = new Extremist[immigrants.length / 2];
		for (int index = 0; index < immigrants.length; index++) {
			for (int ind = 0; ind < immigrants.length - index - 1; ind++) {

				if (immigrants[index] instanceof Extremist) {

					for (int in = 0; in < ((Extremist) immigrants[index]).getWeapons().length; in++) {
						if (((Extremist) immigrants[index]).getWeapons()[in] instanceof Bomb) {

							if (!((Bomb) ((Extremist) immigrants[index]).getWeapons()[in]).isExploded()) {
								Extremist temp = (Extremist) immigrants[ind];
								immigrants[ind] = immigrants[ind + 1];
								immigrants[ind + 1] = temp;
							}
						}
					}
				}
			}
		}

		result = immigrants;
		return result;
	}

	public static City[] sortCities(City[] cities) {

		City[] result = new City[cities.length];
		for (int index = 0; index < cities.length; index++) {
			for (int ind = 0; ind < cities.length - index - 1; ind++) {

				if (cities[index].getPopulation() > cities[index + 1].getPopulation()) {
					City temp = cities[index];
					cities[index] = cities[index + 1];
					cities[index + 1] = temp;
				}
			}
		}

		result = cities;
		return result;
	}

	public static String[] generateCityNames(String[] cityNames, int size) {

		String[] randomC = new String[size];
		int[] randomInd = generateRandomIndexesWithoutRepeating(size);

		for (int index = 0; index < randomC.length; index++) {
			int randomIndex = randomInd[index];
			randomC[index] = cityNames[randomIndex];
		}

		return randomC;
	}
	

}
