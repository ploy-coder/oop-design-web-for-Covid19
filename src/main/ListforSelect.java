package main;

import java.util.List;

import model.City;
import model.Continent;
import model.Country;
import model.InfectType;
import patientListDataForSelect.IListForSelect;
import patientListDataForSelect.ListForSelectLogic;

public class ListforSelect {
	
	public void getListInfectType() {		
		IListForSelect listInfect = new ListForSelectLogic();		
		List<InfectType> resAll = listInfect.getListInfectType();
		for (InfectType con: resAll) {
			System.out.println("InfectType ID:"+con.getInfectTypeId()+", InfectType:"+con.getInfectType());
		}	
	}
	
	public void getListCountry() {		
		IListForSelect listCoun = new ListForSelectLogic();		
		List<Country> resAll = listCoun.getListCountry();
		for (Country con: resAll) {
			System.out.println("Country Code:"+con.getCountryCode()+", Country Name:"+con.getCountryName());
		}	
	}
	
	public void getListContinent() {		
		IListForSelect listContinent = new ListForSelectLogic();		
		List<Continent> resAll = listContinent.getListContinent();
		for (Continent con: resAll) {
			System.out.println("Continent ID:"+con.getContinentId()+", Continent Name:"+con.getContinentName());
		}	
	}
	
	public void getListCity() {		
		IListForSelect listCity = new ListForSelectLogic();		
		List<City> resAll = listCity.getListCity();
		for (City con: resAll) {
			System.out.println("City ID:"+con.getCityId()+", City Name:"+con.getCityName());
		}	
	}

}
