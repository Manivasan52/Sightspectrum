package task3;
class Holder{
	String name;
	String account_no;
	String account_type;
	float amount;
	
	public void bankdetails(String n,String ac,String ty,float  amt )
	{
		name=n;
		account_no=ac;
		account_type=ty;
		amount=amt;
		
	}
	  void showDetails()
	{
		System.out.println("Name: "+name+" "+"Account number: "+account_no+" "+"Account type:"+ account_type+" "+"Amount: "+amount);
	}
	void deposit(float amt)
	{
		amount+=amt;
		System.out.println("Deposit Amount: "+amt);
	}
	void withdraw(float amt)
	{
		if(amount<amt)
		{
			System.out.println("Insufficient balance"+amt);
		}
		else
		{
			amount-=amt;
			System.out.println("Withdraw is successfully: "+amt);
		}
	}
	void checkBlanace()
	{
		System.out.println("Your balance: "+amount);
	}
	
}
public class BankManagementSystem {

	public static void main(String[] args) {
		Holder h=new Holder();
		h.bankdetails("Manivasan", "12345678","savings ", 10000);
		h.showDetails();
		h.deposit(10000);
		h.withdraw(5000);
		h.checkBlanace();
	}

}
