
import javax.swing.JOptionPane;

public class Time {

    public static void main(String[] args) {
        String input;
        int mins, hrs, min;
        input = JOptionPane.showInputDialog("Enter time in minutes:");
        mins = Integer.parseInt(input);
        hrs = mins / 60;
        min = mins % 60;
        JOptionPane.showMessageDialog(null, mins + " minutes" + " Becomes " + hrs + " hours and " + min + " minutes");
    }
}
