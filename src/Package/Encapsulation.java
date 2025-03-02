package Package;

public class Encapsulation {

	private String acctno ;
	private double balance;
	
	public  Encapsulation(String acctno, double balance) {
		this.acctno = acctno;
		this.balance = balance;
	}

	public double getbalance(String acctno) {
		if (this.acctno.equals(acctno)) {
			
			return balance;
		}
		else {
			System.out.println("account number is invalid");
		return -1;
		}	
	}
	
	public void setdeposit(String acctno, double amount) {
		if (this.acctno.equals(acctno)) {
			
			if (amount > 0) {
				balance +=amount;
				System.out.println("Balance updated sucessfully :"+balance);
			}
			else {
				System.out.println("Invalid deposite amount");
			}	
		}
		else {
			System.out.println("Invalid account number");
		}	
	}
	
	public static void main(String[]args) {
		
		Encapsulation bankaccount=new Encapsulation("12345678", 500);
		
		System.out.println("Current Balance :"+bankaccount.balance);
		
		bankaccount.setdeposit("12345678", 800);
		
		bankaccount.setdeposit("09876543", 600);
		
		System.out.println("Final Balance :"+bankaccount.getbalance("12345678"));
					
	}
}