import java.util.Date;

public class Stall {
	private String name;
	private Date dateOfOperation;
	
	public Stall(String name, Date dateOfOperation) {
		this.name = name;
		this.dateOfOperation = dateOfOperation;
	}
	public String getName() {
		return name;
	}
	public Date getDate() {
		return dateOfOperation;
	}

}
