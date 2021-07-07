package serialization;

import javax.swing.*;
import java.awt.*;
class Interface extends JFrame
{
    JButton button;
    public Interface()
    {
	setTitle("Button Action Example using Lambda Expression");
	setSize(400,300);
	setVisible(true);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	button = new JButton("Button");
	button.setBounds(100,100,90,40);
	//Lambda expression
	button.addActionListener(e-> 
	   System.out.println("Welcome.")); 
	
	add(button);
    }
    public static void main(String args[])
    {
	new Interface();
    }   
}