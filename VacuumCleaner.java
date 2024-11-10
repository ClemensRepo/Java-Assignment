class VacuumCleaner {
	double suctionPower;

	public vacuumCleaner(String name, String model, double power, double suctionPower) {
		super(name, model, power);
        this.suctionPower = suctionPower;
	}

	public double getSuctionPower() {
		return suctionPower;
	}

	public void setSuctionPower(double suctionPower) {
		this.suctionPower = suctionPower;
	}
}