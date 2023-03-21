import java.util.Scanner;

public class Reto_4{

    public static void main(String []ars) {
        Scanner lectura= new Scanner (System.in); 
        int [][] concentrate;
        int filas;
        int columnas;

        
        System.out.println("digite las filas ");
        filas=lectura.nextInt();
        System.out.println("digite las columnas ");
        columnas=lectura.nextInt();
        concentrate= new int[filas][columnas];
    
        for(int i=0; i<filas; i++ ){
            for(int j=0; j<columnas; j++){
                System.out.println("ingrese un numero " +i + j);
                concentrate[i][j]=lectura.nextInt();
                
            }
        }
        for(int i=0; i<filas; i++ ){
            for(int j=0; j<columnas; j++){
                System.out.print(concentrate [i][j] +" ");
            }
            System.out.println();


        }
        
        for(int i=0; i<filas; i++ ){
            for(int j=0; j<columnas; j++){
               
/*????????????????????????????????????????*/ 
            }
            System.out.println();
        }


        lectura.close();
    }
} 