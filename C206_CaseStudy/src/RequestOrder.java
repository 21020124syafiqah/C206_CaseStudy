
public class RequestOrder {
	private int orderId ;
	private String name;
	private String id;
	private String requestDate;
	
	public RequestOrder (int orderId, String name, String id, String requestDate) {
		this.id = id;
		this.name = name;
		this.id = id;
		this.requestDate = requestDate;
	}
	
	public String toString() {
		String requestInfo = String.format("%-10s %-20s %-10s %-10s",orderId, name, id, requestDate);
		
		return requestInfo;
	}
	
	public int getOrderId() {
		return orderId;
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
