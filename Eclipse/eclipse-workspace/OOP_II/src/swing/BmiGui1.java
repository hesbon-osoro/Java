package swing;
 // A GUI to compute a person's body mass index (BMI). 2 
// Object-oriented version without event handling.  
import java.awt.*; 
import javax.swing.*; 
public class BmiGui1 {
	    
	// onscreen components stored as fields 
	private JFrame frame;       
	private JTextField heightField;      
	private JTextField weightField;       
	private JLabel bmiLabel;      
	private JButton computeButton;       
	public BmiGui1() {          
		// set up components        
		heightField = new JTextField(5);          
		weightField = new JTextField(5);        
		bmiLabel = new JLabel("Type your height and weight");
		computeButton = new JButton("Compute");
		// layout 24         
		JPanel north = new JPanel(new GridLayout(2, 2)); 
		north.add(new JLabel("Height: "));        
		north.add(heightField);        
		north.add(new JLabel("Weight: "));      
		north.add(weightField);    
		// overall frame 31          
		frame = new JFrame("BMI");      
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		frame.setLayout(new BorderLayout());      
		frame.add(north, BorderLayout.NORTH);         
		frame.add(bmiLabel, BorderLayout.CENTER);        
		frame.add(computeButton, BorderLayout.SOUTH);          
		frame.pack();  
		frame.setVisible(true); 
		} 
	}

