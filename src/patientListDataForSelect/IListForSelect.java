package patientListDataForSelect;

import java.util.List;

import model.City;
import model.Continent;
import model.Country;
import model.InfectType;

public interface IListForSelect {
	
	public List<InfectType> getListInfectType();
	public List<Country> getListCountry();
	public List<Continent> getListContinent();
	public List<City> getListCity();

}
