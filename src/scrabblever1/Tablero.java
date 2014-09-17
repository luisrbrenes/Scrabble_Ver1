
package scrabblever1;
import java.util.Collections;

public class Tablero {

    public Tablero(){
    }
    
    public void creaFichas(){
        ListaDoble fichas = new ListaDoble();
        Ficha fic=new Ficha();
        fic.setLetra("l");
        fichas.insertarAlFinal(fic);
        for (int i=1;i<=2;i++){
            Ficha comodin = new Ficha();
            comodin.setComodines(Ficha.COMODIN.ES_COMODIN);
            fichas.insertarAlFinal(comodin);
            System.out.println(comodin.getLetra()+"\t");
        }
        
        
            //System.out.println(comodin.getComodines());
        for(int x=1; x<=99;x++){
            Ficha ficha=new Ficha();
            ficha.setComodines(Ficha.COMODIN.NO_COMODIN);
            if (x<=12)
                ficha.setLetra("E");
            if (x>12 && x<=21)
                ficha.setLetra("A");
            if (x>21 && x<=30)
                ficha.setLetra("I");
            if (x>30 && x<=38)
                ficha.setLetra("O");
            if (x>38 && x<=44)
                ficha.setLetra("N");
            if (x>44 && x<=50)
                ficha.setLetra("R");
            if (x>50 && x<=56)
                ficha.setLetra("T");
            if (x>56 && x<=60)
                ficha.setLetra("L");
            if (x>60 && x<=64)
                ficha.setLetra("S");
            if (x>64 && x<=68)
                ficha.setLetra("U");
            if (x>68 && x<=72)
                ficha.setLetra("D");
            if (x>72 && x<=75)
                ficha.setLetra("G");
            if (x>75 && x<=77)
                ficha.setLetra("B");
            if (x>77 && x<=79)
                ficha.setLetra("C");
            if (x>79 && x<=82)
                ficha.setLetra("M");
            if (x>82 && x<=84)
                ficha.setLetra("P");
            if (x>84 && x<=86)
                ficha.setLetra("F");
            if (x>86 && x<=88)
                ficha.setLetra("H");
            if (x>88 && x<=90)
                ficha.setLetra("V");
            if (x>90 && x<=92)
                ficha.setLetra("W");
            if (x>92 && x<=94)
                ficha.setLetra("Y");
            if (x>94 && x<=95)
                ficha.setLetra("K");
            if (x>95 && x<=96)
                ficha.setLetra("J");
            if (x>96 && x<=97)
                ficha.setLetra("X");
            if (x>97 && x<=98)
                ficha.setLetra("Q");
            if (x>98 && x<=99)
                ficha.setLetra("Z");
        fichas.insertarAlFinal(ficha);
        System.out.println(ficha.getLetra()+"\t");
      
        }
        //fichas.InsertarElePosicion(fic,6);
        //System.out.println(fichas.buscar(fic.getLetra()));
        //System.out.println(fichas.buscar("Z"));
        //for(int i = 0; i<fichas.size;i++){//para desordenar las fichas. 
            
        //}    
        /*System.out.println("fichas ordenadas");
        for(int i = 0; i<fichas.size();i++){            
           
            System.out.print(fichas.get(i).getNumeroFicha() +
                    " "+ fichas.get(i).getColorFicha().toString()+", ");
        }*/
    }
    
    public void desordenarFichas(){
       // Collections.shuffle(fichas);
       
    }
    public void imprimirMesa(){
        int fila=0;
        System.out.println("colum0"+"\t"+"colum1"+"\t"+"colum2"+"\t"+"colum3"+"\t"+"colum4"+"\t"+"colum5"+"\t"+"colum6"+"\t"+"colum7"+"\t"+"colum8"+"\t"+"colum9"+"\t"+"colum10"+"\t"+"colum11"+"\t"+"colum12"+"\t"+"colum13"  );
        System.out.println();
        for(int i=0;i<15;i++){
           for(int j=0;j<15.;j++){
               System.out.print("--\t");
           }
           System.out.println("\t"+"FILA" + fila);
           fila++;
            }
            System.out.println();

   }
}
