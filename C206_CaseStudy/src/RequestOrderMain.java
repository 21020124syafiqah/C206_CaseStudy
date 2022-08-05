import java.util.ArrayList;

public class RequestOrderMain {
	private static ArrayList<RequestOrder> requestList = new ArrayList<RequestOrder>();

	public static void main(String[] args) {
		requestList.add(new RequestOrder(1,"Western Luck","S123","19-02-2005")) ;
		requestList.add(new RequestOrder(2,"Extremes","D153","19-03-2005"));
        start();
	}
	private static void start() {
		int option = 0;
		
		while (option != 4){
			menu();
			option = Helper.readInt("Enter option > ");
			if(option == 1) {
				addOrder(requestList);
			}else if(option == 2) {
				viewOrders(requestList);
			}else if(option == 3) {
				deleteOrders(requestList);
			}else if(option == 4) {
				System.out.println("Thank You!");
			}else {
				System.out.println("Invalid option entered!");
			}
			
		}
	}

	private static void deleteOrders(ArrayList<RequestOrder> requestList) {
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

	private static void viewOrders(ArrayList<RequestOrder> requestList) {
		String output = String.format("%-10s %-20s %-10s %-10s\n","Order ID","Name","ID","Request Date");
		for (RequestOrder r : requestList) {
			output += String.format("%50s\n", r.toString());
		}
		System.out.println(output);
	}

	private static void addOrder(ArrayList<RequestOrder> requestList) {
		String name = Helper.readString("Enter stall name > ");
		String id = Helper.readString("Enter stall ID > ");
		String date = Helper.readString("Enter date (dd-mm-yyyy) > ");
		if (requestList == null) {
			requestList.add(new RequestOrder(1,name,id,date));
		}else {
			requestList.add(new RequestOrder(requestList.size()+1,name,id,date));
		}
		System.out.println("Order Added Successfully!");		
	}

	private static void menu() {
		Helper.line(30, "=");
		System.out.println("Request Order Main");
		Helper.line(30, "=");
		System.out.println("1.Add Order");
		System.out.println("2.View Orders");
		System.out.println("3.Delete Orders");
		System.out.println("4.Quit");
		
	}

}
