class BankAccount{
	private int blance;
	
	public void deposit(int amount) {
		this.blance += amount;
	}
	
	public void showBalance() {
		System.out.println("現在の預金残高：" + this.blance +"円");
	}
}

public class Exp18 {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
//		account.blance = 1000000;
//		System.out.println("現在の預金残高：" + account.blance + "円");
//		
//		
//		account.blance = 5000000;
//		System.out.println("現在の預金残高：" + account.blance + "円");
		
		account.deposit(10000);
		account.showBalance();
		
		account.deposit(5000);
		account.showBalance();
	}
}

