class Electronics {
	private static int count;

	protected String name;
	protected String model;
	protected double power;

	public Electronics() {
		this.name = "";
		this.model = "N/A";
		this.power = 0;
	}

	public Electronics(String name, String model, double power) {
		this.name = name;
		this.model = model;
		this.power = power;
	}


	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
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


}