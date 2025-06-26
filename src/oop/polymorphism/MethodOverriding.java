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
		WhatsAppV3 app = new WhatsAppV3();
		app.sendMessage();

	}

}
