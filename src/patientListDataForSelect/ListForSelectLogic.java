package patientListDataForSelect;

import java.util.ArrayList;
import java.util.List;

import model.City;
import model.CityEnum;
import model.Continent;
import model.ContinentEnum;
import model.Country;
import model.CountryEnum;
import model.InfectType;
import model.InfectTypeEnum;

public class ListForSelectLogic implements IListForSelect{
	
	List<InfectType> resInf = new ArrayList<InfectType>();
	List<Country> resCoun = new ArrayList<Country>();
	List<Continent> resConti = new ArrayList<Continent>();
	List<City> resCity = new ArrayList<City>();
	
	
	public ListForSelectLogic() {
		
		resInf.add(new InfectType(1,InfectTypeEnum.InCountry.toString()));		
		resInf.add(new InfectType(2,InfectTypeEnum.OutCountry.toString()));		
		
		resCoun.add(new Country("TH", CountryEnum.Thailand.toString()));
		resCoun.add(new Country("CN", CountryEnum.Chaina.toString()));
		resCoun.add(new Country("GER", CountryEnum.Germany.toString()));
		
		resConti.add(new Continent(1, ContinentEnum.Asia.toString()));
		resConti.add(new Continent(1, ContinentEnum.Asia.toString()));
		resConti.add(new Continent(2, ContinentEnum.Europe.toString()));
		
		resCity.add(new City(1,CityEnum.Bangkok.toString()));	
		resCity.add(new City(30,CityEnum.PrachuapKhiriKhan.toString()));	
		resCity.add(new City(60,CityEnum.SamutPrakan.toString()));	
		resCity.add(new City(68,CityEnum.SuratThani.toString()));	
		
		
	}
	

	@Override
	public List<InfectType> getListInfectType() {
		// TODO Auto-generated method stub
		return resInf;
	}

	@Override
	public List<Country> getListCountry() {
		// TODO Auto-generated method stub
		return resCoun;
	}

	@Override
	public List<Continent> getListContinent() {
		// TODO Auto-generated method stub
		return resConti;
	}

	@Override
	public List<City> getListCity() {
		// TODO Auto-generated method stub
		return resCity;
	}
	
	
}
