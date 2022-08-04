package c206;

public class OrderClass {
	private String  name;
	private String id;
	private Double price;
	
	public OrderClass(String name , String id, Double price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String toString() {
		String orderInfo = String.format("%-20s %-10s %-10s\n", name, id, price);
		
		return orderInfo ;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id; 
	}
	public double getPrice() {
		return price;
	}
}
