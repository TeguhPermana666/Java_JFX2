import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

public class App {
    public static void main(String[] args) throws Exception {
    //JLabel adalah sebuah GUI untuk menampilkan area string of text, gambar, atau keduanya
    //Create label
    ImageIcon image_label = new ImageIcon("D:/Desktop Programing/jfx_latihan/label/download.jpg");
    Border border =BorderFactory.createLineBorder(Color.red, 5);


    JLabel label = new JLabel();//create a label
    label.setText("KIMOCI DATEBAYO?");//set text of label
    label.setIcon(image_label);//set image label
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);//set posisi horizontal text
    //set font
    label.setForeground(Color.RED);//merubah warna pada font
    label.setFont(new Font("Arial", Font.BOLD, 30));//set karakteristik value dari font
    label.setIconTextGap(30);//gap antara text dengan ImageIcon
    label.setBackground(Color.black);//set background color
    label.setOpaque(true);//display background color, default is false
    //set border
    label.setBorder(border);
    //set aligment label
    //label disini mengandung sebuah text dan gambarnya
    //set label secara vertical atau horizontal
    label.setHorizontalAlignment(JLabel.CENTER);    
    label.setVerticalAlignment(JLabel.CENTER);
    //set lebar layout
    //label.setBounds(100, 150, 250, 250);

    //create a frame

    //frame.setResizable(false);
    //frame.getContentPane().setBackground(Color.PINK);
    //ImageIcon image_frame = new ImageIcon("D:/Desktop Programing/jfx_latihan/label/dota.jpg");
    //frame.setIconImage(image_frame.getImage());
    JFrame frame = new JFrame();
    frame.setVisible(true);
    //frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("GULAG");
    //frame.setResizable(true);
    //menyeting layout frame, null=> kosong
    //frame.setLayout(null);
    //kalau set icon gambar dia bakal bug pad asize untuk tampilkan label

    //active a label
    frame.add(label);
    
    //frame pack=>mengotomatiskan ukuran frame sesuai ukuran label
    frame.pack();//=>mengpack sebuah frame sesuai konten label
    //pack harus setelah penambahan label jika tidak maka pack tidak dijalankan
    //karena pack dulu baru penambahan label kedalam frame

    

    }
}
