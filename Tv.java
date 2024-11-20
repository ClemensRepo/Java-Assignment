import java.util.Scanner;

class Tv extends Electronics {
	private int screenSize;

	public Tv() {
		super();
		this.screenSize = 0;
	}

	public Tv(String brand, String model, double price, double power, int screenSize) {
		super(brand, model, price, power);
        this.screenSize = screenSize;
	}


	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public void display() {
		super.display();
		System.out.println("Screen size: " + screenSize );
	}

	public void edit(Scanner sc) {
        super.editElectronic(sc); 

        System.out.println(("Enter the new screenSize or press ENTER to skip"));
        int screenSize = sc.nextInt();
        setScreenSize(screenSize > 0 ? screenSize : this.screenSize);
        
	}

}