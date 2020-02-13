package model;

public class TempConverter {
	private double tempInCelcius;
	private double computeFar;

	public TempConverter() {
		super();
	}

	public TempConverter(double tempInCelcius) {
		//super();
		this.tempInCelcius = tempInCelcius;
		computeFar = setToFarenheit(tempInCelcius);
	}

	public double getTempInCelcius() {
		return tempInCelcius;
	}

	public void setTempInCelcius(double tempInCelcius) {
		this.tempInCelcius = tempInCelcius;
	}
	

	public double getComputeFar() {
		return computeFar;
	}

	public void setComputeFar(double tempInCelcius) {
		this.tempInCelcius = tempInCelcius;
		setToFarenheit(tempInCelcius);
	}

	
	public double setToFarenheit(double tempInCelcius) {
		final double NINEBYFIVE = 9/5;
		final int CONS = 32;
		double tempToFarenheit = ((tempInCelcius * NINEBYFIVE)+ CONS);
		return tempToFarenheit;
	}

	@Override
	public String toString() {
		return "TempConverter [tempInCelcius=" + tempInCelcius + ", computeFar=" + computeFar + "]";
	}

}
