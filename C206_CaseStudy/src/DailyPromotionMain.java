import java.util.ArrayList;

public class DailyPromotionMain {
	private static ArrayList<DailyPromotion> dailyPromotion = new ArrayList<DailyPromotion>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dailyPromotion.add(new DailyPromotion("Chicken chop","M139", 4.50, 2.50));
		
		Helper.line(40, "=");
		System.out.println("Daily Promotion Menu");
		Helper.line(40, "=");
		start();
	}
	
	
	private static void start() {
		int option = 0;
		while (option != 4){
			menu();
			option = Helper.readInt("Enter option > ");
			if(option == 1) {
				viewPromotion(dailyPromotion);
			}else if(option == 2) {
				addPromotion(dailyPromotion);
			}else if(option == 3) {
				deletePromotion(dailyPromotion);
			}else if(option == 4) {
				System.out.println("Thank You!");
			}else {
				System.out.println("Invalid option entered!");
			}
			
		}
	}

	private static void viewPromotion(ArrayList<DailyPromotion> dailyPromotion) {
		String output = "";
		output += String.format("%-15s %-10s %-10s\n","NAME","ID","DISCOUNTED PRICE" );
		
		for(DailyPromotion p : dailyPromotion) {
			output += String.format("%-15s %-10s %-10.2f\n", p.getName(),p.getId(),(p.getPrice()-p.getDiscount()));
		}
		System.out.println(output);
	}
	private static void addPromotion(ArrayList<DailyPromotion> dailyPromotion) {
		String name = Helper.readString("Enter food name > ");
		String id = Helper.readString("Enter food ID > ");
		double price = Helper.readDouble("Enter the food price without discount");
		double discount = Helper.readDouble("Enter the food discount given");
		
		dailyPromotion.add(new DailyPromotion(name,id,price,discount));
		System.out.println("Promotion Added Successfully!");	
	}
	private static void deletePromotion(ArrayList<DailyPromotion> dailyPromotion) {
		Helper.line(60,"=");
		viewPromotion(dailyPromotion);
		Helper.line(60,"=");
		boolean isFound = false;
		String DelID = Helper.readString("Enter Food ID to delete > ");
			
			for(int i = 0; i < dailyPromotion.size(); i++) {
				String u = dailyPromotion.get(i).getId();
				if(DelID.equalsIgnoreCase(u)) {
					dailyPromotion.remove(i);
					isFound = true;
				}
			}
			if (isFound == false){
				System.out.println("Food ID does not exist");
			}
	}

	private static void menu() {
		System.out.println("1.View Daily Promotion");
		System.out.println("2.Add Daily Promotion");
		System.out.println("3.Delete Promotion");
		System.out.println("4.Quit");
			
		
	}
	
}
