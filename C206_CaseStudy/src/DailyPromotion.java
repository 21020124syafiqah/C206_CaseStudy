
public class DailyPromotion {
	private String name;
	private String id;
	private double Price;
	private double discount;

	public DailyPromotion(String name, String id, double price, double discount) {
		this.name = name;
		this.id = id;
		Price = price;
		this.discount = discount;
	

	}
	
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public double getPrice() {
		return Price;
	}

	public double getDiscount() {
		return discount;
	}
}
