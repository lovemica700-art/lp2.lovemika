
import java.util.Scanner;

public class Maior_elemento_diagonalPrincipal {
    
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrizA = new int[8][8];

        double[][] matrizB = new double[8][8];

        int maiorElemnto = Integer.MIN_VALUE;//É uma constante da classe Integer que representa o menor valor possível que um int pode armazenar, assim facilitano a busca do maior valor.

        System.out.println("Preencha a matrizA 8X8 com numeros inteiros! ");
         
        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA[i].length; j++) {

                System.err.println("............................");

                System.err.println("Elementos: ["+i+"] ["+j+"]");

                matrizA[i][j] = ler.nextInt();
                
                if (i==j) {

                    if (matrizA[i][j] > maiorElemnto) {
                        maiorElemnto = matrizA[i][j];

                    }
                }
            }
            
        }

        for (int i = 0; i < matrizB.length; i++) {
            
            for (int j = 0; j < matrizB[i].length; j++) {

                if(maiorElemnto != 0){

                    matrizB[i][j] = (double) matrizA[i][j]/maiorElemnto;
                }else{
                    matrizB[i][j] = 0;
                }
                
               
            }
        }

        System.out.println("O maior elemento da matriz A é: "+maiorElemnto);
        System.out.println(".............................................");
        
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("%6.2f", matrizB[i][j]);
            }
            System.out.println();
        }

       

    }
}
