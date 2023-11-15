package Theory;
import javax.swing.JOptionPane;

public class A_4_DIAO_with_JOptionPane {
    public static void main(String[] args) {
        
        String string;
        int number;
        char letter;
        double decimal;

        string = JOptionPane.showInputDialog("Write a one string: ");
        number = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));
        letter = JOptionPane.showInputDialog("Write a letter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Write a decimal: "));

        JOptionPane.showMessageDialog(null,"The string is: " + string);
        JOptionPane.showMessageDialog(null,"The number is: " + number);
        JOptionPane.showMessageDialog(null,"The letter is: " + letter);
        JOptionPane.showMessageDialog(null,"The decimal is: " + decimal);
    }
    
}