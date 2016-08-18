package project;

import exceptions.AdvertisementException;
import exceptions.VIPAdvertisementException;

public class VIPAdvertisement extends Advertisement {

	private static final int VIP_ADV_VALIDITY_IN_MONTHS = getMaxValidityInMonths()/2;

	public VIPAdvertisement(Vehicle vehicle) throws AdvertisementException {
		super(vehicle);
	}

	@Override
	public void setValidity(int validity) throws VIPAdvertisementException {
		if(validity == VIP_ADV_VALIDITY_IN_MONTHS){
			this.validity = validity;
		}
		else{
			throw new VIPAdvertisementException("Validity for a VIP advertisement must be " 
												+ VIP_ADV_VALIDITY_IN_MONTHS + " ! ");
		}
	}

}
