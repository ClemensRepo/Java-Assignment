import java.util.Scanner;

class Electronics {
	private static int count;

	protected String brand;
	protected String model;
	protected double price;
	protected double power;

	public Electronics() {
		this.brand = "N/A";
		this.model = "N/A";
		this.price = 0;
	}

	public Electronics(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}


	public String getbrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double price() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
	System.out.println("Brand: " + brand + "" + "Model: " + model + "" + "Price: " + price);	
	}

	public void edit(Scanner sc) {
		System.out.println("Enter the new brand or press [ENTER] to remain unchanged");
        String brand = sc.nextLine();
        setBrand( brand.length() > 0 ? brand : this.brand);

        System.out.println("Enter the new model or press [ENTER] to skip");
        String model = sc.nextLine();
        setModel( model.length() > 0 ? model : this.model);

        System.out.println("Enter the new price or press [ENTER] to skip");
        String price = sc.nextDouble();
        setPrice(price.length() > 0 ? Double.parseDouble(price) : this.price);
        
	}

	public abstract double calculateSalesTax(); 
    
	public double getSalesTax() {
        return calculateSalesTax();
    }
} 