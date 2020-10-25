package Chapter4_prob;

class Account
{
	int balance;
	public Account()
	{
		System.out.println("새로운 계좌가 만들어졌습니다.");
	}
	public void withdraw(int amount)
	{
		//인출
		System.out.println(amount + "원 인출");
		balance -=amount;
	}
	public void deposit(int amount)
	{
		//입금
		System.out.println(amount + "원 저축");
		balance +=amount;
	}
	public int getBalance()
	{
		return balance;
	}
}

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account cust1 = new Account(); 
		cust1.deposit(50000);
		Account cust2 = new Account(); 
		cust2.deposit(100000); 
		cust2.withdraw(30000);
		System.out.println("고객 #1 계좌 잔고="+cust1.getBalance()); 
		System.out.println("고객 #2 계좌 잔고="+cust2.getBalance());
	}

}
