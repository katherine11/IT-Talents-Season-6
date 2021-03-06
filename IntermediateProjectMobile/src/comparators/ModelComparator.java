package comparators;

import java.util.Comparator;

import project.Advertisement;

public class ModelComparator implements Comparator<Advertisement> {

	@Override
	public int compare(Advertisement o1, Advertisement o2) {
		return o1.getVehicle().getModel().compareTo(o2.getVehicle().getModel());
	}

}
