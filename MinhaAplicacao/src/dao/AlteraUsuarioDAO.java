/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;
import factory.ConnectionFactory;
import java.awt.List;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Vector;


/**
 *
 * @author willian.batista
 */
public class AlteraUsuarioDAO {
    
    private Connection connection;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    String condicoes;
    String retorno;
    String nome_campo;
    

    
    
     public AlteraUsuarioDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }
     

 
        public String  getCampoUsuario(String nome_campo, String codigo_usuario){
            

         // Enter Your MySQL Database Table name in below Select Query.
         String str="select "+nome_campo+" from usuario where id ="+codigo_usuario;
         Connection cn;
         ResultSet rs;
         Statement st;
         
         
         try {

          cn= new ConnectionFactory().getConnection();
          st=cn.createStatement();

          rs=st.executeQuery(str);
          

         
          while(rs.next()){
       
             retorno = rs.getString(nome_campo);
        
             
          }

         } catch (SQLException e) {

          e.printStackTrace();
         }
         
         return retorno;
        }
     
       public static void main(String args[]) {
      
          // new AlteraUsuarioDAO().getCampoUsuario("nome", "1");
           
       
    }
}




