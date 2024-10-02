package util;

import java.awt.Component;
import javax.swing.JOptionPane;

public class MessageBox {

    public static void showErrorMessage(Component parent, String title, String message) {
        JOptionPane.showMessageDialog(parent, message, title, JOptionPane.ERROR_MESSAGE);
    }

    public static void showInformationMessage(Component parent, String title, String message) {
        JOptionPane.showMessageDialog(parent, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showWarningMessage(Component parent, String title, String message) {
        JOptionPane.showMessageDialog(parent, message, title, JOptionPane.WARNING_MESSAGE);
    }

    public static int showComfirmMessage(Component parent, String title, String message) {
        return JOptionPane.showConfirmDialog(parent, message, title, JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
    }
    public static int showComfirmMessages(Component parent, String message) {
        return showComfirmMessage(parent, "Comfirmation", message);
    }

}
