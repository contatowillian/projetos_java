import java.io.ByteArrayInputStream;
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

 class Webservice2 {
    
    private static String retorno;
    
    private static String Printa_retorno;

        public static  void main(String args[]) throws Exception {
               

            Printa_retorno =  Webservice_tempo();
          
            System.out.print(Printa_retorno);
            
        }
 
        
        public  static String Webservice_tempo() throws Exception{
            
             try {
             // Create SOAP Connection
                SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
                SOAPConnection soapConnection = soapConnectionFactory.createConnection();
                

                // Send SOAP Message to SOAP Server
                String wsdlURL = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx";
                
                
                String requestSoap;
                requestSoap =  "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">\n"
                     + "   <soapenv:Header/>\n"
                     + "   <soapenv:Body>\n"
                     + "      <tem:CalcPrazo>\n"
                     + "         <tem:nCdServico>40010</tem:nCdServico>\n"
                     + "         <tem:sCepOrigem>01207000</tem:sCepOrigem>\n"
                     + "         <tem:sCepDestino>01504001</tem:sCepDestino>\n"
                     + "      </tem:CalcPrazo>\n"
                     + "   </soapenv:Body>\n"
                     + "</soapenv:Envelope>";
                   
                   
                    MimeHeaders headers = new MimeHeaders();
                    headers.addHeader("Content-Type", "text/xml");

                    //exclua esta regiao caso o webservice nao possua a proprieade SOAPAction
                    headers.addHeader("SOAPAction", "http://tempuri.org/CalcPrazo");
                    
                MessageFactory messageFactory = MessageFactory.newInstance();
                SOAPMessage msg = messageFactory.createMessage(headers, (new ByteArrayInputStream(requestSoap.getBytes())));
                
                SOAPMessage soapResponse = soapConnection.call(msg, wsdlURL);
                
                
 
                soapResponse.getAttachments();
 
                soapConnection.close();
                
                StringWriter sw = new StringWriter();  
                
                 Source source = new DOMSource(soapResponse.getSOAPPart().getEnvelope().getBody().getFirstChild().getFirstChild());  
                TransformerFactory.newInstance().newTransformer().transform(source, new StreamResult(sw));  
      
                
                
                // print SOAP Response
               //System.out.print(soapResponse);
               //soapResponse.writeTo(System.out);
                
                 Document xmlRespostaARequisicao=soapResponse.getSOAPBody().getOwnerDocument();
              
                  String retorno = (passarXMLParaString(xmlRespostaARequisicao,4));
                  
                   return retorno;
              
                //return retRecepcaoString;
                }catch (TransformerException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.exit(0);
                }
             
             return null;
        }
        
        
        
        public static String passarXMLParaString(Document xml, int espacosIdentacao){
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
     
        
        

        private static SOAPMessage createSOAPRequest() throws Exception {
                
                   
                // Create message
                MessageFactory mf = MessageFactory.newInstance();
                SOAPMessage msg = mf.createMessage();

                // Add eventually a SoapAction header if necessary

                MimeHeaders hd = msg.getMimeHeaders(); 
                hd.addHeader("Content-Type", "text/xml; ");
                // hd.addHeader("SOAPAction", "http://tempuri.org/CalcPrazo");

                // Object for message parts
                SOAPPart sp = msg.getSOAPPart();

                SOAPEnvelope env = sp.getEnvelope();

                SOAPBody bd = env.getBody();

                // Populate body
                // Main element and namespace
                SOAPElement be = bd.addChildElement(env.createName("CalcPrazo", "", "http://tempuri.org"));

                
                    
                
                // Add content
                 be.addChildElement("nCdServico").addTextNode("40010");
                be.addChildElement("sCepOrigem").addTextNode("01207000");
                be.addChildElement("sCepDestino").addTextNode("01504001");
                // Save message
                msg.saveChanges();
                
  
 
                return msg;
        }
}