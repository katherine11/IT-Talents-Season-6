package accounts;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import comparators.ModelComparator;
import comparators.PriceComparator;
import comparators.RegionComparator;
import comparators.YearComparator;
import enums.SortBy;
import exceptions.AdvertisementException;
import exceptions.UserException;
import project.Advertisement;

public class Normaluser extends User {

	public Normaluser(String username, String email, String password, String fullName, String telephone, String address, int age)
			throws UserException {
		super(username, email, password, fullName, telephone, address, age);
	}

	public void publishAdvertisement(Advertisement advertisement) throws AdvertisementException {

		if (checkAdvertisement(advertisement)) {		
			this.advertisements.add(advertisement);
			System.out.println("The advertisement was successfully published! ");
		} else {
			throw new AdvertisementException("Something went wrong. Please try again publishing the advertisement!");
		}

	}

	private boolean checkAdvertisement(Advertisement advertisement) {
		if (advertisement != null && checkAdvertisementContent((advertisement))) {
			return true;
		}
		return false;
	}

	private boolean checkAdvertisementContent(Advertisement advertisement) {
		if (advertisement.getVehicle().getBrand() != null && advertisement.getVehicle().getModel() != null
				&& advertisement.getVehicle().getRegion() != null) {
			return true;
		}
		return false;
	}

	@Override
	public void deleteAdvertisement(Advertisement advertisement) throws UserException {

		if (advertisement != null && this.advertisements.contains(advertisement)) {
			for (Iterator<Advertisement> iterator = this.advertisements.iterator(); iterator.hasNext();) {

				if (iterator.next().equals(advertisement)) {
					iterator.remove();
				}
			}
		} else {
			throw new UserException("Cannot delete non-existing advertisement! ");
		}

	}

	public SortedSet<Advertisement> searchAdvertisement(Advertisement advertisement, SortBy sortBy) {

		Comparator<Advertisement> resultComparator = getComparatorBySortCriterium(sortBy);
		SortedSet<Advertisement> result = new TreeSet<Advertisement>(resultComparator);

		for (Advertisement advertisement2 : advertisements) {
			if (advertisement2.equals(advertisement)) {
				result.add(advertisement2);
			}
		}

		return result;

	}

	private Comparator<Advertisement> getComparatorBySortCriterium(SortBy sortby) {

		switch (sortby) {

		case PRICE:
			return new PriceComparator();
		case YEAR:
			return new YearComparator();
		case MODEL:
			return new ModelComparator();
		case REGION:
			return new RegionComparator();

		}

		return null;
	}

}
