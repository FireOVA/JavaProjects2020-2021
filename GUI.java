
import javax.swing.*;

public class GUI {
	 public static void main(String[] args) {
	       
	        JFrame frame = new JFrame("Layout Question");
	      
	        frame.setSize(420, 250);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	        JPanel panel = new JPanel();
	       
	        frame.add(panel);
	       
	        placeComponents(panel);

	        
	        frame.setVisible(true);
	    }
	    
	 private static void placeComponents(JPanel panel) {
	       
	        panel.setLayout(null);
	        
	        JLabel userLabel = new JLabel("Buttons:");
	        
	        userLabel.setBounds(0,0,51,30);
	        panel.add(userLabel);
	       
	        JButton hi = new JButton("hi");
	        hi.setBounds(48, 0, 118, 31);
	        panel.add(hi);
	        
	        JButton long_name = new JButton("long name");
	        long_name.setBounds(166, 0, 120, 31);
	        panel.add(long_name);
	        
	        JButton bye = new JButton("bye");
	        bye.setBounds(285, 0, 118, 31);
	        panel.add(bye);
	        
	        JCheckBox bold = new JCheckBox("Bold");
	        bold.setBounds(3,30, 85,22);
	        
	        JCheckBox italic = new JCheckBox("Italic", true);
	        italic.setBounds(3,52, 85,22);
	        
	        JCheckBox underline = new JCheckBox("UnderLine");
	        underline.setBounds(3,74, 85,22);
	        
	        JCheckBox strickout = new JCheckBox("Strickeout", true);
	        strickout.setBounds(3,96, 85,22);
	        
	        panel.add(bold);
	        panel.add(italic);
	        panel.add(underline);
	        panel.add(strickout);
	        
	        JButton one = new JButton("1");
	        one.setBounds(91, 31, 156, 76);
	        panel.add(one);
	        
	        JButton two = new JButton("2");
	        two.setBounds(247, 31, 156, 76);
	        panel.add(two);
	        
	        JButton three = new JButton("3");
	        three.setBounds(90, 107, 78, 38);
	        panel.add(three);
	        
	        JButton four = new JButton("4");
	        four.setBounds(168, 107, 78, 38);
	        panel.add(four);
	        
	        JButton five = new JButton("5");
	        five.setBounds(90, 145, 78, 38);
	        panel.add(five);
	        
	        JButton six = new JButton("6");
	        six.setBounds(168, 145, 78, 38);
	        panel.add(six);
	        
	        JButton seven = new JButton("7");
	        seven.setBounds(246, 107, 156, 78);
	        panel.add(seven);
	        
	        JButton cancel = new JButton("cancel");
	        cancel.setBounds(0, 183, 403, 27);
	        panel.add(cancel);
	        
	}
}
