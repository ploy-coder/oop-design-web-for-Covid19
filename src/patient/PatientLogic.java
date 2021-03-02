package patient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.City;
import model.CityEnum;
import model.Continent;
import model.ContinentEnum;
import model.Country;
import model.CountryEnum;
import model.InfectType;
import model.InfectTypeEnum;

public class PatientLogic implements IPatientLogic {
	
	List<PatientResult> resData = new ArrayList<PatientResult>();
	
	public PatientLogic() {
		
		Country counTH = new Country("TH", CountryEnum.Thailand.toString(),new Continent(1, ContinentEnum.Asia.toString()));
		Country counCN = new Country("CN", CountryEnum.Chaina.toString(),new Continent(1, ContinentEnum.Asia.toString()));
		Country counGER = new Country("GER", CountryEnum.Germany.toString(), new Continent(2, ContinentEnum.Europe.toString()));
		
		InfectType infInCountry1 = new InfectType(1,InfectTypeEnum.InCountry.toString(),counTH,new City(1,CityEnum.Bangkok.toString(), counTH));
		InfectType infInCountry30 = new InfectType(1,InfectTypeEnum.InCountry.toString(),counTH,new City(30,CityEnum.PrachuapKhiriKhan.toString(), counTH));
		InfectType infInCountry60 = new InfectType(1,InfectTypeEnum.InCountry.toString(),counTH,new City(60,CityEnum.SamutPrakan.toString(), counTH));
		InfectType infInCountry68 = new InfectType(1,InfectTypeEnum.InCountry.toString(),counTH,new City(68,CityEnum.SuratThani.toString(), counTH));
		
		InfectType infOutCountry1 = new InfectType(2,InfectTypeEnum.OutCountry.toString(),counCN,new City(1,CityEnum.Bangkok.toString(), counTH));	
		InfectType infOutCountry30 = new InfectType(2,InfectTypeEnum.OutCountry.toString(),counCN,new City(30,CityEnum.PrachuapKhiriKhan.toString(), counTH));	
		InfectType infOutCountry60 = new InfectType(2,InfectTypeEnum.OutCountry.toString(),counCN,new City(60,CityEnum.SamutPrakan.toString(), counTH));	
		InfectType infOutCountry68 = new InfectType(2,InfectTypeEnum.OutCountry.toString(),counCN,new City(68,CityEnum.SuratThani.toString(), counTH));	
				
		resData.add(new PatientResult(LocalDate.of(2020, 01, 26), 8, 73, "Female", 0, infOutCountry30, "Chinese tourists"));
		resData.add(new PatientResult(LocalDate.of(2020, 02, 04), 22, 33, "Male", 0, infOutCountry1, null));
		resData.add(new PatientResult(LocalDate.of(2020, 02, 04), 23, 45, "Male", 8, infInCountry30, "Taxi Driver"));
		resData.add(new PatientResult(LocalDate.of(2020, 02, 04), 25, 70, "Male", 0, infInCountry60, "Non-permanent hired driver"));
		resData.add(new PatientResult(LocalDate.of(2020, 02, 17), 35, 69, "Female", 22, infOutCountry1, "Was the contact of 22 confirmed patients"));						
	}

	
	@Override
	public List<PatientResult> getAll() {
		
		return resData;
	}

	@Override
	public PatientResult getByCaseNo(int caseNo) {
	
		List<PatientResult> rests = resData.stream()
				 .filter(item -> item.getCaseNo()==(caseNo))
				  .collect(
				    Collectors.mapping(
				      p -> new PatientResult(p.getConfirmDate(), p.getCaseNo(), 
				    		  p.getAge(), p.getGender(), p.getPatientFrom(), 
				    		  p.getInfectType(), p.getDetail()),
				      Collectors.toList()));
		
		return rests.get(0);
	}

	@Override
	public List<PatientResult> getByCondition(int infectId, int caseNo) {
		
		List<PatientResult> res = new ArrayList<PatientResult>();
		
		if(infectId==0 && caseNo !=0 ) {
			res = resData.stream()
				     .filter(item ->item.getCaseNo()==(caseNo))
				     .collect(Collectors.toList());
			
		}else if (caseNo==0 && infectId!=0) {
			res = resData.stream()
				     .filter(item -> item.getInfectType().getInfectTypeId()==(infectId))
				     .collect(Collectors.toList());
			
		}else if (caseNo!=0 && infectId!=0) {			
			res = resData.stream()
				     .filter(item -> 
				     			item.getInfectType().getInfectTypeId()==(infectId) 
				    		 && 
				    		 		item.getCaseNo()==(caseNo)
				    		 ).collect(Collectors.toList());
				     
		}
		
		return res;
	}

	@Override
	public OperationResult addPatient(PatientPO patientpo) {
		
		boolean isSucess = false;
		String message = "";
		
		if(patientpo==null) {
			message = "Object is Null";
			
			return new OperationResult(isSucess, message);
			
		}
		
		isSucess = true;
		message = "Add Patient Successful";
		
		return new OperationResult(isSucess, message);

	}

	@Override
	public OperationResult editPatient(PatientPO patientpo) {
		
		boolean isSucess = false;
		String message = "";
		
		if(patientpo==null || patientpo.getCaseNo()==0) {
			message = "Object is Null";
			
		}
		
		isSucess = true;
		message = "Edit Patient Successful";
		
		return new OperationResult(isSucess, message);
	}

	@Override
	public OperationResult deleteByCaseNo(int caseNo) {
		boolean isSucess = false;
		String message = "";
		
		if(caseNo == 0) {
			message = "Case No Not Found";
			
		}
		
		isSucess = true;
		message = "Delete Patient Successful";
		
		return new OperationResult(isSucess, message);
	}


	@Override
	public List<PatientResult> getRalationByCaseNo(int caseNo) {
		List<PatientResult> resPatientFrom = new ArrayList<PatientResult>();		

		resPatientFrom = resData.stream()
			     .filter(item -> item.getPatientFrom()==(caseNo))
			     .collect(Collectors.toList());
		
		return resPatientFrom;
	}
	
	

}
