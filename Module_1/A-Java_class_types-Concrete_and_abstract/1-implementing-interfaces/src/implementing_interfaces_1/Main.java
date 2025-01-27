package implementing_interfaces_1;

public class Main {
	public static void main(String[] args) {
		/*
		SendButtonClass sendButton = new SendButtonClass();
		sendButton.setCaption("Send");
		sendButton.setSendTo("test@example.com");
		sendButton.setMessage("This is a test message");
		sendButton.buttonPress();
		*/
		
		ForwardButtonClass forwardButton = new ForwardButtonClass();
		forwardButton.setCaption("Forward");
		forwardButton.setForwardTo("x@y.com");
		forwardButton.setMessage("Hello World");
		forwardButton.buttonPress();
	}
}
