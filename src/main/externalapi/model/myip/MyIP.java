package main.externalapi.model.myip;

public class MyIP {

	private String ip;
	private String country;
	private String cc;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "MyIP [ip=" + ip + ", country=" + country + ", cc=" + cc + "]";
	}
}
