import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Electronics> electronicProducts = new ArrayList<>();

    public static void main(String[] args) {
        
        while(true) {
            
            System.out.println("1) Display all electronics");
            System.out.println("2) Add TV");
            System.out.println("3) Add Computer");
            System.out.println("4) Update electronics");
            System.out.println("5) Delete electronics");
            System.out.println("6) Quit");
        
            int userChoice = sc.nextInt();
           
            if (userChoice == 1) {
                displayAllElectronics();
            }else if (userChoice == 2) {
                addTv();
            }else if (userChoice == 3) {
                addComputer();
            }else if (userChoice == 4) {
                updateElectronic();
            }else if (userChoice == 5) {
                deleteElectronic();
            }else if (userChoice == 6) {
                break;
            }else {
             System.out.println("You have entered an invalid option. Please try again!");   
            }  
        
        }

        private static void addTv() {

           Electronics p;

            System.out.println("Enter the brand");
            String brand = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the model");
            String model = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the price");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the power");
            double power = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the screen size");
            int screensize = sc.nextInt();

            p = new Tv(brand, model, price, power, screensize);    
            electronicProducts.add(p);
        }

        private static void addComputer() {

            Electronics p;
 
             System.out.println("Enter the brand");
             String brand = sc.nextLine();
             sc.nextLine();
             System.out.println("Enter the model");
             String model = sc.nextLine();
             sc.nextLine();
             System.out.println("Enter the price");
             double price = sc.nextDouble();
             sc.nextLine();
             System.out.println("Enter the power");
             double power = sc.nextDouble();
             sc.nextLine();
             System.out.println("Enter the CPU");
             double cpu = sc.nextLine();
             sc.nextLine();
             System.out.println("Enter the RAM");
             double ram = sc.nextDouble();
             sc.nextLine();
             System.out.println("Enter the SSD");
             double ssd = sc.nextDouble();
 
             p = new vacuumCleaner(brand, model, price, power, cpu, ram, ssd);          
             electronicProducts.add(p);  
        }

        private static void displayAllElectronics() {
            for(int i = 0; i < electronicProducts.size(); i++) {
                Electronics e = electronicProducts.get(i);
                System.out.println("Index of product is " + i);
                e.display();
            }
        }

        private static void updateElectronic() {
            displayAllElectronics();
            System.out.println("Key in the index of the electronic product you want to UPDATE");
            electronicProductIndex = sc.nextInt();
            sc.nextLine();
            Electronics e = electronicProducts.get(i);
            e.editElectronic(sc);

        }

        private static void deleteElectronic() {
            displayAllElectronics();
            System.out.println("Key in the index of the elctronic product you want to DELETE");
            electronicProductIndex = sc.nextInt();
            sc.nextLine();
            electronicProducts.remove(electronicProductIndex);
            displayAllElectronics(sc);
        }
	}
}