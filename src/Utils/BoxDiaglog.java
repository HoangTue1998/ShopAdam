/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang Tue
 */
public class BoxDiaglog {

    // Thông báo
    public static void alert(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message,
                "Hệ thống quản lý bán hàng Adam Store", JOptionPane.INFORMATION_MESSAGE
        );
    }

    //Check 
    public static boolean Confirm(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message,
                "Hệ thống quản lý bán hàng Adam Store", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
        );
        return result == JOptionPane.YES_OPTION;
    }

    //Lờin cảnh báo 
    public static String prompt(Component parent, String message) {
        return JOptionPane.showInputDialog(parent, message,
                "Hệ thống quản lý bán hàng Adam Store", JOptionPane.INFORMATION_MESSAGE
        );
    }
}
