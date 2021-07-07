package serialization;

import java.awt.*;

public class activity extends Frame{
    activity()
    {  
        Button b=new Button("Button!!"); 
        
        b.setBounds(50,50,50,50);  
  
        add(b); 
  
        setSize(500,300); 
 
        setLayout(new FlowLayout());
    
        setVisible(true);  
    }  
    public static void main(String args[]){  
         
         activity a=new activity();  
    }
}
