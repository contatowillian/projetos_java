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
import modelo.ListaUsuarios;





/**
 *
 * @author willian.batista
 */
public class PesquisaUsuarioDAO {
    
    private Connection connection;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    String condicoes;
    String limite;
    public int pagina = 1 ;
    
    
    
    
     static Vector<Vector<String>> data=new Vector<Vector<String>>();
    
     public PesquisaUsuarioDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }
     

 
        public static Vector getDataUsuarios(String Nome_busca,String CPF_busca,String Status_busca,int pagina){
            
    
        String condicoes = " where 1=1 ";
        
        
       
        pagina= pagina-1;
        String limite = " limit  "+pagina*30+",30";
        
        

        
        if(!Nome_busca.equals("")){
            condicoes += " and nome like '%"+Nome_busca+"%'";
        }
        
         if(!CPF_busca.equals("")){
            condicoes += " and cpf like '%"+CPF_busca+"%'";
        }
         
         if(Status_busca.equals("Ativo")){
            condicoes += " and status ='0' ";
        }else{
             condicoes += " and status ='1' ";
         }
        
        
          //  System.out.println(Status_busca);
        
         // Enter Your MySQL Database Table name in below Select Query.
         String str="select * from usuario"+condicoes+" "+limite;
         Connection cn;
         ResultSet rs;
         Statement st;
         
          

         try {
          // Change the database name, hosty name, 
          // port and password as per MySQL installed in your PC.
          cn= new ConnectionFactory().getConnection();
          st=cn.createStatement();

          rs=st.executeQuery(str);
          
         
          
         data.clear();  
         
          while(rs.next()){
           Vector <String> d=new Vector<String>();

           d.add(rs.getString("id"));
           d.add(rs.getString("nome"));
           d.add(rs.getString("cpf"));
           d.add(rs.getString("email"));
           
     
           

           d.add("\n\n\n\n\n\n\n");
           data.add(d);
          }
                cn.close();
                
         } catch (SQLException e) {

          e.printStackTrace();
         }
         
         
         
         return data;
        }
     
       public static void main(String args[]) {
      
          // new PesquisaUsuarioDAO().getDataUsuarios();
           
       
    }
}




