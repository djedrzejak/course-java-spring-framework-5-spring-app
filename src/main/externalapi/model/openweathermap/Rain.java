package main.externalapi.model.openweathermap;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Rain {

	@JsonAlias("1h")
	private double oneH;
	@JsonAlias("3h")
	private double threeH;

	public double getOneH() {
		return oneH;
	}

	public void setOneH(double oneH) {
		this.oneH = oneH;
	}

	public double getThreeH() {
		return threeH;
	}

	public void setThreeH(double threeH) {
		this.threeH = threeH;
	}

	@Override
	public String toString() {
		return "Rain [oneH=" + oneH + ", threeH=" + threeH + "]";
	}
}
