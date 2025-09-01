package oop.polymorphism;

class WhatsAppV1{
	void sendMessage() {
		System.out.println("Message sent and got single tick");
	}
}

class WhatsAppV2 extends WhatsAppV1{
	@Override
	void sendMessage() {
		System.out.println("Message delivered and got double tick");
	}
}

class WhatsAppV3 extends WhatsAppV2{
	@Override
	void sendMessage() {
		System.out.println("Message seen and got blue tick");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		WhatsAppV2 appV2 = new WhatsAppV2();
		appV2.sendMessage();
		
		WhatsAppV3 appV3 = new WhatsAppV3();
		appV3.sendMessage();

		WhatsAppV2 appV23 = new WhatsAppV3();
		appV23.sendMessage();				// Method overriding
	}

}
