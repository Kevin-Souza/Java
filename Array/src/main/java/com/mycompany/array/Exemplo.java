/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.array;

/**
 *
 * @author kevin
 */
public class Exemplo {
    public static void main(String[]args)
    {
    int[] notas = new int [6];
    notas[0] = 1;
    notas[1] = 8;
    notas[2] = 9;
    notas[3] = 10;
    notas[4] = 4;
    for (int i =0; i <6; i++) {
    System.out.println("Nota:" + notas[i] );
    }
    for (int nota: notas) {
    System.out.println("Nota:" + nota );
    }
 }
}
