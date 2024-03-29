/**
 * 
 */

/**
 * @author 21030581 Peh Yu Xuan, Lovette
 *
 */
public class FoodMenu {
	
	private String name;
	private int price;
	
	public FoodMenu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		String output = String.format("%-20s $%-5d\n", name.toUpperCase(), price);
		
		return output;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}

