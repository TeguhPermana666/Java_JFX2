import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


import java.awt.event.*;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class MyFrame extends JFrame implements ActionListener{
    JMenuBar bar;
    JMenu filMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem saveItem;
    JMenuItem loadItem;
    JMenuItem  exitItem;

    ImageIcon imageSave;
    ImageIcon imageLoad;
    ImageIcon imageExit;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(500,500));

        //set gambar
        imageSave = new ImageIcon("D:/Desktop Programing/jfx_latihan/MenuBar/dokumen.jpg");
        imageLoad = new ImageIcon("D:/Desktop Programing/jfx_latihan/MenuBar/load.png");
        imageExit = new ImageIcon("D:/Desktop Programing/jfx_latihan/MenuBar/keluar.jpg");
        //set menu bar
        bar= new JMenuBar();

        //set menu pada menubar
        filMenu=new JMenu("File");
        filMenu.setMnemonic(KeyEvent.VK_F);//alt +F(kalau file menu pakai alt)

        editMenu=new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);

        helpMenu=new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);

        //set submenu item pada menu
        saveItem=new JMenuItem("Save");
        saveItem.setIcon(imageSave);
        saveItem.setMnemonic(KeyEvent.VK_S);//S karena pada menuItem ga usah pakai alt
        saveItem.addActionListener(this);

        loadItem = new JMenuItem("Load");
        loadItem.setIcon(imageLoad);
        loadItem.setMnemonic(KeyEvent.VK_L);
        loadItem.addActionListener(this);

        exitItem = new JMenuItem("Exit");
        exitItem.setIcon(imageExit);
        exitItem.setMnemonic(KeyEvent.VK_E);
        exitItem.addActionListener(this);

        //mengeset Jmenubar pada frame
        this.setJMenuBar(bar);
        
        //add menu pada menu bar
        bar.add(filMenu);
        bar.add(editMenu);
        bar.add(helpMenu);

        //add submenu item pada menu
        filMenu.add(saveItem);
        filMenu.add(loadItem);
        filMenu.add(exitItem);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==saveItem){
           System.out.println("Saving...");
       }
       else if (e.getSource()==loadItem){
           System.out.println("Loading...");
       }
       else if(e.getSource()==exitItem){
           System.out.println("Bye...!!!");
           System.exit(666);
       }
        
    }

}
