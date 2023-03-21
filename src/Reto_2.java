import java.util.Scanner;

public class Reto_2{
    public  static void main (String []args){ 
        Scanner lector=new Scanner(System.in);

        int nCompetidores;
        System.out.println("digite cuantos competidores va a guardar");
        nCompetidores=lector.nextInt();
        String [] nombresComp=new String [nCompetidores];
        double [] tiempoComp=new double [nCompetidores];
        for(int i=0; i<nCompetidores; i++){
            System.out.println("digite el nombre del  competidor" +i);
            nombresComp[i]=lector.next();
            System.out.println("digite el tiempo del  competidor" +i);
            tiempoComp[i]=lector.nextDouble();
        }

        System.out.println();

        for(int i=0; i<nCompetidores; i++){

        System.out.println(nombresComp[i]+ ("\t")+tiempoComp[i] );
        }

        for(int i=0; i<nCompetidores; i++){
            /*???? */
        }
    lector.close();
    }
}
