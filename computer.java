class computer extends Electronics {
	private String cpu;
	private double ram;
	private double ssd;

	public computer(String brand, String model, double price, double power, String cpu, double ram, double ssd) {
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
		System.out.println("CPU: " + cpu + "" + "RAM: " + ram + "" + "SSD: " + ssd);
	}

}