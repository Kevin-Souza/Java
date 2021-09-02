package com.mycompany.tabuadateste;

import javax.swing.*;

public class Tabuada {
    public static void main ( String[] args){
        int n,t;
        String i;
        i = JOptionPane.showInputDialog("Digite um número");
        n = Integer.parseInt(i);
        JOptionPane.showMessageDialog(null,"Tabuada do "+n);
        for(t = 0; t <= 10; t++){
            System.out.println(t+" x "+n + " = "+t*n);
        }
    }
}
