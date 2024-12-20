import java.util.Scanner;

class Computer extends Electronics {
	private String cpu;
	private double ram;
	private double ssd;

	public Computer() {
		super();
		this.cpu = "N/A";
		this.ram = 0;
		this.ssd = 0;
	}

	public Computer(String brand, String model, double price, double power, String cpu, double ram, double ssd) {
		super(brand, model, price, power);
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	public double getSsd() {
		return ssd;
	}

	public void setSsd(double ssd) {
		this.ssd = ssd;
	}

	public void display() {
		super.display();
		System.out.println("CPU: " + cpu + " " + "RAM: " + ram + " " + "SSD: " + ssd);
	}

	public void edit(Scanner sc) {
        super.editElectronic(sc); 


        System.out.println(("Enter the new cpu or press ENTER to skip"));
        String cpu = sc.nextLine();
        setCpu(cpu.length() > 0 ? cpu : this.cpu);
        
		System.out.println("Enter the new ram or press ENTER to skip");
        double ram = sc.nextDouble();
		sc.nextLine();
        setRam (ram > 0 ? ram : this.ram);

        System.out.println("Enter the new ssd or press ENTER to skip");
        double ssd = sc.nextDouble();
		sc.nextLine();
        setSsd ( ssd > 0 ? ssd : this.ssd);
    }
	
}