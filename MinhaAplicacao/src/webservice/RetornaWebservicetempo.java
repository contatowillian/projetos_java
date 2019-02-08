package webservice;

import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.w3c.dom.Document;

public class RetornaWebservicetempo {
    
    private static String retorno;
    private static String Printa_retorno;
    private static String Cidade;
    private static String Pais;


        public static  void main(String args[]) throws Exception {
          
            
        }
 
        
        public  static String RetornaWebservicetempo(String Cidade , String Pais) {
            
             try {
             // Create SOAP Connection
                SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
                SOAPConnection soapConnection = soapConnectionFactory.createConnection();
                

                // Send SOAP Message to SOAP Server
                String wsdlURL = "http://www.webservicex.net/globalweather.asmx";
                
                
                
                SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(Pais,Cidade), wsdlURL);
 
                soapResponse.getAttachments();
                soapConnection.close();
                StringWriter sw = new StringWriter();  
                
                 Source source = new DOMSource(soapResponse.getSOAPPart().getEnvelope().getBody().getFirstChild().getFirstChild());  
                TransformerFactory.newInstance().newTransformer().transform(source, new StreamResult(sw));  
      
                
                
                // print SOAP Response
               //System.out.print(soapResponse);
               //soapResponse.writeTo(System.out);
                
                 Document xmlRespostaARequisicao=soapResponse.getSOAPBody().getOwnerDocument();
              
                  String retorno = (passarXMLParaString(xmlRespostaARequisicao,4 ));
                  String sentence = retorno.replace("&gt;", "/>");
                  String sentence2 = sentence.replace("&lt;/", "</");
                  String sentence3 = sentence2.replace("&lt;", "</");
                  

                   return sentence3;
              
                //return retRecepcaoString;
                }catch (  Exception e) {
                //  Utils.log("Properties file not found",System.err);
                 // return false;
                }
             
             return null;
        }
        
        
        
        public static String passarXMLParaString(Document xml, int espacosIdentacao ){
        try {
            //set up a transformer
            TransformerFactory transfac = TransformerFactory.newInstance();
            transfac.setAttribute("indent-number", new Integer(espacosIdentacao));
            Transformer trans = transfac.newTransformer();
            trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            trans.setOutputProperty(OutputKeys.INDENT, "yes");
 
            //create string from xml tree
            StringWriter sw = new StringWriter();
            StreamResult result = new StreamResult(sw);
            DOMSource source = new DOMSource(xml);
            trans.transform(source, result);
            String xmlString = sw.toString();
            return xmlString;
        }
        catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(0);
        }
        return null;
    }
     
        
        

        private static SOAPMessage createSOAPRequest(String Cidade , String Pais){
                
                try {
                // Create message
                MessageFactory mf = MessageFactory.newInstance();
                SOAPMessage msg = mf.createMessage();

                // Add eventually a SoapAction header if necessary

                MimeHeaders hd = msg.getMimeHeaders(); 
                //hd.addHeader("Content-Type", "text/xml; ");
                hd.addHeader("SOAPAction", "http://www.webserviceX.NET/GetWeather");

                // Object for message parts
                SOAPPart sp = msg.getSOAPPart();

                SOAPEnvelope env = sp.getEnvelope();

                SOAPBody bd = env.getBody();

                // Populate body
                // Main element and namespace
                SOAPElement be = bd.addChildElement(env.createName("GetWeather", "", "http://www.webserviceX.NET"));

                // Add content
                be.addChildElement("CountryName").addTextNode(Pais);
                be.addChildElement("CityName").addTextNode(Cidade);

                // Save message
                msg.saveChanges();
                
                 return msg;
                
                }catch (  Exception e) {
                //  Utils.log("Properties file not found",System.err);
                 // return false;
                }

                return null;
        }
}