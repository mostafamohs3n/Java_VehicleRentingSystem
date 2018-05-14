package Code;

import java.io.Serializable;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

public class MyExcaption extends Exception implements Serializable {

    public MyExcaption() {
        super();
    }

    public MyExcaption(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "My Exception";
    }

    int checkPositive(String x) {
        int number;
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter Positive Number for " + x + " !"));
            if (number <= 0) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Positive Int Try Again :(");
            }
        } while (number <= 0);

        return number;
    }

    String checkEmpatyFeild(String x) {
        String feild;
        do {
            feild = JOptionPane.showInputDialog(x + " is Empty please " + "Enter input !" );
            if (feild == "") {
                JOptionPane.showInputDialog(x + " is Empty please "+ "Enter input !" );
            }
        } while (feild == "");

        return feild;
    }

    String checkEmail(String x) {
        String email;
        do {
            email = JOptionPane.showInputDialog("Enter Valid input for " + x + " !");
            if (!email.contains("@") || !email.contains(".")) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Try Again :(");
            }
        } while (!email.contains("@") || !email.contains("."));

        return email;
    }

    String checkPassLength(String x) {
        String pass;
        do {
            pass = JOptionPane.showInputDialog("Enter more than 8 char for " + x + " !");
            if (pass.length() < 8) {
                JOptionPane.showMessageDialog(null, "Not valid Password length Try Again :(");
            }
        } while (pass.length() < 8);

        return pass;
    }

}