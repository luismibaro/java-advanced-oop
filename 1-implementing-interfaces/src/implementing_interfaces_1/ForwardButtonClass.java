package implementing_interfaces_1;

public class ForwardButtonClass extends AbstractButtonClass implements ButtonPress {
	String forwardTo;
	String message;
	
	@Override
	public void buttonPress() {
		System.out.println("Forwarding " + this.message + " to " + this.forwardTo);
	}
	
	public void setForwardTo(String forwardTo) {
		this.forwardTo = forwardTo;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void onButtonHover() {};
}
