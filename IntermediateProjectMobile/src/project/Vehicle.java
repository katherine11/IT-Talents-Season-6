package project;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import enums.Color;
import enums.EngineType;
import enums.VehicleCategory;
import exceptions.VehicleException;

public class Vehicle {

	private static final int MIN_LENGTH_FOR_REGION = 4;
	private static final int MIN_LENGTH_FOR_CITY = 4;
	private static final int MIN_YEAR_OF_PRODUCEMENT = 1980;
	private static final int MIN_PRICE_FOR_VEHICLE = 500;
	private static final int MIN_LENGTH_FOR_BRAND = 3;
	private static final int MIN_LENGTH_FOR_MODEL = 3;
	private String brand;
	private String model;
	private int price;
	private Color color;
	private EngineType engineType;
	private String region;
	private String city;
	private int yearOfProducement;
	private VehicleCategory category;
	private Map<String, Set<String>> extraFeautures = new HashMap<String, Set<String>>();

	Vehicle(String brand, String model, int price, EngineType engineType, int yearOfProducement,
			VehicleCategory category, String city, String region) throws VehicleException {
		
		if (isValidString(brand) && brand.length() >= MIN_LENGTH_FOR_BRAND) {
			this.brand = brand;
		} else {
			throw new VehicleException("There is no such brand!");
		}

		if (isValidString(model) && model.length() >= MIN_LENGTH_FOR_MODEL) {
			this.model = model;
		} else {
			throw new VehicleException("There is no such model!");
		}

		if (price >= MIN_PRICE_FOR_VEHICLE) {
			this.price = price;
		} else {
			throw new VehicleException("There is no such price!");
		}

		if (engineType != null) {
			this.engineType = engineType;
		} else {
			throw new VehicleException("There is no such engine type!");
		}

		if (yearOfProducement >= MIN_YEAR_OF_PRODUCEMENT) {
			this.yearOfProducement = yearOfProducement;
		} else {
			throw new VehicleException("There is no such year!");
		}

		if (category != null) {
			this.category = category;
		} else {
			throw new VehicleException("There is no such category!");
		}
		
		if (isValidString(model) && city.length() >= MIN_LENGTH_FOR_CITY) {
			this.city = city;
		}
		else{
			throw new VehicleException("There is no such city!");
		}
		
		if(isValidString(model) && region.length() >= MIN_LENGTH_FOR_REGION){
			this.region = region;
		}
		else{
			throw new VehicleException("There is no such region!");
		}
	}

	public void addColour(Color color) throws VehicleException{
		if(color != null){
			this.color = color;
		}
		else{
			throw new VehicleException("There is no such colour!");
		}
	}
	
	public void addExtraFeatures(String category, Set<String> features) throws VehicleException {
		if (features != null) {
			if (!this.extraFeautures.containsKey(category)) {
				this.extraFeautures.put(category, features);
			}
			this.extraFeautures.get(category).addAll(features);
		} 
		else {
			throw new VehicleException("Cannot add extra features!");
		}
	}
	
	boolean isValidString(String model) {
		return model != null && model != "";
	}

	public String getRegion() {
		return region;
	}

	public String getCity() {
		return city;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	public int getYearOfProducement() {
		return yearOfProducement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((engineType == null) ? 0 : engineType.hashCode());
		result = prime * result + ((extraFeautures == null) ? 0 : extraFeautures.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + yearOfProducement;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		Vehicle other = (Vehicle)obj;
		return this.brand.equals(other.brand) && this.model.equals(other.model)
				&& this.category.equals(other.category) && this.city.equals(other.city)
				&& this.region.equals(other.region) && this.yearOfProducement == other.yearOfProducement
				&& areEqualFeatures(other.extraFeautures);
	}

	private boolean areEqualFeatures(Map<String, Set<String>> extraFeautures2) {
		if(extraFeautures2 != null){
			for (String key : extraFeautures2.keySet()) {
				if(key != null && !this.extraFeautures.containsKey(key)){
					return false;
				}
				else{
					for (String element : extraFeautures2.get(key)) {
						if(element != null && !this.extraFeautures.get(key).contains(element)){
							return false;
						}
					}
				}
			}
		return true;
		}
		return false;
	}

}
