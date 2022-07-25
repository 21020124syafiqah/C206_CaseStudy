import java.util.Date;

public class Stall {
	private String name;
	private String dateOfOperation;
	private String id;
	
	public Stall(String name, String id, String dateOfOperation) {
		this.name = name;
		this.dateOfOperation = dateOfOperation;
		this.id = id;
	}
	
	public String toString() {
		String stallInfo = String.format("%-20s %-10s %-10s", name, id, dateOfOperation);
		
		return stallInfo;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDate() {
		return dateOfOperation;
	}
	
	public String getId() {
		return id;
	}

}
