package br.com.supermercadoreges.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
    private int id;
    private String notaFiscal;
    private Date dataVenda;
    private Cliente cliente;
    private double valorVenda;
    private Funcionario funcionario;
    private ArrayList<ItemVenda> itens;



}
