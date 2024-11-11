class Electronics {
	private static int count;

	protected String brand;
	protected String model;
	protected double price;
	protected double power;

	public Electronics() {
		this.brand = "";
		this.model = "N/A";
		this.price = 0;
		this.power = 0;
	}

	public Electronics(String brand, String model, double price, double power) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.power = power;
	}


	public String getbrand() {
		return brand;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double power() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public void display() {
	System.out.println("Brand: " + brand + "" + "Model: " + model + "" + "Price: " + price);	
	}
}