package chap06.textbook.exercises.p19;

public class Account {
	private int Balance;
	
	public void setBalance(int balance) {
//		int MIN_BALANCE = 0;
//		int MAX_BALANCE = 0;
		if(balance < 0 || balance >1000000) {
			return;
		}else {
			this.Balance = balance;
		}
	}
	public int getBalance() {
		return Balance;
	}

	
	

}
