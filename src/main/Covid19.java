package main;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import patient.IPatientLogic;
import patient.OperationResult;
import patient.PatientLogic;
import patient.PatientPO;
import patient.PatientResult;

public class Covid19 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		IPatientLogic business = new PatientLogic();
		ListforSelect list = new ListforSelect();

		//	-------- GET By Case Number -----------
		System.out.println("=========== GET By Case Number =============");
		System.out.print("Do you want to Find Data By Case Number (Yes/No): ");
		String inputGetByCase = sc.next();
		if(inputGetByCase.equals("Yes")) {
			System.out.print("Please Enter Case Number: ");
			int caseNoInput = sc.nextInt();
			PatientResult resCaseNo = business.getByCaseNo(caseNoInput);		
			System.out.println("ConfirmDate:"+resCaseNo.getConfirmDate()+", No:"+resCaseNo.getCaseNo()
				+", Age:"+resCaseNo.getAge()+" Gender:"+resCaseNo.getGender()
				+", PatientFromNo:"+resCaseNo.getPatientFrom()+", InfectType:"+resCaseNo.getInfectType().getInfectType()
				+", From Country:"+resCaseNo.getInfectType().getCountry().getCountryName().toString()
				+", Live in City:"+resCaseNo.getInfectType().getCity().getCityName().toString()
				+", Detail:"+resCaseNo.getDetail());
	        
		}
		
	//	-------- GET For Find Patient From -----------
		System.out.println("=========== GET Ralation of Patient From =============");
		System.out.print("Do you want to Find Ralation Patient From By Case Number (Yes/No): ");
		String input = sc.next();
		if(input.equals("Yes")) {
			System.out.print("Please Enter Case Number: ");
			int caseNoInput = sc.nextInt();
			List<PatientResult> resPatienFrom = business.getRalationByCaseNo(caseNoInput);		
			for (PatientResult patFrom: resPatienFrom) {
				System.out.println("ConfirmDate:"+patFrom.getConfirmDate()+", No:"+patFrom.getCaseNo()
				+", Age:"+patFrom.getAge()+" Gender:"+patFrom.getGender()
				+", PatientFromNo:"+patFrom.getPatientFrom()+", InfectType:"+patFrom.getInfectType().getInfectType()
				+", From Country:"+patFrom.getInfectType().getCountry().getCountryName().toString()
				+", Live in City:"+patFrom.getInfectType().getCity().getCityName().toString()
				+", Detail:"+patFrom.getDetail());
	        }
		}
		
//		-------- GET BY Condition -----------
		System.out.println("=========== GET BY Condition =============");
		System.out.print("Do you want to Search Data By Infect Type or/and Case Number (Yes/No): ");
		String inputForSearchCondi = sc.next();
		if(inputForSearchCondi.equals("Yes")) {
			System.out.println("**if you don't want to search by infect type or case number you can put 0 in fill**");
			list.getListInfectType();
			
			System.out.print("Please Enter Infect Type ID or/and Case Number: ");
			int infectTypeInput = sc.nextInt();
			int caseNoInput = sc.nextInt();
			List<PatientResult> resCon = business.getByCondition(infectTypeInput, caseNoInput);
			for (PatientResult con: resCon) {
				System.out.println("ConfirmDate:"+con.getConfirmDate()+", No:"+con.getCaseNo()+", Age:"+con.getAge()+" Gender:"+con.getGender()+", PatientFromNo:"+con.getPatientFrom()
				+", InfectType:"+con.getInfectType().getInfectType()+", From Country:"+con.getInfectType().getCountry().getCountryName().toString()
				+", Live in City:"+con.getInfectType().getCity().getCityName().toString()
				+", Detail:"+con.getDetail());
	        }
		}
		
//		-------- GET All -----------
		System.out.println("=========== GET ALL =============");
		System.out.print("Do you want to List All Data (Yes/No): ");
		String inputForGetAll = sc.next();
		if(inputForGetAll.equals("Yes")) {
			List<PatientResult> resAll = business.getAll();
			for (PatientResult con: resAll) {
				System.out.println("ConfirmDate:"+con.getConfirmDate()+", No:"+con.getCaseNo()+", Age:"+con.getAge()+" Gender:"+con.getGender()+", PatientFromNo:"+con.getPatientFrom()
				+", InfectType:"+con.getInfectType().getInfectType()+", From Country:"+con.getInfectType().getCountry().getCountryName().toString()
				+", Live in City:"+con.getInfectType().getCity().getCityName().toString()
				+", Detail:"+con.getDetail());
	        }
		}
		
