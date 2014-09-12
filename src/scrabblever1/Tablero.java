
package scrabblever1;


public class Tablero {

    public Tablero(){
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
