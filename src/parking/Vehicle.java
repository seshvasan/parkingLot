package parking;


public class Vehicle  {
	private String regNo;
	private String color;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String regNo, String color) {
		super();
		this.regNo = regNo;
		this.color = color;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
}
