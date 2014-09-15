
package scrabblever1;


public class Jugador {//se crea la clase Jugador.
    
    private int puntaje;//se inicializa el atributo puntaje.
    private int numeroDeJugador=0;//se inicializa el atributo numeroJugador.
    private ListaDoble baraja=new ListaDoble();
    
     public Jugador(){ //el constructor de la clase.
        this.numeroDeJugador=0;
        this.puntaje=0;
    }
     
     
    public int getNumeroDeJugador() {
        return numeroDeJugador;
    }

    public void setNumeroDeJugador(int numeroDeJugador) {
        this.numeroDeJugador = numeroDeJugador;
    }

    public ListaDoble getBaraja() {
        return baraja;
    }

    public void setBaraja(ListaDoble baraja) {
        this.baraja = baraja;
    }
       
    public int getPuntaje() { //obtiene el puntaje.
        return puntaje;
    }

    public void setPuntaje(int puntaje) {//setea el puntaje.
        this.puntaje = puntaje;
    }

    public int getNumeroJugador() {//obtiene el numero o indicador del jugador.
        return numeroDeJugador;
    }

    public void setNumeroJugador(int numeroJugadores) {//setea el indicador del jugador.
        this.numeroDeJugador = numeroJugadores;
    }

}