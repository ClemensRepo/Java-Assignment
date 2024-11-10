class Tv {
	int screenSize;
	public screenSize(String name, String model, double power, int screenSize) {
		super(name, model, power);
        this.screenSize = screenSize;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
}