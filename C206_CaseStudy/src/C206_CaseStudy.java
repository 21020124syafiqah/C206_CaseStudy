import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stall> stallList = new ArrayList<Stall>();
		
		stallList.add(new Stall("Western cuisine","17-9-2022"));
		stallList.add(new Stall("Japanese cuisine","26-8-2022"));
		stallList.add(new Stall("Chinese cuisine","9-8-2022"));
		
		
		int option = 0;
		
		while (option != 4) {
			
		}
	}
	
	public static void menu() {
		C206_CaseStudy.setHeader("Canteen Automation System");
		System.out.println("1.Add stall");
		System.out.println("2.View stall");
		System.out.println("3.Delete stall");
		System.out.println("");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

}
