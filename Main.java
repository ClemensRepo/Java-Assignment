import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Electronics> electronicProducts = new ArrayList<>();

    public static void main(String[] args) {
        
        while(true) {
            
            System.out.println("1)Display all electronics");
            System.out.println("2)Add TV");
            System.out.println("3)Add Computer");
            System.out.println("4)Update electronics");
            System.out.println("5)Delete electronics");
            System.out.println("6)Quit");
        
            int userChoice = sc.nextInt();
            sc.nextLine();
           
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
       
	}

    public static void addTv() {

           Electronics p;

            System.out.println("Enter the brand");
            String brand = sc.nextLine();
            System.out.println("Enter the model");
            String model = sc.nextLine();
            System.out.println("Enter the price");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the power");
            double power = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the screen size");
            int screensize = sc.nextInt();
            sc.nextLine();

            p = new Tv(brand, model, price, power, screensize);    
            electronicProducts.add(p);
        }

        public static void addComputer() {

            Electronics p;
 
             System.out.println("Enter the brand");
             String brand = sc.nextLine();
             sc.nextLine();
             System.out.println("Enter the model");
             String model = sc.nextLine();
             sc.nextLine();
             System.out.println("Enter the price");
             double price = sc.nextDouble();
             System.out.println("Enter the power");
             double power = sc.nextDouble();
             System.out.println("Enter the CPU");
             String cpu = sc.nextLine();
             System.out.println("Enter the RAM");
             double ram = sc.nextDouble();
             System.out.println("Enter the SSD");
             double ssd = sc.nextDouble();
 
             p = new Computer(brand, model, price, power, cpu, ram, ssd);          
             electronicProducts.add(p);  
        }

        public static void displayAllElectronics() {
            for(int i = 0; i < electronicProducts.size(); i++) {
                Electronics e = electronicProducts.get(i);
                System.out.println("Index of product is: " + i);
                e.display();
            }
        }

        public static void updateElectronic() {
            displayAllElectronics();
            System.out.println("Key in the index of the electronic product you want to UPDATE");
            int electronicProductIndex = sc.nextInt();
            sc.nextLine();
            Electronics e = electronicProducts.get(electronicProductIndex);
            e.editElectronic(sc);

        }

        public static void deleteElectronic() {
            displayAllElectronics();
            System.out.println("Key in the index of the elctronic product you want to DELETE");
            int electronicProductIndex = sc.nextInt();
            sc.nextLine();
            electronicProducts.remove(electronicProductIndex);
            displayAllElectronics();
        }
}