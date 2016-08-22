package project;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import comparators.ModelComparator;
import comparators.PriceComparator;
import comparators.RegionComparator;
import comparators.YearComparator;
import enums.SortBy;
import exceptions.UserException;

public class Normaluser extends User {

	public Normaluser(String email, String password, String fullName, String telephone, String address, int age)
			throws UserException {
		super(email, password, fullName, telephone, address, age);
	}

	@Override
	public void deleteAdvertisement(Advertisement advertisement) {
		// TODO Auto-generated method stub
		
	}

	public SortedSet<Advertisement> searchAdvertisement(Advertisement advertisement, SortBy sortBy) {
		
		Comparator<Advertisement> resultComparator = getComparatorBySortCriterium(sortBy);
		SortedSet<Advertisement> result = new TreeSet<Advertisement>(resultComparator);
		
		
		for (Advertisement advertisement2 : advertisements) {
			if(advertisement2.equals(advertisement)){
				result.add(advertisement2);
			}
		}
		
		return result;
		
	}
	
	private Comparator<Advertisement> getComparatorBySortCriterium(SortBy sortby){
		
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
