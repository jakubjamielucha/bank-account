package bankaccount;

public class InSufficientFundException extends Exception {
	
	private String message;
	
	public InSufficientFundException (String message) {
		
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
