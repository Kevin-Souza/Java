/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//wasnull()
package br.supermercado.reges.view;

import br.com.supermercadoreges.modelo.Cliente;
import br.com.supermercadoreges.modelo.Endereco;
import br.supermercadoreges.rdn.ClienteRdn;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author alex.lopes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        /*  Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
        connection.close();*/

        ClienteRdn cliRdn = new ClienteRdn();

        Calendar dtNascimento1 = Calendar.getInstance();
        dtNascimento1.set(Calendar.YEAR, 1986);
        dtNascimento1.set(Calendar.MONTH, Calendar.DECEMBER);
        dtNascimento1.set(Calendar.DATE, 14);

        Cliente cliente = new Cliente();
        cliente.setNome("Antonio Alex Lopes 12345");
        cliente.setTelefone("1733617301");
        cliente.setDataNascimento(dtNascimento1);
        cliente.setEmail("antonioalexlopes");
        cliente.setNumeroCartaoFidelidade("123456");
        cliente.setId(2);

        Endereco endereco = new Endereco();
        endereco.setBairro("Jardim Botanico");
        endereco.setCep("14021615");
        endereco.setCidade("Ribeirão Preto");
        endereco.setComplemento("ap 32");
        endereco.setNumero("55");
        endereco.setLogradouro("Rua Noboru Nisiyama");
        endereco.setUf("SP");

        
        cliente.setEndereco(endereco);
        
        cliRdn.alterar(cliente);

        ArrayList<Cliente> lstCli = cliRdn.obterClientes();

        for (Cliente cli : lstCli) {
            System.out.println("Nome: " + cli.getNome());
            System.out.println("Telefone: " + cli.getTelefone());
            System.out.println("Email: " + cli.getEmail());
        }
        cliRdn.DeletarCliente(1);

    }
}
