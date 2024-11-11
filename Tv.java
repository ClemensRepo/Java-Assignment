class Tv extends Electronics {
	private int screenSize;

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
		System.out.println("Screen size " + screenSize );
	}
}