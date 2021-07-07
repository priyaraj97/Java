package bank;

public class BankAccount {

	private int Accountnum, Accountbalance;
	private String Customername;
	public BankAccount() 
	{
		super();
		
	}
	public BankAccount(int Accountnum, int Accountbalance, String Customername) {
		super();
		this.Accountnum = Accountnum;
		this.Accountbalance = Accountbalance;
		this.Customername = Customername;
	}
	public int getAccountnum() {
		return Accountnum;
	}
	public void setAccountnum(int accountnum) {
		Accountnum = accountnum;
	}
	public int getAccountbalance() {
		return Accountbalance;
	}
	public void setAccountbalance(int accountbalance) {
		Accountbalance = accountbalance;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Accountnum;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (Accountnum != other.Accountnum)
			return false;
		return true;
	}
		
}
