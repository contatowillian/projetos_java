package webservice;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import java.io.StringReader;

public class Leitor_xml {
    
    
  String campo_retorno = null; 
  String Retorno; 
  String conteudo_xml; 
  String xml_completo;
  String campo_value;
  
  
    public  static void main(String args[]){
        
    
   }

 
  
  
  public static String getCharacterDataFromElement(Element e) {
    Node child = e.getFirstChild();
    if (child instanceof CharacterData) {
      CharacterData cd = (CharacterData) child;
      return cd.getData();
    }
    return "";
  }
  
  
  public  String Webservicecep(String xml,String campo , String Tagpai) {{
      
  
    try {

    DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    InputSource is = new InputSource();
    is.setCharacterStream(new StringReader(xml));

    
    Document doc = db.parse(is);
    //Escolhe o nome do nó Pai  
    NodeList nodes = doc.getElementsByTagName(Tagpai);
  
     for (int i = 0; i < nodes.getLength(); i++) {
      Element element = (Element) nodes.item(i);

      NodeList name = element.getElementsByTagName(campo);
      Element line = (Element) name.item(0);
      campo_retorno = getCharacterDataFromElement(line);

    }
     
     
     }catch (  Exception e) {
 
  }
     
     
    return campo_retorno;
  
  }
  
  
  
  
}
}
  
  

