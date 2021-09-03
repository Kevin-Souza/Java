package org.example;


public class ContaTest {
    public static void  main (String[] args){
        Conta c1 = new Conta();
        c1.Saldo = 150.00;
        c1.Sacar(80);

        double Investimento = c1.Investimento();

        System.out.println("Saldo: " +c1.Saldo);
        System.out.println("Investimento: " + Investimento);

        Conta c2 = new Conta();
        c2.Saldo = 200;
        c2.Sacar(20);
        c2.Depositar(20);
        System.out.println("Saldo 2ºconta: "+c2.Saldo);

    }
}
