import java.util.Date;

public class Stall {
	private String name;
	private String dateOfOperation;
	
	public Stall(String name, String dateOfOperation) {
		this.name = name;
		this.dateOfOperation = dateOfOperation;
	}
	
	public String toString() {
		String stallInfo = String.format("%-10s %-30s", name, dateOfOperation);
		
		return stallInfo;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDate() {
		return dateOfOperation;
	}

}
