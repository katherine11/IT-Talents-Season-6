package immigrants.other;

import java.util.Random;

import immigrants.exceptions.AddressException;
import immigrants.exceptions.CityException;
import immigrants.exceptions.CountryException;
import immigrants.exceptions.ImmigrantException;
import immigrants.exceptions.ImmigrantWithWeaponsException;
import immigrants.exceptions.OutOfMoneyException;
import immigrants.exceptions.PassportException;
import immigrants.exceptions.RadicalImmigrantException;
import immigrants.exceptions.WeaponException;
import immigrants.interfaces.Sortable;
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

	public static Weapon[] generateWeapons(Weapon[] weapons) throws WeaponException {

		Weapon[] unsold = new Weapon[WEAPONS_TO_BUY];

		if (weapons != null) {
			int[] randomIndexes = generateRandomIndexesWithoutRepeating(0, WEAPONS_TO_BUY - 1, WEAPONS_TO_BUY);

			for (int index = 0; index < unsold.length; index++) {

				int randomIndexWeapon = randomIndexes[index];
				if (!weapons[randomIndexWeapon].isSold()) {
					unsold[index] = weapons[randomIndexes[index]];
				}
			}

		} else {
			throw new WeaponException("Invalid array of weapons given!");
		}
		return unsold;

	}

	public static Immigrant[] generateImmigrants(Immigrant[] immigrants, int size) {

		Immigrant[] randomI = new Immigrant[size];
		int[] randomInd = generateRandomIndexesWithoutRepeating(0, size - 1, size);

		for (int index = 0; index < randomI.length; index++) {
			int randomIndexIm = randomInd[index];
			randomI[index] = immigrants[randomIndexIm];
		}

		return randomI;
	}

	public static ImmigrantWithWeapons[] generateShooters(Immigrant[] immigrants, int size) {

		ImmigrantWithWeapons[] randomI = new ImmigrantWithWeapons[size];
		int[] randomInd = generateRandomIndexesWithoutRepeating(0, size, size);

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

	public static int[] generateRandomIndexesWithoutRepeating(int start, int end, int count) {
		int currentIndex = 0, remaining = end - start;
		int[] randomIndexes = new int[count];
		Random rng = new Random();

		for (int index = 0; index < end && count > 0; index++) {
			int probability = rng.nextInt();
			if (remaining != 0 && probability < (int) (count / remaining)) {
				count--;
				randomIndexes[currentIndex++] = index;
			}
			remaining--;
		}
		return randomIndexes;
	}

	public static int makeVicitims(int size) {
		return (int) (Math.random() * size + 5);
	}
	
	public Immigrant [] sort(Immigrant [] immigrants) {

		Immigrant [] result = new Immigrant[immigrants.length];
		for (int index = 0; index < immigrants.length; index++) {
			for (int ind = 0; ind < immigrants.length - index - 1; ind++) {
		
				if(immigrants[index].getMoney() > immigrants[index+1].getMoney()){
					Immigrant temp = immigrants[index];
					immigrants[index] = immigrants[index+1];
					immigrants[index+1] = temp;
				}				
			}
		}
		
		result = immigrants;
		return result;
	}

	

	public static void main(String[] args) throws CountryException, CityException, AddressException,
			OutOfMoneyException, ImmigrantException, PassportException, WeaponException {

		// 1)

		final String[] cityNames = { "Sofia", "Burgas", "Plovdiv", "Varna", "Vraca", "Stara Zagora" };
		City[] cities = new City[CITIES];
		for (int index = 0; index < cities.length; index++) {
			cities[index] = new City(cityNames[(int) (Math.random() * cities.length)]);
		}
		Country bulgaria = new Country("Bulgaria", cities);

		Police[] police = new Police[MAX_OFFICERS];
		final String[] names = { "Martin", "Ivan", "Petko", "Milena", "Iliana", "Grigor", "Alek", "Nataly", "Vasilena",
				"Svetoslav" };

		final Address[] addresses = new Address[cities.length];
		try {
			for (int index = 0; index < addresses.length; index++) {
				addresses[index] = new Address(bulgaria, cities[(int) (Math.random() * cities.length)]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int index = 0; index < MAX_OFFICERS; index++) {

			if (Math.random() > 0.5) {
				police[index] = new PoliceOfficer(names[(int) (Math.random() * names.length)],
						addresses[(int) (Math.random() * addresses.length)]);
			} else {
				police[index] = new SpecialForces(names[(int) (Math.random() * names.length)],
						addresses[(int) (Math.random() * addresses.length)]);
			}

		}

		for (int index = 0; index < cities.length; index++) {

			Police[] randomPolice = new Police[police.length / CITIES];

			for (int index2 = 0; index2 < randomPolice.length; index2++) {
				if (Math.random() > 0.5) {
					randomPolice[index2] = new PoliceOfficer(names[(int) (Math.random() * names.length)],
							addresses[(int) (Math.random() * addresses.length)]);
				} else {
					randomPolice[index2] = new SpecialForces(names[(int) (Math.random() * names.length)],
							addresses[(int) (Math.random() * addresses.length)]);
				}

			}

			cities[index] = new City(cityNames[(int) (Math.random() * cityNames.length)],
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

			try {
				if (chance <= CHANCE_FOR_RADICAL) {

					immigrants[index] = new Radical((int) (Math.random() * 1_000 + 20), randomAddress, randomPass);
					// 35 % chance to have passport
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (chance > CHANCE_FOR_RADICAL && chance <= CHANCE_FOR_EXTREMIST) {
				immigrants[index] = new Extremist((int) (Math.random() * 1_000 + 20), randomAddress);

			}

			if (chance > CHANCE_FOR_NORMAL) {
				immigrants[index] = new Normal((int) (Math.random() * 1_000 + 20), randomAddress, randomPass);
			}

		}

		Immigrant[] randomRelatives = new Immigrant[REALTIVES];

		for (int index = 0; index < randomRelatives.length; index++) {
			
			byte chance = (byte) (Math.random() * 100);

			Address randomAddress = new Address(bulgaria, cities[(int) (Math.random() * cities.length)]);
			Passport randomPass = new Passport(names[(int) (Math.random() * names.length)]);

			try {
				if (chance <= CHANCE_FOR_RADICAL) {

					randomRelatives[index] = new Radical((int) (Math.random() * 1_000 + 20), randomAddress, randomPass);
					// 35 % chance to have passport
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (chance > CHANCE_FOR_RADICAL && chance <= CHANCE_FOR_EXTREMIST) {
				randomRelatives[index] = new Extremist((int) (Math.random() * 1_000 + 20), randomAddress);

			}

			if (chance > CHANCE_FOR_NORMAL) {
				randomRelatives[index] = new Normal((int) (Math.random() * 1_000 + 20), randomAddress, randomPass);
			}
		}

		for (int index = 0; index < randomRelatives.length; index++) {
			if (randomRelatives[index] != null && !(randomRelatives[index] instanceof Extremist)) {
				if (randomRelatives[index] instanceof Radical && randomRelatives[index].isHasPassport()) {
					randomRelatives[index].setRelatives(randomRelatives);
				}
			}
		}

		// 3)

		Weapon[] weapons = new Weapon[WEAPONS_SIZE];

		for (int index = 0; index < weapons.length; index++) {

			byte chance = (byte) (Math.random() * 3);

			switch (chance) {

			case 0:
				weapons[index] = new Gun((int) (Math.random() * 100 + 10));
				break;
			case 1:
				weapons[index] = new Bomb((int) (Math.random() * 100 + 10));
				break;
			case 2:
				weapons[index] = new Automat((int) (Math.random() * 100 + 10));
				break;

			}

		}

		for (int index = 0; index < immigrants.length; index++) {

			Weapon[] weapons2 = generateWeapons(weapons).clone();

			if (immigrants[index] instanceof ImmigrantWithWeapons) {
				try {
					((ImmigrantWithWeapons) immigrants[index]).buyWeapons(weapons2);
				} catch (RadicalImmigrantException e) {
					e.printStackTrace();
				}
			}

			for (int index2 = 0; index2 < weapons2.length; index2++) {
				if (weapons2[index2] != null) {
					weapons2[index2].setSold(true);
				}
			}
		}

		// 4)

		try {
			Immigrant[] migrators = generateImmigrants(immigrants, (int) (Math.random() * 100 + 10));
			for (int index = 0; index < migrators.length; index++) {
				Immigrant currentMigrator = migrators[index];
				City randomCity = cities[(int) (Math.random() * cities.length)];
				currentMigrator.migrate(randomCity);
				Police randomPolice = police[(int) (Math.random() * police.length)];

				if (randomPolice.managedToCheck(currentMigrator)) {
					randomCity.addImmigrant(currentMigrator);
					currentMigrator.getCurrentAddress().setCity(randomCity);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 5)

		for (Immigrant immigrant : immigrants) {
			if (immigrant != null) {
				immigrant.showInfo();
			}
		}

		// 6)

		try {
			ImmigrantWithWeapons[] shooters = generateShooters(immigrants, SHOOTERS);

			for (ImmigrantWithWeapons shooter : shooters) {
				if (shooter != null) {
					shooter.buyWeapons(generateWeapons(weapons));
				}
			}

			for (int index = 0; index < shooters.length; index++) {

				City randomCity = cities[(int) (Math.random() * cities.length)];
				Weapon randomWeapon = weapons[(int) (Math.random() * weapons.length)];

				if (shooters[index] != null && randomCity != null) {
					if (shooters[index] instanceof Extremist) {
						((Extremist) shooters[index]).explode(randomCity);
					}

					if (shooters[index] instanceof Radical) {
						randomCity.reducePopulation(
								makeVicitims(((Radical) shooters[index]).shoot(randomCity, randomWeapon)));
					}
				}
			}

		} catch (ImmigrantWithWeaponsException e) {
			e.printStackTrace();
		}

		// 7)

	}


}
