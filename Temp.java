import javax.swing.*;
import java.awt.*;
public class Window extends JFrame {
 private Container pane;

 private JButton b;
 private JLabel l;
 private JTextField t;
 private JCheckBox c;
 
  //CONSTRUCTOR SETS EVERYTHING UP
  public Window() {
     this.setTitle("Temperature");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());
    
     t = new JTextField(12);
     toF = new JButton("to F");
     toC = new JButton("to C");
     l = new JLabel(,null,JLabel.CENTER);
     
     pane.add(l);
     pane.add(b);
     pane.add(t);
 }

  //MAIN JUST INSTANTIATES + MAKE VISIBLE
  public static void main(String[] args) {
     Window g = new Window();
     g.setVisible(true);
  }
}