////		-------- ADD Data -----------
		System.out.println("=========== ADD DATA PATIENT =============");
		System.out.print("Do you want to Add new Data (Yes/No): ");
		String inputAddData = sc.next();
//		Data for test 2020-03-23,622,26,Male,0,1,GER,68,Comeback from Germay
		if(inputAddData.equals("Yes")) {
			
			System.out.print("enter ConfirmDate (YYYY-MM-DD): ");
			String confirmDateStr = sc.next();
			LocalDate confirmDateLd = LocalDate.parse(confirmDateStr);
			System.out.print("enter Case Number: ");
			int caseNo = sc.nextInt();
			System.out.print("enter Age: ");
			int age = sc.nextInt();
			System.out.print("enter Gender: ");
			String gender = sc.next();
			System.out.print("enter Patient From: ");
			int patientFrom = sc.nextInt();
			list.getListInfectType();
			System.out.print("enter Infect Type ID: ");
			int infectTypeId = sc.nextInt();
			list.getListCountry();
			System.out.print("enter Country Code:");
			String countryCode = sc.next();
			list.getListCity();
			System.out.print("enter City ID: ");
			int cityId = sc.nextInt();
			System.out.print("enter Detail: ");
			String detail = sc.next();
			
			PatientPO addPO = new PatientPO(LocalDate.of(confirmDateLd.getYear(),confirmDateLd.getMonthValue(),confirmDateLd.getDayOfMonth())
					, caseNo, age, gender, patientFrom, 
					infectTypeId,countryCode, cityId, detail);

			OperationResult resAdd = business.addPatient(addPO);
			System.out.println(resAdd.getMessage()+ " ");
		}
		
////		-------- EDIT Data -----------
		System.out.println("=========== EDIT DATA PATIENT =============");
		System.out.print("Do you want to Edit new Data (Yes/No): ");
		String inputEidtData = sc.next();
//		Data for test 2020-03-23,622,26,Male,0,1,GER,68,Comeback from Germay
		
		if(inputEidtData.equals("Yes")) {
			System.out.print("enter ConfirmDate (YYYY-MM-DD): ");
			String confirmDateStr = sc.next();
			LocalDate confirmDateLd = LocalDate.parse(confirmDateStr);
			System.out.print("enter Case Number: ");
			int caseNo = sc.nextInt();
			System.out.print("enter Age: ");
			int age = sc.nextInt();
			System.out.print("enter Gender: ");
			String gender = sc.next();
			System.out.print("enter Patient From: ");
			int patientFrom = sc.nextInt();
			list.getListInfectType();
			System.out.print("enter Infect Type ID: ");
			int infectTypeId = sc.nextInt();
			list.getListCountry();
			System.out.print("enter Country Code:");
			String countryCode = sc.next();
			list.getListCity();
			System.out.print("enter City ID: ");
			int cityId = sc.nextInt();
			System.out.print("enter Detail: ");
			String detail = sc.next();
			
			PatientPO editPO = new PatientPO(LocalDate.of(confirmDateLd.getYear(),confirmDateLd.getMonthValue(),confirmDateLd.getDayOfMonth())
					, caseNo, age, gender, patientFrom, 
					infectTypeId,countryCode, cityId, detail);
			
			OperationResult resEdit = business.editPatient(editPO);
			System.out.println(resEdit.getMessage()+ " ");
		}
		
//		-------- DELETE Data -----------
		System.out.println("=========== DELETE DATA PATIENT =============");
		System.out.print("Do you want to Search Data By Case Number (Yes/No): ");
		String inputDeleteByCaseNo = sc.next();
		if(inputDeleteByCaseNo.equals("Yes")) {
			System.out.print("Please Enter Case Number: ");
			int caseNoInput = sc.nextInt();
			OperationResult resDel = business.deleteByCaseNo(caseNoInput);
			System.out.println(resDel.getMessage()+ " ");
		}

		
	}

}
