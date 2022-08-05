import java.util.ArrayList;

public class C206_CaseStudy {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stall> stallList = new ArrayList<Stall>();
		ArrayList<FoodMenu> menuList = new ArrayList<FoodMenu>();
		ArrayList<RequestOrder> requestList = new ArrayList<RequestOrder>();
		ArrayList<DailyPromotion> dailyPromotion = new ArrayList<DailyPromotion>();
		ArrayList<OrderClass> orderList = new ArrayList<OrderClass>();
		
		stallList.add(new Stall("Western cuisine","S1", "17-09-2022"));
		stallList.add(new Stall("Japanese cuisine","S2", "26-08-2022"));
		stallList.add(new Stall("Chinese cuisine","S3", "09-08-2022"));
		
		menuList.add(new FoodMenu("Fried Chicken", 6));
		menuList.add(new FoodMenu("Tonkotsu Ramen", 5));
		menuList.add(new FoodMenu("Dumplings", 4));
		

		orderList.add(new OrderClass("S101","Sushi","Japanese Food Stall",5.00));
		orderList.add(new OrderClass("S102","Chicken rice", "Chinese Food Stall", 3.50));
		orderList.add(new OrderClass("S103","Butter Naan", "Indian Food Stall", 3.00));
		
		requestList.add(new RequestOrder(1,"Western Luck","S123","19-02-2005","onions")) ;
		requestList.add(new RequestOrder(2,"Extremes","D153","19-03-2005","tomatoes"));

		int option = 0;
		
		while (option != 4) {
			C206_CaseStudy.memberMenu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1) {
				//syafiqah & lovette
				
				C206_CaseStudy.CAmenu();
				int CAoption = Helper.readInt("Enter an option > ");
				
				if(CAoption == 1) {
					addStall(stallList, inputStall());
					
				}else if(CAoption == 2) {
					viewAllStalls(stallList);
					
				}else if(CAoption == 3) {
					viewAllStalls(stallList);
					String deleteID = Helper.readString("Enter stall ID to delete > ");
					deleteStalls(stallList, deleteID);
					
				} else if (CAoption == 4) {
					viewFoodMenu(menuList);
					
				} else if (CAoption == 5) {
					addToFoodMenu(menuList);
					
				} else if (CAoption == 6) {
					deleteFromFoodMenu(menuList);
					
				} else if (CAoption == 7) {
					System.out.println("Quit");
					
				} else {
					System.out.println("Invalid option");
				}
			}else if(option == 2) {
				//jesica & hongye
				SOmenu();
				int SOoption = Helper.readInt("Enter option > ");
				
				if(SOoption == 1) {
					addOrder(requestList);
					
				}else if(SOoption == 2) {
					viewOrders(requestList);
					
				}else if(SOoption == 3) {
					deleteOrders(requestList);
					
				}else if(SOoption == 4) {
						viewPromotion(dailyPromotion);
						
				}else if(SOoption == 5) {
						addPromotion(dailyPromotion);
						
				}else if(SOoption == 6) {
						deletePromotion(dailyPromotion);
						
				}else if(SOoption == 7) {
					System.out.println("Thank You!");
					
				}else {
					System.out.println("Invalid option entered!");
					}
			}else if(option == 3) {
				//Rishwin
				
				C206_CaseStudy.menu();
				int COption = Helper.readInt("Enter an option > ");
				
				if(COption == 1) {
					viewAllOrder(orderList);
				
				}else if(COption == 2) {
					addOrders(orderList, enterorder());
			
				}else if(COption == 3) {
					removeItem(orderList);;
				}else if(COption == 4) 
						payment();
				}else if(COption == 5) {
				System.out.println("Goodbye!");
				
				}else {
					System.out.println("Option not available");
				}
			}
			}	
			
	
	public static void memberMenu() {
		C206_CaseStudy.setHeader("Canteen Automation System");
		System.out.println("1. Canteen Administrator");
		System.out.println("2. Stall Operator");
		System.out.println("3. Customer");
	}

