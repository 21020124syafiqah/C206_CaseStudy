
public class RequestOrder {
	private String name;
	private String id;
	private String requestDate;
	
	public RequestOrder (String name, String id, String requestDate) {
		this.name = name;
		this.id = id;
		this.requestDate = requestDate;
	}
	
	public String toString() {
		String requestInfo = String.format("%-20s %-10s %-10s", name, id, requestDate);
		
		return requestInfo;
	}

	public String getName() {
		return name;
	}


	public String getId() {
		return id;
	}


	public String getRequestDate() {
		return requestDate;
	}

	

}
