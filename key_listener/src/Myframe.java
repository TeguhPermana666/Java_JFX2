import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Myframe extends JFrame implements KeyListener{
    JLabel label;
    ImageIcon image;
    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(new Dimension(300,300));
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK);

        image= new ImageIcon("D:/Desktop Programing/jfx_latihan/key_listener/roket.jpg");

        label= new JLabel();
        label.setBounds(100,80,100,100);
        label.setIcon(image);
       // label.setSize(100,100);
        label.setHorizontalAlignment(JLabel.CENTER);    
        label.setVerticalAlignment(JLabel.CENTER);
        // label.setAlignmentX(JLabel.CENTER);
        // label.setAlignmentY(JLabel.CENTER);
        label.setBackground(Color.red);
        label.setOpaque(true);//for display the background color ->red

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // dipanggil ketika key ditekan. gunakan KeyChar, char output
        switch(e.getKeyChar()){
            case 'a':
            label.setLocation(label.getX()-5, label.getY());
            break;
            
            case 'd':
            label.setLocation(label.getX()+5,label.getY());
            break;

            case 'w':
            label.setLocation(label.getX(),label.getY()-5);
            break;

            case 's':
            label.setLocation(label.getX(), label.getY()+5);
            break;
        }
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Dipanggil ketika physical key di pressed down.uses keycode,char output
        switch(e.getKeyCode()){
            case 37:
            label.setLocation(label.getX()-5, label.getY());
            break;
            
            case 38:
            label.setLocation(label.getX(),label.getY()-5);
            break;

            case 39:
            label.setLocation(label.getX()+5,label.getY());
            break;

            case 40:
            label.setLocation(label.getX(), label.getY()+5);
            break;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Dipanggil ketika kapanpun sebuah button di realisasikan
        System.out.println("Key Char: "+e.getKeyChar());
        System.out.println("Key Code:"+e.getKeyCode());
    }
}
