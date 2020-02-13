package model;

public class FahrenheitToCelcius {
	
	private double temperature;
	private double computeCel;

	public FahrenheitToCelcius() {
		super();
	}

	public FahrenheitToCelcius(double temperature) {
		//super();
		this.temperature = temperature;
		computeCel = setToCelcius(temperature);
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemp(double temperature) {
		this.temperature = temperature;
	}

	
	public double getComputeCel() {
		return computeCel;
	}

	public void setComputeCel(double temperature) {
		this.temperature = temperature;
		setToCelcius(temperature);
	}
	
	public double setToCelcius(double temperature) {
		final double NINEBYFIVE = (double) 5/9;
		final int CONS = 32;
		double tempToCelcius = ((temperature - CONS) * NINEBYFIVE);
		return tempToCelcius;
	}

	@Override
	public String toString() {
		return "FahrenheitToCelcius [temperature=" + temperature + ", computeCel=" + computeCel + "]";
	}


}
