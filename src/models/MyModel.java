package models;

/**
 * A simple model which is used to store
 * the business logic and/or data.
 * @author iamshanedoyle
 */
public class MyModel {
	
	private String message;
	private int number;
	
	public MyModel() {
		this.message = "Hello World";
		this.number = 0;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public int getNumber() {
		return this.number;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
