package Emran;

public class Phone {
	private String areaCode;
	private String number;
	public Phone(String areaCode, String number) {
		super();
		this.areaCode = areaCode;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Phone [areaCode=" + areaCode + ", number=" + number + "]";
	}
	

}
