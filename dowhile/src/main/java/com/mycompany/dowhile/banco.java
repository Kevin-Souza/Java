/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class banco {
    public static void main(String[] args) {
 double saldo = 0;
 int opcao = 0;
 String input;
 do {
 input = JOptionPane.showInputDialog("Escolha a opção desejada"
 + "\n1 - Depositar"
 + "\n2 - Sacar"
 + "\n3 - Saldo"
 + "\n9 - Sair");
 opcao = Integer.valueOf(input);
switch (input) {
case "1":input = JOptionPane.showInputDialog(null, "Digite o valor do depósito");
 saldo += Double.valueOf(input);
 break;
 case "2": input = JOptionPane.showInputDialog(null, "Digite o valor do saque");
 saldo -= Double.valueOf(input);
 break;
 case "3": JOptionPane.showMessageDialog(null, "Seu saldo no momento:" + saldo);
 break;
 case "9":JOptionPane.showInputDialog(null, "Fim");
 break;
 default: JOptionPane.showMessageDialog(null, "Opção não existe!!");
 break;
 }
 } while (opcao != 9);
}

}