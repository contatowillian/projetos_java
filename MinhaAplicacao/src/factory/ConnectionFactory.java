/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willian.batista
 */
// situa em qual package ou “pacote” está a classe
package factory;
// faz as importações de classes necessárias para o funcionamento do programa
import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções
import java.sql.Statement;


public class ConnectionFactory {
    
    Statement stmt;
    
    public Connection getConnection() {
        try {
          
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_java","root","");
            
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
    
}