/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calcfat;

/**
 *
 * @author kevin
 */
public class Proj {
    public static void main(String[] args){
        int faturamentoJaneiro,faturamentoFevereiro,faturamentoMarco,faturamentoTrimestre;
        faturamentoJaneiro = 1500;
        faturamentoFevereiro = 4500;
        faturamentoMarco = 9800;
        
        faturamentoTrimestre = faturamentoJaneiro + faturamentoFevereiro + faturamentoMarco;
        
        System.out.println("Faturamento do trimestre "+faturamentoTrimestre);
       
    }
}
