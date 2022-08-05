import java.util.ArrayList;
/**
 * 
 */

/**
 * @author 21030581
 *
 */
public class FoodMenuMain {
	
	private static ArrayList<FoodMenu> menuList = new ArrayList<>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuList.add(new FoodMenu("Chicken Rice", 5));
		menuList.add(new FoodMenu("Tonkotsu Ramen", 9));
		
		start();
	}
	
	private static void start() {
		
		int menuOption = -1;
		
		while (menuOption != 4) {
			menu();
			menuOption = Helper.readInt("Enter a menu option > ");
			
			if (menuOption == 1) {
				viewFoodMenu(menuList);
				
			} else if (menuOption == 2) {
				addToFoodMenu(menuList);
				
			} else if (menuOption == 3) {
				deleteFromFoodMenu(menuList);
				
			} else if (menuOption == 4) {
				System.out.println("Thank You!");
				
			} else {
				System.out.println("Invalid option entered!");
			}
			
		}
		
	}
	
	private static void menu() {
		Helper.line(50, "-");
		System.out.println("Food Menu Options");
		Helper.line(50, "-");
		System.out.println("1. View Food Menu");
		System.out.println("2. Add into Food Menu");
		System.out.println("3. Delete from Food Menu");
		System.out.println("4. Quit");
	}
	
	private static void viewFoodMenu(ArrayList<FoodMenu> menuList) {
		
		String output = String.format("%-20s %-5s\n", "Name", "Price");
		
		for (FoodMenu itemDetails : menuList) {
			output += String.format("%-25s", itemDetails.toString());
		}
		System.out.println(output);		
	}
	
	private static void addToFoodMenu(ArrayList<FoodMenu> menuList) {
		
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
	
	private static void deleteFromFoodMenu(ArrayList<FoodMenu> menuList) { 
		
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

}
