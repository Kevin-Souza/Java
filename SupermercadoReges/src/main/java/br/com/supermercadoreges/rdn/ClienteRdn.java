package br.com.supermercadoreges.rdn;

import br.com.supermercadoreges.modelo.Cliente;

import java.sql.*;
import java.util.ArrayList;

public class ClienteRdn {
    public int Inserir(Cliente cliente) throws SQLException {
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

        Connection conn = new ConnectionFactory().getConnection();
        PreparedStatement statement = conn.prepareStatement(sql.toString());

        statement.setString(1, cliente.getNome());
        statement.setString(2, cliente.getTelefone());
        statement.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTimeInMillis()));

        statement.setString(4, cliente.getEmail());
        statement.setString(5, cliente.getNumeroCartaoFidelidade());

        statement.setString(6, cliente.getEndereco().getLogradouro());
        statement.setString(7, cliente.getEndereco().getBairro());
        statement.setString(8, cliente.getEndereco().getCep());
        statement.setString(9, cliente.getEndereco().getCidade());
        statement.setString(10, cliente.getEndereco().getComplemento());

        statement.setString(11, cliente.getEndereco().getNumero());
        statement.setString(12, cliente.getEndereco().getUf());
        statement.setInt(13, cliente.getId());

        statement.close();
        return 0;

    }
    public ArrayList<Cliente> ObterTodos()
    {
        ArrayList<Cliente> retorno = new ArrayList<Cliente>();

        try{
            StringBuilder str = new StringBuilder();
            str.append("select a.id_cliente");
            str.append(",.nome");
            str.append(",a.telefone");
            str.append(",a.data_nascimento");
            str.append(",a.email");
            str.append(",a.numero_cartao_fidelidade");
            str.append(",a.logradouro");
            str.append(",a.bairro");
            str.append(",a.cep");
            str.append(",a.cidade");
            str.append(",a.complemento");
            str.append(",a.numero");
            str.append(",a.uf");
            str.append("from cliente a");

            //Abre conexão
            Connection conn = new ConnectionFactory().getConnection();

            //cria um statement
            Statement stmt = conn.createStatement();

            //receber dados no resultset
            ResultSet rs = stmt.executeQuery(str.toString());

            //percorre todos os registros do ResultSet
            while (rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id_cliente"));

            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
        return retorno;
    }
}
