package c206;

public class Order {
	private String  name;
	private String id;
	
	public Order(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id; 
	}
}
