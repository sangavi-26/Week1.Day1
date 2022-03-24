package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Making Call");
	}
	public void sendMessage() {
		System.out.println("Hello everyone");
	}
	public static void main(String[] args) {
		System.out.println("printing");
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMessage();
		
		
	}

}
