package c206;

import java.util.ArrayList;

public class Order_Main {

	public static void main(String[] args) {

		ArrayList<OrderClass> orderList = new ArrayList<OrderClass>();
		
		orderList.add(new OrderClass("Sushi", "S101", 5.00));
		orderList.add(new OrderClass("Chicken rice", "S102", 3.50));
		
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
		
		String output = String.format("%-20s %-10s %-10s\n", "ID", "NAME", "PRICE");
				output += retrieveAllOrders(orderList);
	    System.out.println(output);
		
	}
	private static OrderClass enterorder() {
		String id = Helper.readString("Enter item ID > ");
		String name = Helper.readString("Enter item name > ");
		Double price = Helper.readDouble("Enter price > ");
		
		
		OrderClass order = new OrderClass(name, id, price);
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
