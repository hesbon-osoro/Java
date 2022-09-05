package swing;

import javax.swing.*;  
import java.awt.event.*;  
public class ScrollBarExample  
{  
	ScrollBarExample(){  
    JFrame f= new JFrame("Scrollbar Example");  
    final JLabel label = new JLabel();          
    label.setHorizontalAlignment(JLabel.CENTER);    
    label.setSize(400,100);  
    final JScrollBar s=new JScrollBar();  
    s.setBounds(100,100, 50,100);  
    f.add(s); 
    f.add(label);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
    s.addAdjustmentListener(new AdjustmentListener() {  
    public void adjustmentValueChanged(AdjustmentEvent e) {  
       label.setText("Vertical Scrollbar value is:"+ s.getValue());  
    }  
 });  
}  
public static void main(String args[])  
{  
   new ScrollBarExample();  
}}  

