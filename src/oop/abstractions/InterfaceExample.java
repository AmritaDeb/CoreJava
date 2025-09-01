package oop.abstractions;

//Implementation class 1
class CreditCardPayment implements Payment {
	
	@Override
  public void pay(double amount) {
      System.out.println("Paid " + amount + " using Credit Card");
  }
}

//Implementation class 2
class UpiPayment implements Payment {
@Override
public void pay(double amount) {
   System.out.println("Paid " + amount + " using UPI");
}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment();
		p1.pay(2500.50);

		Payment p2 = new UpiPayment();
		p2.pay(1200.00);
	}
}
