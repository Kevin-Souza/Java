/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imcproject;

import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class IMC {

    public static void main(String[]args){
        double altura, peso, total;
        String input;
        input = JOptionPane.showInputDialog("Insera sua altura:");
        altura = Double.valueOf(input);
        input = JOptionPane.showInputDialog("Insera seu peso:");
        peso = Double.valueOf(input);
        total = peso / (altura*altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é de: " +total);
    }
    
    
}
