//import java.util.Random;
import java.util.Scanner;

public class Selecao {
    
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        Double[] vetA = new Double[100];

        //Random rand = new Random();

        Double min = 10.0;

        for (int i = 0; i <5 /*vetA.length*/; i++) {
            //vetA[i] = rand.nextDouble() *100;
            vetA[i] = ler.nextDouble();

            
        }

        for (int i = 0; i < 5; i++) {
            

            if (vetA[i] <= min) {
                System.out.printf("A[%d] = %.1f%n", i, vetA[i]);
            }
        }
    }
}
