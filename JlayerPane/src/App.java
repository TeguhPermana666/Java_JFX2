import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.Color;
import java.awt.Dimension;

public class App {
    public static void main(String[] args) throws Exception {
    /*
    Jlayerdpane menyediakan sebuah 3 dimensi untuk positioning
    componen seperti depth,Z-index
    */
    JLabel label1 = new JLabel();
    label1.setOpaque(true);
    label1.setBackground(Color.RED);
    label1.setBounds(50, 50, 200,200 );
    
    
    
    JLabel label2 = new JLabel();
    label2.setOpaque(true);
    label2.setBackground(Color.BLUE);
    label2.setBounds(100, 100, 200,200 );
    
    
    JLabel label3 = new JLabel();
    label3.setOpaque(true);
    label3.setBackground(Color.YELLOW);
    label3.setBounds(150, 150, 200,200 );
    

    JLayeredPane Jlayered = new JLayeredPane();
    Jlayered.setBounds(0,0,500,500);
    /*
    bisa di set positioningya terhadap z-index atau depth
    Jlayered.add(label1,Integer.valueof(0));
    Jlayered.add(label2,Inteher.valueof(1));
    Jlayered.add(label3,Integer.valueof(2));

    Jlayered.add(label1,JLayaredPane.DEFAULT_LAYER);
    Jlayered.add(label2,JLayaredPane.DRAG_LAYER);
    */
    Jlayered.add(label1);
    Jlayered.add(label2);
    Jlayered.add(label3);

    JFrame frame = new JFrame("JLayerdPane");
    frame.add(Jlayered);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(new Dimension(500, 500));
    frame.setLayout(null);
    frame.setVisible(true);

    }
}
