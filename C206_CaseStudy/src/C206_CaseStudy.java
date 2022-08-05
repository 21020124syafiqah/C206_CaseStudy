import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stall> stallList = new ArrayList<Stall>();
		
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

				int SOOption = Helper.readInt("Enter an option > ");
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

}}
