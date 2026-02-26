import java.util.Scanner;

public class Multiplicação_Matrizes {
    
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
             
        int[][] matrizA = new int[6][6];

       

        int cont = 0;

        int[] vetA = new int[cont];

        System.out.println("Digite o número que multiplicara a matriz");

        int numA = ler.nextInt();

        System.out.println("...........................................");

        for (int i = 0; i < matrizA.length; i++) {
            
            for (int j = 0; j < matrizA.length; j++) {

                System.out.print("Elementos ["+i+"] ["+j+"]");
                matrizA [i][j] = ler.nextInt();

                
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                vetA[cont] = matrizA[i][j] * numA;
                cont ++;
            }
        }

        for (int i = 0; i < vetA.length; i++) {
            System.out.println("............................................");
            System.out.println(vetA);
        }
    }
}
