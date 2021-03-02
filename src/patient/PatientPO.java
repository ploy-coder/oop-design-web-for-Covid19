package patient;

import java.time.LocalDate;

public class PatientPO {
	
	private LocalDate confirmDate;
	private int caseNo;
	private int age;
	private String gender;
	private int patientFrom;
	private int infectTypeId;
	private String detail;
	
	private String infectTypeName;
	private String countryCode;
	private int cityId;
	
	public PatientPO(LocalDate confirmDate, int caseNo, int age, String gender, int patientFrom, 
			int infectTypeId,String countryCode, int cityId, String detail) {
		
		this.confirmDate = confirmDate;
		this.caseNo = caseNo;
		this.age = age;
		this.gender = gender;
		this.patientFrom = patientFrom;
		this.infectTypeId = infectTypeId;
		this.detail = detail;
		this.countryCode = countryCode;
		this.cityId = cityId;
		
	}
	
	public LocalDate getConfirmDate() {
		return confirmDate;
	}
	public void setConfirmDate(LocalDate confirmDate) {
		this.confirmDate = confirmDate;
	}
	public int getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPatientFrom() {
		return patientFrom;
	}
	public void setPatientFrom(int patientFrom) {
		this.patientFrom = patientFrom;
	}
	
	public int getInfectTypeId() {
		return infectTypeId;
	}

	public void setInfectTypeId(int infectTypeId) {
		this.infectTypeId = infectTypeId;
	}

	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getInfectTypeName() {
		return infectTypeName;
	}

	public void setInfectTypeName(String infectTypeName) {
		this.infectTypeName = infectTypeName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	
	
}