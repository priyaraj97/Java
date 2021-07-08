package machine;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Depositslot extends Transaction
{
   private double amount; // amount to deposit
   private Keypad keypad; // reference to keypad
   private Depositslot depositSlot; // reference to deposit slot
   private final static int CANCELED = 0; // constant for cancel option

    public Depositslot (int userAccountNumber, Screen atmScreen, 
      BankDatabase atmBankDatabase, Keypad atmKeypad, 
      Depositslot atmDepositSlot)
   {
      super(userAccountNumber, atmScreen, atmBankDatabase);
      keypad = atmKeypad;
      depositSlot = atmDepositSlot;
   } 
   
	@Override
   public void execute()
   {
	   promptForDepositAmount();
   }
   public void makedeposit(double amount){
      BankDatabase bankDatabase = getBankDatabase(); // get reference
      Screen screen = getScreen(); // get reference
      
      if (amount != CANCELED)
      {
    	  screen.messageJLabel2.setText( "\nPlease insert a deposit envelope containing " + amount);

         // receive deposit envelope
         boolean envelopeReceived = depositSlot.isEnvelopeReceived();

         // check whether deposit envelope was received
         if (envelopeReceived)
         {  
        	 screen.messageJLabel2.setText("\nYour envelope has been " + 
               "received.\nNOTE: The money just deposited will not ");
              screen.messageJLabel3.setText("be available until we verify the amount of any " +
               "enclosed cash and your checks clear.");
            
            
            bankDatabase.credit(getAccountNumber(), amount); 
         } 
         else
         {
        	 screen.messageJLabel2.setText("\nYou did not insert an " +
               "envelope, so the ATM has canceled your transaction.");
         } 
      }
      else
            {
    	  screen.messageJLabel2.setText("\nCanceling transaction...");
      } 
   }
   private boolean isEnvelopeReceived() {
	// TODO Auto-generated method stub
	return false;
}

private void promptForDepositAmount()
   {
      Screen screen = getScreen(); 
      screen.CreateDepositGUI(); 
      screen.Mainframe.add( keypad.addkeypad(), BorderLayout.CENTER);
      
      screen.Mainframe.revalidate();
      
    class Depositcheck implements ActionListener
   {
      public void actionPerformed( ActionEvent e )
      {
   	   
         double input = Integer.parseInt( screen.Inputfield2.getText() );
         double amount = input / 100;
         Depositcheck check1 = new Depositcheck();  
         keypad.BEnter.addActionListener( check1 );
         makedeposit(amount);
       
      }
   }
   }
}
