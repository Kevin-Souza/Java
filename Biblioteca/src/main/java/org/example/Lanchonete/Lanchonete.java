package org.example.Lanchonete;

import javax.swing.*;
import java.util.ArrayList;

public class Lanchonete {
    public static void main(String[] args){
        String input;
        int op;


        Cliente cl1 = new Cliente("Odair","(11)99999-999","R. 123",455,"Gothan",
        "5400000");

        Produto pr1 = new Produto("Bat Fefri","Bebida",2,6.50);
        Produto pr4 = new Produto("Deep Freze","Bebida",1,12.40);
        Produto pr2 = new Produto("X-Curinga","Lanche",2,22.60);
        Produto pr3 = new Produto("Robin Burger","Lanche",3,25.00);
        Produto pr5 = new Produto("Bat Caramelo","Doce",4,3.50);

        Pedido pe1 = new Pedido();

        /*ArrayList<Produto> pedido = new ArrayList<Produto>();
        pedido.add(pr1);
        pedido.add(pr2);
        pedido.add(pr5);
        System.out.println(pedido);*/
        Produto[] pedido = new Produto[2];
        pedido[0] = pr1;
        pedido[1] = pr2;
        pedido[2] = pr5;

        pe1.setPedido(pedido);

        do {
            input = JOptionPane.showInputDialog(null, "Ben-Vindo á Wayne’s Burgers !!! \n" +
                    "Selecione a opção desejada:\n" +
                    "1 - Fazer pedido(WIP)\n2 - Imprimir Pedido\n3 - Sair");
            op = Integer.valueOf(input);
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null,"feature em desenvolvimento");
                    break;
                case 2:
                    //JOptionPane.showMessageDialog(null,"Pedido:\n"+pe1.getPedido());
                    break;
                case 3:
                    System.out.println("Obrigado !\nVolte Sempre!");
                    break;
            }
        }while (op != 3);
    }
}
