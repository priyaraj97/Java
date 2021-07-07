package bank;

public class AccountNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accnum;

	public AccountNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountNotFoundException(int accnum) {
		super();
		this.accnum = accnum;
	}

	@Override
	public String toString() {
		return "AccountNotFoundAException [accnum=" + accnum + "]";
	}
	

}
