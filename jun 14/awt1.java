package serialization;

import java.awt.*;
public class awt1 {
   awt1()
   {
     
      Frame fr=new Frame();       
    
      Label lb = new Label("UserId: "); 
      
      fr.add(lb);           
    
      TextField t = new TextField();
      
      fr.add(t);
      
      fr.setSize(500, 300);  

      fr.setLayout(new FlowLayout());
            
      fr.setVisible(true);                
   }
   public static void main(String args[])
   {
       awt1 a = new awt1(); 
   }
}
