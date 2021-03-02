package model;

public class Country {
	
	private String countryCode;
	private String countryName;
	private Continent continent;
	
	public Country(String countryCode, String countryName) {
		this.countryCode = countryCode;
		this.countryName = countryName;
	}
	
	public Country(String countryCode, String countryName, Continent continent) {
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.continent = continent;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Continent getContinent() {
		return continent;
	}
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	
	

}
