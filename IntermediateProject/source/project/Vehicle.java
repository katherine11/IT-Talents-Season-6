package project;

import java.util.Set;

import enums.Brand;
import enums.Color;
import enums.EngineType;
import enums.VehicleCategory;

public class Vehicle {
	
	private Brand brand;
	private String model;
	private int price;
	private Color color;
	private EngineType engineType;
	private String region;
	private String city;
	private int yearOfProducement;
	private VehicleCategory category;
	private Set<ExtraFeatures> extraFeautures;
	
	
	public Brand getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public String getRegion() {
		return region;
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
		
		Vehicle other = (Vehicle) obj;
		
		return this.brand.equals(other.brand) && this.color.equals(other.color) && 
				this.yearOfProducement == other.yearOfProducement && this.engineType == other.engineType;
	}
	
	
	
	

}
