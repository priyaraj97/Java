package bank;

import java.util.List;

public class BankAccountServiceimpl implements BankAccountService{
	BankAccountDO bdo = new BankAccountDOAimpl();

	public void addnewbankaccount(BankAccount bankaccount) {
		bdo.addnewbankaccount(bankaccount);
	}

	public void removebankaccount(BankAccount bankaccount) {
		bdo.removebankaccount(bankaccount);
		
	}

	public void updatebankaccount(BankAccount bankaccount) {
		bdo.updatebankaccount(bankaccount);
		
	}

	public List<BankAccount> showAllaccounts() {
		
		return bdo.showAllaccounts();
	}
	

}
