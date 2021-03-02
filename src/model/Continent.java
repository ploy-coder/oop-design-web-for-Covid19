package model;

public class Continent {
	
	private int continentId;
	private String continentName;
	
	public Continent(int continentId, String continentName) {
		this.continentId = continentId;
		this.continentName = continentName;
	}
	
	public int getContinentId() {
		return continentId;
	}
	public void setContinentId(int continentId) {
		this.continentId = continentId;
	}
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	
	
	

}
