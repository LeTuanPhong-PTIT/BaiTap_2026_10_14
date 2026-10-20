abstract class Payment{
	protected int amount;
	public Payment(int amount){
		this.amount = amount;
	}	
	abstract void processPayment();
	public void showAmount(){
		System.out.println("So tien: " + amount);
	}
}

interface Refundable{
	abstract void refund();
}

class CashPayment extends Payment{
	public CashPayment(int amount){
        super(amount);
    }
    @Override
	public void processPayment(){
		System.out.println("Thanh toan bang tien mat");
	}
}

class CardPayment extends Payment implements Refundable{
	public CardPayment(int amount){
        super(amount);
    }
    @Override
	public void processPayment(){
		System.out.println("Thanh toan bang the");
	}
	
	@Override
	public void refund(){
		System.out.println("Hoan tien thanh cong");
	}
}

public class Bai3{
	public static void main(String[] args){
		Payment[] payments = {
			new CashPayment(50000),
			new CardPayment(1000000)
		};

		for (Payment payment: payments){
			payment.showAmount();
			payment.processPayment();
            
            if (payment instanceof Refundable r){
                r.refund();
            }
		}
	}
}