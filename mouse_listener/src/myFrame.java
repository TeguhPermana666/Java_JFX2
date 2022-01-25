//import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
public class myFrame extends JFrame implements MouseListener{
    JLabel label;
    ImageIcon smileIcon;
    ImageIcon nagihIcon;
    ImageIcon fastIcon; 
    ImageIcon telerIcon;
    myFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        
        label=new JLabel();
        label.addMouseListener(this);

        smileIcon= new ImageIcon("D:/Desktop Programing/jfx_latihan/mouse_listener/smile.jpg");
        nagihIcon = new ImageIcon("D:/Desktop Programing/jfx_latihan/mouse_listener/nagih.jpg");
        fastIcon= new ImageIcon("D:/Desktop Programing/jfx_latihan/mouse_listener/Fast.png");
        telerIcon = new ImageIcon("D:/Desktop Programing/jfx_latihan/mouse_listener/teler.jpg");
        
        label.setIcon(smileIcon);
        //label.setBounds(0,0,100,100);
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        //label.setVerticalAlignment(JLabel.CENTER);
        //label.setHorizontalAlignment(JLabel.CENTER);
        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);//null apear your frame in the middle of your computer screen
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Terjadi ketika mouse button di klik(press and realse) pada component mouse listener
        System.out.println("AWW Jangan Nakal Mas");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Terjadi ketika sebuah mouse button di tekan (press) pada component mouse listener
        System.out.println("SAKIT!!!");
        //label.setBackground(Color.black);
        label.setIcon(nagihIcon);
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Terjadi ketika sebuah mouse button di lepas pada komponen mouse listener
        System.out.println("HUHHH!!!");
        //label.setBackground(Color.lightGray);
        label.setIcon(telerIcon);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Terjadi ketika mouse enter the komponen(mendekati komponen) mouse listener
        System.err.println("EHHH ngapain ngap!");
        //label.setBackground(Color.BLUE);
        label.setIcon(fastIcon);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Terjadi ketika mouse keluar dari area komponen mouse listener
        System.out.println("BYE!");
        //label.setBackground(Color.red);
        label.setIcon(smileIcon);
    }
}