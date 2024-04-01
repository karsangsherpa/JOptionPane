import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        //JOptionPane.showMessageDialog(null, "Bro trust the process", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Bro trust the process", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Bro trust the process?", "title", JOptionPane.QUESTION_MESSAGE)''
          //JOptionPane.showMessageDialog(null, "Bro trust the process", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Bro trust the process", "title", JOptionPane.ERROR_MESSAGE);
    //System.out.println(JOptionPane.showConfirmDialog(null, "Bro timi nepali ho?", "Rolpa", JOptionPane.YES_NO_CANCEL_OPTION));
   //String name = JOptionPane.showInputDialog("What is your name bro");
   //System.out.println("Namaste " + name);
   String[] responses = {"Hello", "thanl you", "muji"};
   ImageIcon icon = new ImageIcon("bin/bro.jpeg");
   JOptionPane.showOptionDialog(null, "You are gay", 
   "pubg", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
   null , responses, 0 );
   



}
}
