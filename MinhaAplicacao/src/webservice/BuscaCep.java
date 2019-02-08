package webservice;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;

public class BuscaCep  extends Leitor_xml{
    
    
     String xml_completo;
     String campo_value = null;
     String xml;
     String charset;
     URL url ;

  public static void main(String args[])  {
  
   }
  
  
  public String BuscaCep(String CEP)  {
   
    
      
      
      String cep= CEP; 

      URL url = null;
      //Url da Republica virtual site que faz a busca do CEP
      String urlName = "http://cep.republicavirtual.com.br/web_cep.php?cep="+cep+"&formato=xml";
    
 
try {
     url=new URL(urlName);
    HttpURLConnection con=(HttpURLConnection)url.openConnection();
    BufferedReader in=new BufferedReader(new InputStreamReader(con.getInputStream()));
    BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream(),"iso-8859-1"));  
   // properties.load(in);
   // return true;
    
     //Varre e criar a variavel xml_completo
         while ((xml = rd.readLine()) != null) {  
           xml_completo += xml;  
        }  
         
        
     in.close();
     con.disconnect();
        
    
  }
 catch (  Exception e) {
  //  Utils.log("Properties file not found",System.err);
   // return false;
  }

      
      
         
//fecha a conexao com a pagina    
      /*  in.close();
        urlConnection.disconnect();
   */      

 
     
      return xml_completo;
      
  }
  
 
  
  
}