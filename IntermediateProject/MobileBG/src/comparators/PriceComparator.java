package comparators;

import java.util.Comparator;

import project.Advertisement;

public class PriceComparator implements Comparator<Advertisement> {

	@Override
	public int compare(Advertisement o1, Advertisement o2) {
		return o1.getVehicle().getPrice() - o2.getVehicle().getPrice();
	}

}
