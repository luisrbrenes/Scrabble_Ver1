
package scrabblever1;


public class ListaDoble {
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    
    public ListaDoble() {
        primerNodo = null;
        ultimoNodo = null;
        
    }
    
    public boolean estaVacia() {
        return primerNodo == null;
    }
    
    /*public void insertarAlFrente(String datos) {
        if(estaVacia()) {
            primerNodo = ultimoNodo = new Nodo(datos);
        }
        else {
            Nodo nodo = new Nodo(datos, primerNodo);
            primerNodo = nodo;          
        }
    }
    
    public void insertarAlFinal(String datos) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new Nodo(datos);
        }
        else {
            Nodo nodo = new Nodo(datos);
            ultimoNodo.setSiguienteNodo(nodo);
            ultimoNodo = ultimoNodo.getSiguienteNodo();
        }
    }*/
    public void insertarAlFrente(Object datos) {
        if(primerNodo==null) {
            primerNodo = new Nodo(datos,null,null);
            ultimoNodo=primerNodo;
        }
        else {          
            Nodo nodo = new Nodo(datos,primerNodo,ultimoNodo);
            primerNodo = nodo;          
        }
        
    }
    
    public void insertarAlFinal(Object datos) {
        if (estaVacia()) {
            Nodo nuevo =new Nodo(datos,null,null);
            primerNodo = ultimoNodo = nuevo;
        }
        else {
            Nodo nodo = new Nodo(datos,null, ultimoNodo);
            ultimoNodo.setSiguienteNodo(nodo);
            ultimoNodo = ultimoNodo.getSiguienteNodo();
        }      
    }
    /*public void insertarAlFrente(String datos) {
        if(primerNodo == null) {
            primerNodo = ultimoNodo = new Nodo(datos,null, null);
        }
        else{
            Nodo nuevoNodo = new Nodo(datos,null,primerNodo);
            primerNodo.setAnterioNodo(nuevoNodo);
            primerNodo = nuevoNodo;          
        }
    }
    public void insertarAlFinal(String datos) {
        if(ultimoNodo == null) {
            primerNodo = ultimoNodo = new Nodo(datos,null, null);
        }
        else {
            Nodo nuevoNodo = new Nodo(datos,ultimoNodo,null);
            ultimoNodo.setSiguienteNodo(nuevoNodo);
            ultimoNodo = nuevoNodo;          
        }
    }*/
    
    public Object eliminarDelFrente()  {
            Object datos = primerNodo.getDatos();
            primerNodo=primerNodo.getSiguienteNodo();
        if (primerNodo==null) {
            primerNodo= ultimoNodo;
        }
        else {
            primerNodo.setAnterioNodo(null);

        }
        return datos;
    }
    
    public void eliminarDelFin() {
        Object datos = ultimoNodo.getDatos();
        ultimoNodo=ultimoNodo.getAnteriorNodo();
        if (ultimoNodo==null) {
        ultimoNodo=primerNodo;
        }
        else {
            ultimoNodo.setSiguienteNodo(null);
        }           
     }
     
    public void imprimir() {
        Nodo actual = primerNodo;
        while (actual != null) {
            System.out.println(actual.getDatos());
            actual = actual.getSiguienteNodo();
        }

    }
     
 
    public boolean buscar(String datos) {
        Nodo actual = primerNodo;
        boolean encontrado=false;
        while (actual != null) {
            if (actual.getDatos().equals(datos)){
                System.out.println(true);
                encontrado= true;
            }
            actual = actual.getSiguienteNodo();
        }
        return encontrado;
    }  
    
    public int cantidadElementos(){  
        int contador=0;
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
        }
        else {
            Nodo actual = primerNodo;
            while (actual != null) {
                actual = actual.getSiguienteNodo();
                contador+=1;
            }
        }
        return contador;
    } 
    public void InsertarElePosicion(Object datos,int posicion){         
        if (posicion <= cantidadElementos()+1){
           if (posicion==1){//si la posicion es al inicio.
               insertarAlFrente(datos);
           }
           if (posicion == cantidadElementos() + 1){//si la posicion es al final. 
               insertarAlFinal(datos);
           }
           else{  
               for (int i = 1 ; i <= posicion - 2 ; i++)
                    primerNodo=primerNodo.getSiguienteNodo();
               Nodo nuevo=primerNodo.getSiguienteNodo();
               primerNodo=nuevo.getAnteriorNodo();
               ultimoNodo=nuevo.getSiguienteNodo();
           }
       } 
       else
            System.out.println("Posicion invalida");
   } 
    
     public Object ValorTopePila() {//me obtiene el valor de tope en una pila.
        for (int i = 0 ; i <= cantidadElementos()+1; i++){
            if(primerNodo.getSiguienteNodo()==null)
                break;
            else
                primerNodo=primerNodo.getSiguienteNodo();
        }
        return primerNodo.getDatos();    
    }
     
     
     /*falta una funcion para eliminar un elemento de cierta posicion,
     arreglar el de insertar en cierta posicion.*/
}  

