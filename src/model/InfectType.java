package model;

public class InfectType {
	
	private int infectTypeId;
	private String infectType;
	private Country country;
	private City city;
	
	public InfectType(int infectTypeId, String infectType) {
		this.infectTypeId = infectTypeId;
		this.infectType = infectType;
	}
	
	public InfectType(int infectTypeId, String infectType, Country country, City city) {
		this.infectTypeId = infectTypeId;
		this.infectType = infectType;
		this.country = country;
		this.city = city;
	}
	
	public int getInfectTypeId() {
		return infectTypeId;
	}
	public void setInfectTypeId(int infectTypeId) {
		this.infectTypeId = infectTypeId;
	}
	public String getInfectType() {
		return infectType;
	}
	public void setInfectType(String infectType) {
		this.infectType = infectType;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	

}
