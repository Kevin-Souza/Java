/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.supermercadoreges.rdn;

import br.com.supermercadoreges.modelo.Cliente;
import br.com.supermercadoreges.modelo.Endereco;
import br.com.supermercadoreges.rdn.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author alex.lopes
 */
public class ClienteRdn {

    // a conexão com o banco de dados
    private Connection connection;

    public ClienteRdn() {
        this.connection = new ConnectionFactory().getConnection();

    }

    public int inserir(Cliente cliente) {

        int retorno = 0;
        StringBuilder sql = new StringBuilder();

        sql.append("INSERT INTO cliente(	");
        sql.append(" nome                       ");
        sql.append(",telefone                   ");
        sql.append(",data_nascimento            ");
        sql.append(",email                      ");
        sql.append(",numero_cartao_fidelidade   ");
        sql.append(",logradouro                 ");
        sql.append(",bairro                     ");
        sql.append(",cep                        ");
        sql.append(",cidade                     ");
        sql.append(",complemento                ");
        sql.append(",numero                     ");
        sql.append(",uf)                        ");
        sql.append("VALUES                      ");
        sql.append("(?                          ");
        sql.append(",?                          ");
        sql.append(",?                          ");
        sql.append(",?                          ");
        sql.append(",?                          ");
        sql.append(",?                          ");
        sql.append(",?                          ");
        sql.append(",?                          ");
        sql.append(",?                          ");
        sql.append(",?                          ");
        sql.append(",?                          ");
        sql.append(",?)                         ");

        try {
            // prepared statement para inserção            
            PreparedStatement stmt = this.connection.prepareStatement(sql.toString());

            // seta os valores
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTimeInMillis()));

            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getNumeroCartaoFidelidade());

            stmt.setString(6, cliente.getEndereco().getLogradouro());
            stmt.setString(7, cliente.getEndereco().getBairro());
            stmt.setString(8, cliente.getEndereco().getCep());
            stmt.setString(9, cliente.getEndereco().getCidade());
            stmt.setString(10, cliente.getEndereco().getComplemento());

            stmt.setString(11, cliente.getEndereco().getNumero());
            stmt.setString(12, cliente.getEndereco().getUf());
            // executa
            
            retorno =  stmt.executeUpdate();
            
            stmt.close();
            return retorno;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Cliente> obterClientes() {
        ArrayList<Cliente> retorno = new ArrayList<Cliente>();
        try {
            //CRIA A STRING DE SELECT
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT id_cliente                                       ");
            sql.append("    ,nome						");
            sql.append("    ,telefone                                           ");
            sql.append("    ,data_nascimento                            	");
            sql.append("    ,email						");
            sql.append("    ,numero_cartao_fidelidade                            ");
            sql.append("    ,logradouro                                         ");
            sql.append("    ,bairro						");
            sql.append("    ,cep						");
            sql.append("    ,cidade						");
            sql.append("    ,complemento                                        ");
            sql.append("    ,numero						");
            sql.append("    ,uf                                                 ");
            sql.append("FROM cliente                                            ");

            //ABRE A CONEXAO
            Connection con = new ConnectionFactory().getConnection();
            //CRIA O STATEMENT
            Statement stmt = con.createStatement();
            //EXECUTA E GUARDA NO RESULT SET
            ResultSet rs = stmt.executeQuery(sql.toString());
            //PERCORRE O RESULT SET
            while (rs.next()) {
                //Carregar valores                         

                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));

                //CONVERTER SQL DATE TO CALENDAR
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(rs.getDate("data_nascimento"));

                cliente.setDataNascimento(calendar);

                cliente.setEmail(rs.getString("email"));
                cliente.setNumeroCartaoFidelidade(rs.getString("numero_cartao_fidelidade"));

                //Endereco
                Endereco endereco = new Endereco();
                endereco.setLogradouro(rs.getString("logradouro"));
                endereco.setBairro(rs.getString("bairro"));
                endereco.setCep(rs.getString("cep"));
                endereco.setCidade(rs.getString("cidade"));
                endereco.setComplemento(rs.getString("complemento"));
                endereco.setNumero(rs.getString("numero"));
                endereco.setUf(rs.getString("uf"));

                cliente.setEndereco(endereco);

                retorno.add(cliente);

            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return retorno;
    }

   
    
     public int alterar(Cliente cliente) {

        int retorno = 0;
        StringBuilder sql = new StringBuilder();

        sql.append("UPDATE cliente   SET  nome                 = ?      ");        
        sql.append("                 ,telefone                 = ?      ");
        sql.append("                 ,data_nascimento          = ?      ");
        sql.append("                 ,email                    = ?      ");
        sql.append("                 ,numero_cartao_fidelidade = ?      ");
        sql.append("                 ,logradouro               = ?      ");
        sql.append("                 ,bairro                   = ?      ");
        sql.append("                 ,cep                      = ?      ");
        sql.append("                 ,cidade                   = ?      ");
        sql.append("                 ,complemento              = ?      ");
        sql.append("                 ,numero                   = ?      ");
        sql.append("                 ,uf                      = ?       ");
        sql.append("WHERE id_cliente = ?                                ");
            

        try {
            // prepared statement para inserção            
            PreparedStatement stmt = this.connection.prepareStatement(sql.toString());

            // seta os valores
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTimeInMillis()));

            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getNumeroCartaoFidelidade());

            stmt.setString(6, cliente.getEndereco().getLogradouro());
            stmt.setString(7, cliente.getEndereco().getBairro());
            stmt.setString(8, cliente.getEndereco().getCep());
            stmt.setString(9, cliente.getEndereco().getCidade());
            stmt.setString(10, cliente.getEndereco().getComplemento());

            stmt.setString(11, cliente.getEndereco().getNumero());
            stmt.setString(12, cliente.getEndereco().getUf());
            stmt.setInt(13, cliente.getId());
            
            // executa
            
            retorno =  stmt.executeUpdate();
            
            stmt.close();
            return retorno;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public int DeletarCliente(int id) {
        int rowsDeleted = 0;
        try {

            String sql = "DELETE FROM cliente WHERE id_cliente=?";

            //ABRE A CONEXAO
            Connection con = new ConnectionFactory().getConnection();

            //INSTANCIA O COMANDO
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);

            //EXECUTA O COMANDO
            rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Cliente removido com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return rowsDeleted;
    }

    /*public int DeletarCliente(int id) {
        int rowsDeleted = 0;
        try {

            String sql = "DELETE FROM cliente WHERE id_cliente=1";
            //CRIA A CONEXAO
            Connection con = new ConnectionFactory().getConnection();
            // INSTANCIA O OBJETO Statement
            Statement statement = con.createStatement();
            //EXECUTA O COMANDO
            rowsDeleted = statement.executeUpdate(sql);
            if (rowsDeleted > 0) {
                System.out.println("Cliente removido com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return rowsDeleted;
    }*/
}
