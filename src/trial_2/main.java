package trial_2;

public class main {

	public static void main(String[] args) {

	client c = new client("amr",1,10000, 15);
	
	c.balanceInquiry();
	c.deposit(5000);
	c.balanceInquiry();
	c.withDraw(5000);
	c.balanceInquiry();
	c.calculateInterest(c.getBalance());
	}

}
