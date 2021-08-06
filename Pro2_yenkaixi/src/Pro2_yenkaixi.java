import java.io.*;

public class Pro2_yenkaixi {
	public static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		double choice ;
		displayMenu();			
		do {									
			//displayMenu();			
			choice = getInteger("Enter choice: ", 0, 2);
			
			if (choice == 0) {
				System.out.print("\n");
				System.out.print("Goodbye!" + "\n");
				return;	
			}
			
			else if (choice == 1) {
				System.out.print("\n");
				feetInchesToCm();
				System.out.println("\n");
				displayMenu();			
			}
			
			else if (choice == 2) {
				System.out.print("\n");
				cmToFeetInches();
				System.out.println("\n");
				displayMenu();			
			}
			
			else if (choice != Integer.MIN_VALUE) {
				System.out.printf("ERROR: Input must be an integer in [0, 2]!\n");
				System.out.print("\n");
			}
			
			
			//else if (choice != 1 && choice !=2) {		
			//	choice = getInteger("Enter choice: ", 0, 2);
			//}
			
		} while (choice != 0);//while (choice != 0);
		if (choice == 0) {
			System.out.print("\n");
			System.out.print("Goodbye!" + "\n");
			return;	
		}
		
		
	} //end main
	
	//1
	public static void displayMenu () {
		System.out.println("   JAVA CONVERSION PROGRAM");
		System.out.println("0 - Quit");
		System.out.println("1 - Convert feet and inches to centimeters");
		System.out.println("2 - Convert centimeters to feet and inches");
		System.out.print("\n");
	}
	
	//2
	public static void feetInchesToCm() throws NumberFormatException, IOException {
		double feet = 0;
		double inches = 0;
		double total = 0;
		do {
			//System.out.print("\nEnter feet: ");
			//feet = Double.parseDouble(cin.readLine());
			feet = getDouble("Enter feet: ", 0, Double.POSITIVE_INFINITY);
			if (feet < 0) {
				System.out.println("ERROR: Input must be a real number in [0.00, infinity]!");
				System.out.print("\n");
			}
		} while(feet < 0);
		
		do {
			//System.out.print("Enter inches: ");
			//inches = Double.parseDouble(cin.readLine());
			inches = getDouble("Enter inches: ", 0, Double.POSITIVE_INFINITY);
			if (inches < 0) {
				System.out.println("ERROR: Input must be a real number in [0.00, infinity]!");
				System.out.print("\n");
			}
		} while (inches < 0);
		
		total = 2.54*(feet*12+inches);
		System.out.print("\n");
		System.out.printf("%.2f feet %.2f inches equals %.2f centimeters.", feet, inches, total);
	}
	
	//3
	public static void cmToFeetInches() throws NumberFormatException, IOException {
		double centimeters = 0;
		double inches = 0;
		double feet = 0;
		double decimal = 0;
		
		do {
			//System.out.print("\nEnter centimeters: ");
			//centimeters = Double.parseDouble(cin.readLine());
			centimeters = getDouble("Enter centimeters: ", 0, Double.POSITIVE_INFINITY);
			//System.out.println(centimeters);
			//inches = centimeters/2.54;
			//System.out.println(inches);
			//feet = inches/12;
			//System.out.println(feet);
			//System.out.println((int)feet);
			//feet = (int)feet;
			//decimal = inches - (feet*12);
			//System.out.println(decimal);
			//System.out.printf("%.2f centimeters equals %.2f feet %.2f inches", centimeters, feet, decimal);
			
		} while(centimeters < 0);
		if (centimeters > 0) {
			inches = centimeters/2.54;
			feet = inches/12;
			feet = (int)feet;
			decimal = inches - (feet*12);
			System.out.print("\n");
			System.out.printf("%.2f centimeters equals %.2f feet %.2f inches.", centimeters, feet, decimal);
			
		}
		
		
	}
	
	//4
	public static int getInteger(String prompt, int LB, int UB) {
		int input = 0;
		boolean valid;
		do {
			valid = true;
			System.out.print(prompt);
			try {
				input = Integer.parseInt(cin.readLine());
			}
			catch(NumberFormatException e) {
				valid = false;
				input = Integer.MIN_VALUE;
				System.out.printf("ERROR: Input must be an integer in [%d, infinity]!\n", LB);
				System.out.print("\n");
			}
			catch(IOException e) {
				valid = false;
				input = Integer.MIN_VALUE;
				System.out.printf("ERROR: Input must be an integer in [%d, infinity]!\n", LB);
				System.out.print("\n");
			}
			
		} while (valid = false);
		return input;
	}
	
	public static double getDouble(String prompt, double LB, double UB) {
		double input = 0;
		boolean valid;
		do {
			valid = true;
			System.out.print(prompt);
			try {
				input = Double.parseDouble(cin.readLine());
			}
			catch (NumberFormatException e){
				valid = false;
				input = -1;
				System.out.printf("ERROR: Input must be an real number in [%.2f, infinity]!\n", LB);
				System.out.print("\n");
			}
			catch(IOException e) {
				valid = false;
				input = -1;
				System.out.printf("ERROR: Input must be an real number in [%.2f, infinity]!\n", LB);
				System.out.print("\n");
			}
			
		} while (valid == false);
		return input;
	}
	
	
	

}