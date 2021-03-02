package patient;

public class OperationResult {
	
	private boolean isSuccessful;
	private String message;
	
	public OperationResult() {
		
	}
	
	public OperationResult (boolean isSuccessful, String message) {
		this.isSuccessful = isSuccessful;
		this.message = message;
	}

	public boolean isSuccessful() {
		return isSuccessful;
	}

	public void setSuccessful(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
