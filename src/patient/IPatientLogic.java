package patient;

import java.util.List;

public interface IPatientLogic {
	
	public List<PatientResult> getAll();
	
	public PatientResult getByCaseNo(int caseNo);

	public List<PatientResult> getByCondition(int infectId, int caseNo);
	
	public List<PatientResult> getRalationByCaseNo(int caseNo);
	
	public OperationResult addPatient(PatientPO patientpo);
	
	public OperationResult editPatient(PatientPO patientpo);
	
	public OperationResult deleteByCaseNo(int caseNo);
	

}
