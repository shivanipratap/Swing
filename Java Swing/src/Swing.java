



import javax.swing.*;
import java.awt.event.*;
public class Swing extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b1;
	Swing()  {

    
    	 l1= new JLabel("ADDITION OF TWO NOs.");
    	 l2= new JLabel("First No.");
    	 l3= new JLabel("Second No.");
    	 l4= new JLabel();
    	 t1= new JTextField();
    	 t2= new JTextField();
    	 
    	 b1= new JButton("ADD");
    	 setLayout(null);
    	 l1.setBounds(50,50,200,20);
    	 l2.setBounds(50,80,100,20);
    	 t1.setBounds(150,80,100,20);
    	 l3.setBounds(50,130,100,20);
    	 t2.setBounds(150,130,100,20);
    	 b1.setBounds(80,180,100,20);
    	 l4.setBounds(50,240,200,20);
    	 b1.addActionListener(this);
    	 add(l1);
    	 add(l2);
    	 add(t1);
    	 add(l3);
    	 add(t2);
    	 add(b1);
    	 add(l4); 
    	 setSize(500,500);
    	 setVisible(true);
    	 }
    	 
    		 public void  actionPerformed(ActionEvent e) {
    			 int a=Integer.parseInt(t1.getText());
    			 int b=Integer.parseInt(t2.getText());
    			 int c=a+b;
    			 l4.setText("sum is: "+c);
    			 
    			
    		 }
    	 
    	 public static void main(String args[]) {
    		 
    		Swing  s=new Swing();
    
    	 }}
     
