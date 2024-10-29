package trial_2;


public class client implements Interest {

	private String name;
	private int id;
	private double balance;
	private double interestRate;
	
	public client(String name, int id, double balance,double interestRate) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
		this.interestRate=interestRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void deposit (double amount) {
		if(amount>0) {
			setBalance(balance+amount);
		}
		else{
			System.out.println("check the number you enter");
		}
	}
	public void withDraw(double amount) {
		if(amount>0 && amount<=balance) {
			setBalance(balance-amount);
		}
		else{
			System.out.println("check the number you enter");
		}
	}
	
	public void balanceInquiry() {
		System.out.println("Current Balance: " +getBalance());
	}
	
	@Override
	public	void calculateInterest(double balance) {
		double interest= balance * (getInterestRate()/100);
		System.out.println("Current interest: " +interest);

	}
	
	
}

