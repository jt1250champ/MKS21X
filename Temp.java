import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temp  extends JFrame implements ActionListener{
    private Container pane;

    private JButton toF,toC;
    private JLabel l;
    private JTextField t;
    private JCheckBox c;
 
  public Temp() {
     this.setTitle("Temperature");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());
    
     t = new JTextField(12);
     toF = new JButton("to F");
     toF.addActionListener(this);
     toF.setActionCommand("f");
     toC = new JButton("to C");
     toC.addActionListener(this);
     toC.setActionCommand("c");
     l = new JLabel("Temperature");
     
     pane.add(toF);
     pane.add(toC);
     pane.add(l);
     pane.add(t);
  }
    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	try{
	if(event.equals("f")) {
	    double s = Double.parseDouble(t.getText());
	    double result = s*1.8+32;
	    l.setText("" + result);
	    
	}
	if(event.equals("c")) {
	    double s = Double.parseDouble(t.getText());
	    double result = (s-32)/1.8;
	    l.setText("" + result);
	}
	}catch(NumberFormatException a) {
	    l.setText("Please put in a number");
	}
    }
     

  public static void main(String[] args) {
     Temp g = new Temp();
     g.setVisible(true);
  }

}
