import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stall> stallList = new ArrayList<Stall>();
		ArrayList<RequestOrder> requestList = new ArrayList<RequestOrder>();
		
		stallList.add(new Stall("Western cuisine","S1", "17-09-2022"));
		stallList.add(new Stall("Japanese cuisine","S2", "26-08-2022"));
		stallList.add(new Stall("Chinese cuisine","S3", "09-08-2022"));
		
		
		
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
					deleteStalls(stallList);
					
				}else if(CAoption == 4) {
					System.out.println("Goodbye!");
					
				}else {
					System.out.println("Invalid option!");
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
				//rishwin

				int COption = Helper.readInt("Enter an option > ");
			}else if(option == 4) {
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
	
	public static void CAmenu() {
		System.out.println("1.Add stall");
		System.out.println("2.View stall");
		System.out.println("3.Delete stall");
		System.out.println("4.Quit");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
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
	
	public static void deleteStalls(ArrayList<Stall> stallList) {
		String deleteID = Helper.readString("Enter stall ID to delete > ");
		for (int i = 0; i < stallList.size(); i++) {
			if(stallList.get(i).getId().equalsIgnoreCase(deleteID)) {
				String sure = Helper.readString("Are you sure you want to delete stall " + stallList.get(i).getId() + "? (y/n) > ");
				if(sure.equals("y")) {
					stallList.remove(i);
					System.out.println("Stall removed");
				}else if(sure.equals("n")){
					
				}else {
					System.out.println("Wrong input");
				}
		}
	}
	}

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
	public static void addOrder(ArrayList<RequestOrder> requestList) {
		String name = Helper.readString("Enter stall name > ");
		String id = Helper.readString("Enter stall ID > ");
		String date = Helper.readString("Enter date (dd-mm-yyyy) > ");
		
		requestList.add(new RequestOrder(requestList.size()+1,name,id,date));
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
			System.out.println("Such order id does not exist");
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
}

