
public class RequestOrder {
	private int orderId ;
	private String name;
	private String id;
	private String requestDate;
	private String ingredients;
	
	public RequestOrder (int orderId, String name, String id, String requestDate, String ingredients) {
		this.orderId = orderId;
		this.name = name;
		this.id = id;
		this.requestDate = requestDate;
		this.ingredients = ingredients;
	}
	
	public String toString() {
		String requestInfo = String.format("%-10s %-20s %-10s %-20s %-10s",orderId, name, id, requestDate, ingredients);
		
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
	
	public String getIngredients() {
		return ingredients;
	}


	public String getRequestDate() {
		return requestDate;
	}

	

}
