import javax.swing.*;
public class ShowOptionDialogExample {

    private static float randomNumber;

    public static void main(String[] args) {
        /* Simple JOptionPane ShowOptionDialogJava example */
        String[] options = {"DA", "NU"};
        JOptionPane JOptionPaneptionPane = null;
        JOptionPaneptionPane.showMessageDialog(null, "Gandeste-te la un numar aleator de la 1 la 10 ");
        var selection = JOptionPane.showOptionDialog( null, "Numărul este " + ((1 + (int) (Math.random () * 10))) + " ?", "Let's play a game!",
                0, 3, null, options, options[0]);
        while (true) {
            if (selection == 1) {
                JOptionPane.showMessageDialog(null, "Mai da-mi o sansa :(");
                selection = JOptionPane.showOptionDialog( null, "Numărul este " + ((1 + (int) (Math.random () * 10))) + " ?", "Let's play a game!",
                        0, 3, null, options, options[0]);
            }
            if (selection == 0) {
                JOptionPane.showMessageDialog(null, "Am ghicit :))");
                break;
            }
        }


    }
}