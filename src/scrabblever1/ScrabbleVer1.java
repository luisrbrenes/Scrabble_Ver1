package scrabblever1;


public class ScrabbleVer1 {

    public static void main(String[] args) {
    PrincipalGui gui = new PrincipalGui();
    gui.setVisible(true);
    Tablero tab=new Tablero();
   // tab.imprimirMesa();
    tab.creaFichas();
    
    }
    
}
 