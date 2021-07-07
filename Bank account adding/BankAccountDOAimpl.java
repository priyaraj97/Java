package bank;
import java.util.*;
public class BankAccountDOAimpl implements BankAccountDO
{
      List<BankAccount> accountlist=new LinkedList<>();	
 
       public void addnewbankaccount(BankAccount bankaccount) {
		 accountlist.add(bankaccount);
	}

		public void removebankaccount(BankAccount bankaccount) {
		if(!accountlist.contains(bankaccount))
		{
			try
		{
			throw new AccountNotFoundException(bankaccount.getAccountnum());
		}
			catch(AccountNotFoundException e)
			
			{
				e.printStackTrace();
			}
		}	
		accountlist.remove(bankaccount);
	}

		public void updatebankaccount(BankAccount bankaccount) {
			if(!accountlist.contains(bankaccount))
			{
				try
			{
				throw new AccountNotFoundException(bankaccount.getAccountnum());
			}
				catch(AccountNotFoundException e)
				
				{
					e.printStackTrace();
				}
			}	
			int index=accountlist.indexOf(bankaccount);
			accountlist.set(index, bankaccount);
			
		
	}

		public List<BankAccount> showAllaccounts() 
		{
			return accountlist;
				
	}
	
}