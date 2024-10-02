
package com.mycompany.validator;

import java.awt.Color;
import javax.swing.JTextField;
import util.MessageBox;

public class ExpenditureTypeValidator {
    public static String validate(JTextField txtName) {
        StringBuilder sb= new StringBuilder();
        if (txtName.getText().equals("")) {
                sb.append("Please enter name");  
    }
         return sb.isEmpty()? null: sb.toString();
}
}