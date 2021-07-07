package bank;
import java.util.List;

public class BankAccountCollectionsMain 
{
	public static void main(String arg[])
	{
		BankAccountService bservice=new BankAccountServiceimpl();
		bservice.addnewbankaccount(new BankAccount(1,10000,"priya"));
		bservice.addnewbankaccount(new BankAccount(2,14500,"Dharshini"));
		bservice.addnewbankaccount(new BankAccount(3,13400,"Gokul"));
		bservice.addnewbankaccount(new BankAccount(4,13200,"sam"));
		bservice.addnewbankaccount(new BankAccount(5,16700,"muthal"));
		bservice.addnewbankaccount(new BankAccount(6,17600,"raj"));
		bservice.addnewbankaccount(new BankAccount(7,10850,"yuva"));
		bservice.addnewbankaccount(new BankAccount(8,12130,"rani"));
		bservice.addnewbankaccount(new BankAccount(9,13800,"gp"));
		List <BankAccount> accountlist= bservice.showAllaccounts();
		for(BankAccount account:accountlist)
		{
			System.out.println(account.getAccountnum()+"   "+  account.getAccountbalance()+"    "+  account.getCustomername()+"    ");
		}
		BankAccount temp=new BankAccount(3,14450,"gpriyadharshini");
		bservice.updatebankaccount(temp);
		System.out.println("Upadated after list");
		
		//accountlist.showAllaccounts();
		for(BankAccount account:accountlist)
		{
			System.out.println(account.getAccountnum()+"   "+  account.getAccountbalance()+"    "+  account.getCustomername()+"    ");
		}
		BankAccount temp1=new BankAccount(4,13200,"sam");
		bservice.removebankaccount(temp1);
		System.out.println("Removingist");
		
		//accountlist.showAllaccounts();
		for(BankAccount account:accountlist)
		{
			System.out.println(account.getAccountnum()+"   "+  account.getAccountbalance()+"    "+  account.getCustomername()+"    ");
		}
	}
}
