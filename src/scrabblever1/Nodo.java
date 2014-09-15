
package scrabblever1;


public class Nodo {
    private Object datos;
    private Nodo siguienteNodo;
    private Nodo anteriorNodo;
    
    public Nodo(Object dato, Nodo sig, Nodo ant){
        datos=dato;
        siguienteNodo= sig;
        anteriorNodo=ant;
    }
    Nodo(String datos) {
        this.datos = datos;
        this.siguienteNodo = null;        
    }
    
    Nodo(String objeto, Nodo nodo) {
        this.datos = objeto;
        this.siguienteNodo = nodo;
    }
    
    public void setDatos(Object datos) {
        this.datos = datos;
    }
    public  Object getDatos() {
        return datos;
    }

    public void setSiguienteNodo(Nodo siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
    
    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }
    public void setAnterioNodo(Nodo anteriorNodo){
        this.anteriorNodo= anteriorNodo;
        
    }
   public Nodo getAnteriorNodo(){
       return anteriorNodo;
   }
}
