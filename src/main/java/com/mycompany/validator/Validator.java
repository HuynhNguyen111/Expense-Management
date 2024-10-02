/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validator;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Admin
 */
public class Validator {

    public static boolean isEmpty(JComponent component) {
        if (component instanceof JTextField) {
            JTextField txt= (JTextField) component;
            if (txt.getText().equals("")) {
                txt.setBackground(Color.YELLOW);
                return true;
            } else{
                txt.setBackground(Color.WHITE);
            }
        }
        return false;
    }
}
