import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
    /*
    JOptionPane adalah pop up standar dalam bentuk dialog box yg menunjukan
    user untuk value atau informasi ke mereka terhadap sesuatu
    */
    /*
    JOptionPane.showMessageDialog(null, "LESYA BANGSAD", "FUCKER", JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null, "LESYA BANGSAD", "FUCKER", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "LESYA BANGSAD", "FUCKER", JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showMessageDialog(null, "LESYA BANGSAD", "FUCKER", JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null, "LESYA BANGSAD", "FUCKER", JOptionPane.ERROR_MESSAGE);
    
    */
    /*int value =JOptionPane.showConfirmDialog(null, "HY u alright?", "BACOT", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    System.out.println(value);
    //result:0 1 2
    */    
    
    /*
    String nama=JOptionPane.showInputDialog("Who are u?");
    System.out.printf("Hello %s",nama);
    */
    
    String pilihan[]={"Jokowi","Prabowo","Teguh","Puan"};
    ImageIcon image = new ImageIcon("D:/Desktop Programing/jfx_latihan/joption_panel/smile.png");
    JOptionPane.showOptionDialog(null, "Who Your President?", "Secret",0, JOptionPane.QUESTION_MESSAGE, image,pilihan ,0);



    }
}
