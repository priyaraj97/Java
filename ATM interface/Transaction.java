package machine;

public abstract class Transaction
{
   private int accountNumber; // indicates account involved
   protected Screen screen; // ATM's screen
   private BankDatabase bankDatabase; // account info database

   public Transaction(int userAccountNumber, Screen atmScreen, 
      BankDatabase atmBankDatabase)
   {
      accountNumber = userAccountNumber;
      screen = atmScreen;
      bankDatabase = atmBankDatabase;
   } 
   public int getAccountNumber()
   {
      return accountNumber; 
   } 
   public Screen getScreen()
   {
      return screen;
   } 
   public BankDatabase getBankDatabase()
   {
      return bankDatabase;
   } 
   abstract public void execute();
}
