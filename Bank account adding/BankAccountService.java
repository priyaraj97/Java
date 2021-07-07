package bank;

import java.util.List;

public interface BankAccountService {
	public abstract void addnewbankaccount(BankAccount bankaccount);
	public abstract void removebankaccount(BankAccount bankaccount);
	public abstract void updatebankaccount(BankAccount bankaccount);
	public abstract List<BankAccount> showAllaccounts();

}
