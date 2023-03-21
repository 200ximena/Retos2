import java.util.Scanner;

public class Reto_1{
    public  static void main (String []args){ 
        Scanner lector=new Scanner(System.in);

        int notas [];
        double  promedio=0;
        int n;
        int suma=0;

        System.out.println("Ingrese cuantas notas quiere guardar");
        n=lector.nextInt();
        notas = new int [n];

        for (int i=0; i<n; i++ ){
        System.out.println("Ingresar la  nota" +i);
        notas[i] =lector.nextInt();
        }
    
        System.out.println();

        for(int i=0; i<n; i++){
        System.out.println(+notas[i]);

        }
    for(int i=0; i<n; i++){
        suma=suma +notas[i];
        
    }
    promedio=suma/n; 
    System.out.println("el promedio es: " +promedio);
    
    if (promedio<30){
        System.out.println("Reprobado");
    }
    else if (promedio >= 30 && promedio <= 40){
        System.out.println("Quedaste raspando");
    }
    else if (promedio > 40){
        System.out.println("Aprobo con buenos resultados");
    }
    lector.close();
    }
}

