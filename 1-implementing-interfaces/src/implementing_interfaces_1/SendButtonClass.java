package implementing_interfaces_1;

public class SendButtonClass extends AbstractButtonClass implements ButtonPress {
	String sendTo;
	String message;
	
	@Override
	public void buttonPress() {
		System.out.println("Sending " + this.message + " to " + this.sendTo);
	}
	
	@Override
	public void onButtonHover(){};
	
	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}


