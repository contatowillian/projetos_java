/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/



/**
 *
 * @author willian.batista
 */
public class WSDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //String retorno = getWeather_1("Guarulhos", "BRazil");
        
       // System.out.println(retorno);
        
    }

  

    private static String getWeather_1(java.lang.String cityName, java.lang.String countryName) {
        net.webservicex.GlobalWeather service = new net.webservicex.GlobalWeather();
        net.webservicex.GlobalWeatherSoap port = service.getGlobalWeatherSoap12();
        return port.getWeather(cityName, countryName);
    }
    
}
