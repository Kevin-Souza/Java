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
        System.out.println(+total);
        if (total < 18.5){
        //JOptionPane.showMessageDialog(null, "Seu IMC é igual á: "+total+", categorizado como MAGREZA");
        JOptionPane.showMessageDialog(null, "Seu IMC é igual á: "+total+", categorizado como MAGREZA" ,input, JOptionPane.WARNING_MESSAGE);
        } else if (total >= 18.5 && total <= 24.9){
            JOptionPane.showMessageDialog(null, "Seu IMC é igual á: "+total+", categorizado como NORMAL");
        } else if (total >= 25.0 && total <= 29.9 ){
            JOptionPane.showMessageDialog(null, "Seu IMC é igual á: "+total+", categorizado como SOPREPESO",input,JOptionPane.WARNING_MESSAGE);
        } else if (total >= 30 && total <= 39.9){
            JOptionPane.showMessageDialog(null,"Seu IMC é igual á: "+total+", categorizado como OBESIDADE",input,JOptionPane.WARNING_MESSAGE);
        }   
    }
    
    
}
