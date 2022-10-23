/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author luizportel4
 */
public class Limpador {
    public static void limpaCampo(JTextField textField) {
        textField.setText("");
    }

    public static void limpaCampo(JTextArea textArea) {
        textArea.setText("");
    }
}
