
public class OrderClass {
	private String  name;
	private String id;
	private String stall;
	private Double price;
	
	public OrderClass(String name , String id,String stall, Double price) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.stall = stall;
	}
	public String toString() {
		String orderInfo = String.format("%-20s %-20s %-30s %-60s\n", name, id, stall, price);
		
		return orderInfo;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id; 
	}
	public String getStall() {
		return stall;
	public double getPrice() {
		return price;
	}
}
