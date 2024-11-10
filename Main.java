import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    Scanner sc = new Scanner(System.in);
    private static ArrayList<Electronics> electronicProducts= new ArrayList<>();

	public static void main(String[] args) {
        
        while(true) {
            
            System.out.println("1) Display all electronics");
            System.out.println("2) Add TV");
            System.out.println("3) Add vacuum cleaner");
            System.out.println("4) Update electronics");
            System.out.println("5) Delete electronics");
            System.out.println("6) Quit");
        
            int userChoice = sc.nextInt();
           
            if (userChoice == 1) {
                displayAll();
            }else if (userChoice == 2) {
                addTv();
            }else if (userChoice == 3) {
                addVacuumCleaner();
            }else if (userChoice == 4) {
                updateElectronics();
            }else if (userChoice == 5) {
                deleteElectronics();
            }else if (userChoice == 6) {
                break;
            }     
        
        }
        public static void displayAll() {

        }
	}
}