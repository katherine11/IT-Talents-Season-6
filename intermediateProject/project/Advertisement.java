package project;

import java.time.LocalDate;

import exceptions.AdvertisementException;

public abstract class Advertisement {

	private static final int MAX_VALIDITY_IN_MONTHS = 12;
	private Vehicle vehicle;
	private LocalDate dateOfPublishing;
	protected int validity = MAX_VALIDITY_IN_MONTHS;
	
	
	public Advertisement(Vehicle vehicle) throws AdvertisementException {
		if(vehicle != null){
			this.vehicle = vehicle;
		}
		else {
			throw new AdvertisementException("A valid vehicle is required!");
		}
				
		this.dateOfPublishing = LocalDate.now();
		System.out.println("Date of pubilishing: " + dateOfPublishing);
		
	}
	
	public static int getMaxValidityInMonths() {
		return MAX_VALIDITY_IN_MONTHS;
	}

	public void setValidity(int validity) throws AdvertisementException {
		
		if (validity == MAX_VALIDITY_IN_MONTHS) {
			this.validity = validity;
		}
		else{
			throw new AdvertisementException("There is a fix validity of " + MAX_VALIDITY_IN_MONTHS + " months!");
		}
				
	}

	boolean isExpired(){
		
		if (dateOfPublishing.plusMonths(MAX_VALIDITY_IN_MONTHS) == LocalDate.now()) {
			System.out.println("The advertisement has been already expired! You must publish another one!");
			return true;
		}
		
		return false;
		
	}
	
	
	
	
	
}