// =========================================CANTEEN ADMINISTRATOR CODE=========================================
	public static void CAmenu() {
		Helper.line(80, "=");
		System.out.println("1.Add stall");
		System.out.println("2.View stall");
		System.out.println("3.Delete stall");
		System.out.println("4. View Food Menu");
		System.out.println("5. Add into Food Menu");
		System.out.println("6. Delete from Food Menu");
		System.out.println("7.Quit");
	}
	
	private static void menu() {
		System.out.println("Canteen Automation System");
		System.out.println("1.View all orders");
		System.out.println("2.Add order");
		System.out.println("3.Delete order");
		System.out.println("4.Make Payment");
		System.out.println("5.Quit");	
		
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
// -----------------------------------------STALL CODE---------------------------------------------
	public static Stall inputStall() {
		String name = Helper.readString("Enter stall name > ");
		String id = Helper.readString("Enter stall ID > ");
		String date = Helper.readString("Enter date (dd-mm-yyyy) > ");
		
		
		Stall stall = new Stall(name, id, date);
		return stall;
	}
	
	public static void addStall(ArrayList<Stall> stallList, Stall stall) {
		stallList.add(stall);
	}
	
	
	public static String retrieveAllStalls(ArrayList<Stall> stallList) {
		String output = "";
		
		for (int i = 0; i < stallList.size(); i++) {
			output += String.format("%-90s \n", stallList.get(i).toString());
		}
		
		return output;
	}
	
	public static void viewAllStalls(ArrayList<Stall> stallList) {
		C206_CaseStudy.setHeader("STALL LIST");
		
		String output = String.format("%-20s %-10s %-10s\n", "NAME", "ID", "DATE OF OPERATION");
	    output += retrieveAllStalls(stallList);
	    System.out.println(output);
	}
	
	public static boolean deleteStalls(ArrayList<Stall> stallList, String deleteID ) {
		boolean isLoaned = false;
		
		for (int i = 0; i < stallList.size(); i++) {
			if(stallList.get(i).getId().equalsIgnoreCase(deleteID)) {
				String sure = Helper.readString("Are you sure you want to delete stall " + stallList.get(i).getId() + "? (y/n) > ");
				if(sure.equals("y")) {
					stallList.remove(i);
					System.out.println("Stall removed");
					isLoaned = true;
				}else if(sure.equals("n")){
					isLoaned = false;
				}else {
					System.out.println("Wrong input");
				}
		}
	}
		return isLoaned;
			
	}
	
// -----------------------------------------FOOD MENU CODE----------------------------------------------
	public static String retrieveAllMenu(ArrayList<FoodMenu> menuList) {
		String output = "";
		
		for (int i = 0; i < menuList.size(); i++) {
			output += String.format("%-25s", menuList.get(i).toString());
		}
		return output;
	}
	
	public static void viewFoodMenu(ArrayList<FoodMenu> menuList) {
		
		String output = String.format("%-20s %-5s\n", "Name", "Price");
		output += retrieveAllMenu(menuList);
		System.out.println(output);
	}
	
	public static void addToFoodMenu(ArrayList<FoodMenu> menuList) {
		
		String newName = Helper.readString("Enter the name of the new food item > ");
		
		for (int i = 0; i < menuList.size(); i++) {
			if (! menuList.get(i).getName().equalsIgnoreCase(newName)) {
				
				int newPrice = Helper.readInt("Enter price of the new food item (must be between $3 - $15) > ");
				
				if (newPrice >= 3 && newPrice <= 15) {
					menuList.add(new FoodMenu(newName, newPrice));
					System.out.println("Food item has been successfully added to the menu.");
					
				} else {
					System.out.println("Price entered does not meet the condition.");
				}
				
			} else {
				System.out.println("Cannot add duplicate food item into menu.");
			}	
			break;
		}
	}
	
	public static void deleteFromFoodMenu(ArrayList<FoodMenu> menuList) {
		
		String deleteItem = Helper.readString("Entert the name of the food item you wish to delete > ");
		boolean isDeleted = false;
		
		for (int i = 0; i < menuList.size(); i++) {
			if (menuList.get(i).getName().equalsIgnoreCase(deleteItem)) {
				char confirm = Helper.readChar("Confirm deletion of " + deleteItem + "? (y/n) > ");
				
				if (confirm == 'y' || confirm == 'Y') {
					menuList.remove(i);
					isDeleted = true;
					System.out.println("Food item has been successfully removed from the menu.");
					break;
				} 
			} 
		}
		
		if (isDeleted == false) {
			System.out.println("Cannot delete items that are not currently in the menu.");
		}
	}
	
// =========================================STALL OPERATOR CODE=========================================
	public static void SOmenu() {
		Helper.line(30, "=");
		System.out.println("Request Order Main / Daily Promotion Main");
		Helper.line(30, "=");
		System.out.println("1.Add Order");
		System.out.println("2.View Orders");
		System.out.println("3.Delete Orders");
		System.out.println("4.View Daily Promotion");
		System.out.println("5.Add Daily Promotion");
		System.out.println("6.Delete Promotion");
		System.out.println("7.Quit");
		
	}
	public static RequestOrder inputOrder(ArrayList<RequestOrder> requestList) {
		RequestOrder req1 = null;
		String name = Helper.readString("Enter stall name > ");
		String id = Helper.readString("Enter stall ID > ");
		String date = Helper.readString("Enter date (dd-mm-yyyy) > ");
		String ingredients = Helper.readString("Enter ingredients to order > ");
		if (requestList == null) {
			req1 = new RequestOrder(0,name,id,date,ingredients);
		}else {
			req1 = new RequestOrder(requestList.size()+1,name,id,date,ingredients);
		}
		
		return req1;

	}
	public static void addOrder(ArrayList<RequestOrder> requestList) {
		requestList.add(inputOrder(requestList));
		System.out.println("Order Added Successfully!");	
	}
	public static void viewOrders(ArrayList<RequestOrder> requestList) {
		String output = String.format("%-10s %-20s %-10s %-10s\n","Order ID","Name","ID","Request Date");
		for (RequestOrder r : requestList) {
			output += String.format("%50s\n", r.toString());
		}
		System.out.println(output);
	}
	public static void deleteOrders(ArrayList<RequestOrder> requestList) {
		Helper.line(60,"=");
		viewOrders(requestList);
		Helper.line(60,"=");
		Boolean found = false;
		int option = Helper.readInt("Enter order to delete > ");
		for (int r = 0; r < requestList.size(); r++) {
			if (option == requestList.get(r).getOrderId()) {
				found = true;
				requestList.remove(option-1);
				System.out.println("Successfully deleted");
			}
		}
		if (found = false) {
			System.out.println("Such order ID does not exist");
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
	
	private static String retrieveAllOrders(ArrayList<OrderClass> orderList) {
		String output = "";
		for (int i = 0; i < orderList.size(); i++) {
			output += String.format("%-90s\n", orderList.get(i).toString());
		}
		return output;
	}	
	
	private static void viewAllOrder(ArrayList<OrderClass> orderList) {
		Helper.line(60, "*");
		System.out.println("Order List");
		Helper.line(60, "*");
		
		String output = String.format("%-20s %-20s %-30s %-60s\n", "ID", "NAME", "STALL","PRICE");
				output += retrieveAllOrders(orderList);
	    System.out.println(output);
	}
	
	private static OrderClass enterorder() {
		String id = Helper.readString("Enter item ID > ");
		String name = Helper.readString("Enter item name > ");
		String stall = Helper.readString("Enter the stall name > ");
		Double price = Helper.readDouble("Enter price > ");
		
		OrderClass order = new OrderClass(id,name, stall, price);
		return order;
	}
	
	private static void addOrders(ArrayList<OrderClass> orderList, OrderClass order) {
		orderList.add(order);
		System.out.println("Item added!");
	}
	
	private static void removeItem(ArrayList<OrderClass> orderList) {
		System.out.println("DELETE ORDER");
        String id = Helper.readString("Enter Order ID > ");
    
        
        
        boolean found = false;
        for (int r = 0; r < orderList.size(); r++) {
			if (id.equalsIgnoreCase(orderList.get(r).getId())) {
				found = true;
				orderList.remove(id);
				System.out.println("Successfully deleted");
			}
		}
        if (found == false) {
            System.out.println("Invalid Order!");
          }
        
	
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