
public class GSM {
	
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	long outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	public void insertSimCard(String simMobileNumber){
		
		String firstTwoSymbols = simMobileNumber.substring(0,2);
		if(simMobileNumber.length() == 10 && firstTwoSymbols.equals("08")){
			hasSimCard = true;
			this.simMobileNumber = simMobileNumber;
		}
		
	}
	
	public void removeSimCard(){
		
		hasSimCard = false;
		simMobileNumber = "";
	}
	
	public void call(GSM callReciever, short duration){
		
		if((duration < 0) || (duration > Short.MAX_VALUE)){
			System.out.println("The duration is not valid! ");
		}
		
		if(this == callReciever){
			System.out.println("You can not make a call to yourself! ");
		}
		
		//if one of the gsms has no sim card:
		if(!(this.hasSimCard && callReciever.hasSimCard)){
			System.out.println("Caution! One of the phones doesn't have a sim card. The call can not be made!");
		}

		Call call = new Call();
		call.reciever = callReciever;
		call.caller = this;
		call.duration = duration;
		lastOutgoingCall = call;
		callReciever.lastIncomingCall = call;		
		outgoingCallsDuration += duration;
				
	}
	
	public double getSumForCall(){
		
		Call call = new Call();
		double sum = 0;
		
		if(this.outgoingCallsDuration > 0 && this.outgoingCallsDuration <= Long.MAX_VALUE){
			sum += outgoingCallsDuration*call.priceForAMinute;
		}
		else{
			System.out.println("There is no valid duration! ");
		}
		
		return sum;
		
	}
	
	public void printInfoForTheLastOutgoingCall(){
		GSM anotherGSM = new GSM();
		if(lastOutgoingCall != null && anotherGSM != null){
			System.out.println("Caller: " + this.model + " with the following phone number: " + this.simMobileNumber);
			System.out.println("Reciever: " + anotherGSM.model + " with the following phone number: " + anotherGSM.simMobileNumber);
			System.out.println("Duration: " + lastOutgoingCall.duration);
		}
		else{
			System.out.println("No last outgoing call exist! ");
		}
		
	}
	
	public void printInfoForTheLastIncomingCall(){
		GSM anotherGSM = new GSM();
		if(this.lastIncomingCall != null && anotherGSM != null){
			System.out.println("Caller: " + anotherGSM.model + " with the following phone number: " + anotherGSM.simMobileNumber);
			System.out.println("Reciever: " + this.model + " with the following phone number: " + this.simMobileNumber);
			System.out.println("Duration: " + lastIncomingCall.duration);
		}
		else{
			System.out.println("No last incoming call exist! ");
		}	
	}	
}
