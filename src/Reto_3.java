import java.util.Scanner;

public class Reto_3{
    public  static void main (String []args){ 
        Scanner lector=new Scanner(System.in);

        
        String  nombres []=new String [4];
        String precios []=new String [4];
        System.out.println("Esta es la maquina expendedora de dulces con capacidad de 16 dulces y su respectivo precio!!");
            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    System.out.println("ingrese el nombre del producto " +i);
                    nombres[i]=lector.next();
                    System.out.println("ingrese el precio del producto "  +j);
                    precios[j]=lector.next();
                    String maquina [] []=new String [i][j];

                }
            }for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    System.out.print(nombres[i]+("\t")+precios[j]);
                }
                System.out.println();

            }
    lector.close();
    }
}














/*import java.util.Scanner;

public class Reto_3{
    public  static void main (String []args){ 
        Scanner lector=new Scanner(System.in);

        int n;
        System.out.println("Digite cuantos productos va a registar en la maquina ");
        n=lector.nextInt();
        String maquina [] [];
        int  nombres=0;
        int precios=0;
        if (n <= 16){
            maquina= new String [n][n];
            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    System.out.println("ingrese el nombre del producto " +i);
                    maquina[i][j]=lector.next();
                    System.out.println("ingrese el precio del producto "  +j);
                    maquina[i][j]=lector.next();
                    maquina= new String [nombres][precios];


                }
            }for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    System.out.print(maquina [i][j] +" ");
                }
                System.out.println();

            }
        }else{
            System.out.println("La maquina solo registra 16 productos, intentelo nuevamente");
        }


    lector.close();
    }
}*/