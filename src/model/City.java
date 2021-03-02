package model;

public class City {
	
	private int cityId;
	private String cityName;
	private Country country;
	
	public City (int cityId, String cityName) {
		this.cityId = cityId;
		this.cityName = cityName;
	}
	
	public City (int cityId, String cityName, Country country) {
		this.cityId = cityId;
		this.cityName = cityName;
		this.country = country;
	}
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country countryCode) {
		this.country = countryCode;
	}
	
	

}
