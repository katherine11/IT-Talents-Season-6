
public class GSMDemo {
	public static void main(String[] args) {
		
		GSM samsung = new GSM();
		samsung.model = "Samsung";
		samsung.insertSimCard("0854799315");
		System.out.println(samsung.simMobileNumber + " " + samsung.hasSimCard);
		
//		samsung.removeSimCard();
//		System.out.println(samsung.simMobileNumber + " " + samsung.hasSimCard);
		samsung.insertSimCard("0896785412");
		
		GSM iPhone = new GSM();
		iPhone.model = "Iphone";
		iPhone.insertSimCard("0876785212");
		System.out.println(iPhone.hasSimCard + " " + iPhone.simMobileNumber);
		iPhone.call(samsung, (short)2);

		System.out.println(iPhone.lastOutgoingCall.duration);
		System.out.println(iPhone.outgoingCallsDuration);
		
		iPhone.printInfoForTheLastOutgoingCall();
//		System.out.println(samsung.getSumForCall());
		
		
		
	}

}
