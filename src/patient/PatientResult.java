package patient;

import java.time.LocalDate;

import model.InfectType;

public class PatientResult {
	
	private LocalDate confirmDate;
	private int caseNo;
	private int age;
	private String gender;
	private int patientFrom;
	private InfectType infectType;
	private String detail;

	public PatientResult(LocalDate confirmDate, int caseNo, int age, String gender, int patientFrom, 
			InfectType infectType, String detail) {
		
		this.confirmDate = confirmDate;
		this.caseNo = caseNo;
		this.age = age;
		this.gender = gender;
		this.patientFrom = patientFrom;
		this.infectType = infectType;
		this.detail = detail;
		
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
	public InfectType getInfectType() {
		return infectType;
	}
	public void setInfectType(InfectType infectType) {
		this.infectType = infectType;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}