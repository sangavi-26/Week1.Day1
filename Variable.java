package week1.day1;

public class Variable {
	String mobileModel = "Pixel";
	Float mobileWeight = 34567.2f;
	int mobileCost = 10000;
	Boolean isFullyCharged =false;
	
	public void buyMobile() {
		 String mobileModel = "Android";
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		System.out.println(mobileCost);
		
		
	}
	public void checkSpec() {
		System.out.println(mobileModel);
		System.out.println(isFullyCharged);
		
	}
	
	

	public static void main(String[] args) {
		Variable var = new Variable();
		System.out.println(var.mobileCost);
		var.buyMobile();
		var.checkSpec();
		

	}

}
