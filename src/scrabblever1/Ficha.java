
package scrabblever1;


public class Ficha{
    
    private String letra;//letra de una ficha.
    private COMODIN comodines;
    enum COMODIN{ES_COMODIN,NO_COMODIN}
    
   
    public Ficha(){//Constructor.
        
    }
    
    public Ficha(String pletra){
        
    }  
       
    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public COMODIN getComodines() {
        return comodines;
    }

    public void setComodines(COMODIN comodines) {
        this.comodines = comodines;
    }
    
    
    

}
    
    
  
    
