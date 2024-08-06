/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class conexao {
    public static java.sql.Statement statement = null;

    // String com o caminho onde está o banco de dados
    String URL = "jdbc:mysql://localhost:3307/2dsb_enio_vendas";
    //Login
    String user = "root";
    //Senha
    String senha = "usbw";
    // Variavel para o comando SQL
    private java.sql.Statement stm = null;
    // Variavel para a conexão
    private Connection conexao = null;
 
    // Métodos Conectar e Desconectar Banco de Dados 
    // =============================================

    public void conectar() throws ClassNotFoundException, SQLException {
       
        // Carga do driver de conexão
        Class.forName("com.mysql.jdbc.Driver");
        // Fazendo a conexão
        conexao = DriverManager.getConnection(URL, user, senha);
        statement = (java.sql.Statement) conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }

    public void desconectar() throws SQLException{
           
        // Fechando a conexão
        conexao.close();
    }
public static int runSQL(String sql) 
    {
        int qtdreg = 0;
     
      try
      {        
         qtdreg = statement.executeUpdate(sql);
      }
      catch(SQLException sqlex)
      {
         System.out.println("Falha no acesso"+ sqlex);
      }
      
      return qtdreg;
    }
}
