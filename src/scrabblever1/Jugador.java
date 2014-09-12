
package scrabblever1;


public class Jugador {//se crea la clase Jugador.
    
    private int puntaje;//se inicializa el atributo puntaje.
    private int numeroDeJugador=0;//se inicializa el atributo numeroJugador.
    //falta el arreglo o baraja de fichas del jugador. 
       
    public Jugador(){ //el constructor de la clase.
        this.numeroDeJugador=0;
        this.puntaje=0;
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