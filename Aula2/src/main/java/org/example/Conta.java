package org.example;

import javax.swing.*;

public class Conta {
     int Numero;
     String Agencia;
     String Titular;
     double Saldo;

    public void Depositar (double valor){
        double novoSaldo = this.Saldo + valor;
        this.Saldo = novoSaldo;
        //input = JOptionPane.showInputDialog("Digite o Valor a ser depositado: ");

    }
    public void Sacar (double valor){
        double novoSaldo = this.Saldo - valor;
        this.Saldo = novoSaldo;
    }

    public double Investimento(){
        return this.Saldo * 0.5;
    }
}
