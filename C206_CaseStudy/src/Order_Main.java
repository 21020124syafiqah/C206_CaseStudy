
import java.util.ArrayList;

public class Order_Main {

	public static void main(String[] args) {

		ArrayList<OrderClass> orderList = new ArrayList<OrderClass>();
		ArrayList<Stall> stallList = new ArrayList<Stall>();
		
		orderList.add(new OrderClass("Sushi", "S101", "Japanese Food Stall",5.00));
		orderList.add(new OrderClass("Chicken rice", "S102", "Chinese Food Stall", 3.50));
		orderList.add(new OrderClass("Butter Naan", "S103", "Indian Food Stall", 3.00));
//		
//		 stallList.add(new Stall("Japanese Food Stall", "J1001",  LocalDate.of(2020, Month.OCTOBER, 21);
//		 stallList.add(new Stall("Chinese Food Stall", "J1002",  LocalDate.of(2020, Month.OCTOBER, 21);
//		 stallList.add(new Stall("Indian Food Stall", "J1003",  LocalDate.of(2020, Month.OCTOBER, 21);
//		
		int option = -1;
		while (option != 5) {
			Order_Main.menu();
			option = Helper.readInt("Enter an option > ");
			
			if(option == 1)  {
				viewAllOrder(orderList);
			}else if(option == 2) {
				addOrders(orderList, enterorder());
			}else if(option == 3) {
				payment();
			}else if(option == 4) {
				System.out.println("Thank you!");
			}else {
				System.out.println("Invalid option!");
			}
			
		}
	}

	
	private static void menu() {
		System.out.println("Canteen Automation System");
		System.out.println("1.View all orders");
		System.out.println("2.Add order");
		System.out.println("3.View payment method");
		System.out.println("4.Payment");	
		System.out.println("5.Quit");
		
	}
	
	private static String retrieveAllOrders(ArrayList<OrderClass> orderList) {
		String output = "";
		for (int i = 0; i < orderList.size(); i++) {
			output += String.format("%-90s\n", orderList.get(i).toString());
		}
		return output;
		
	}
	
	private static void viewAllOrder(ArrayList<OrderClass> orderList) {
		System.out.println("Order List");
		Helper.line(60, "*");
		
		String output = String.format("%-20s %-20s %-30s %-60s\n", "ID", "NAME", "STALL","PRICE");
				output += retrieveAllOrders(orderList);
	    System.out.println(output);
		
	}
	private static OrderClass enterorder() {
		String id = Helper.readString("Enter item ID > ");
		String name = Helper.readString("Enter item name > ");
		String stall = Helper.readString("Enter stall name");
		Double price = Helper.readDouble("Enter price > ");
		
		
		OrderClass order = new OrderClass(name, id, stall, price);
		return order;
	}

	private static void addOrders(ArrayList<OrderClass> orderList, OrderClass order) {
		orderList.add(order);
		System.out.println("Item added!");
		
	}
	

	private static void payment() {
		System.out.println("PayNow");
		String name = Helper.readString("Enter name: ");
		System.out.println("Enter this phone number to paynow: 86512390");
		int phoneNum = Helper.readInt("Enter mobile Number: ");
		
		if(phoneNum == 86512390) {
			System.out.println("Payment Successful");
			
		}else {
			System.out.println("Payment failed!");
		}
		
		
		
	}
}
