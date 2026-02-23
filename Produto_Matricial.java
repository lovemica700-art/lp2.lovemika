import java.util.Scanner;

public class Produto_Matricial{

    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrizA = new int[4][6];

        int[][] matrizB = new int[6][4];

        int[][] matrizC = new int[4][4];

        System.out.println(" Preencha os elementos da matriz A 4X6 com números inteiros! ");

        //matriz A
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {

                System.err.println("............................");

                System.err.println("Elementos: ["+i+"] ["+j+"]");

                matrizA [i][j] = ler.nextInt();

                
            }
            
        }

        System.out.println(" Preencha os elementos da matriz B 6X4 com números inteiros! ");

        //matriz B
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {

                System.err.println("............................");

                System.err.println("Elementos: ["+i+"] ["+j+"]");

                matrizB [i][j] = ler.nextInt();
                
            }
            
        }

        //Calculo
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                matrizC[i][j] = 0;

                for (int c = 0; c < matrizC.length; c++) {
                    matrizC[i][j] += matrizA[i][j] *matrizB[i][j];
                }
            }

        }

        //matriz C
        System.out.println();
        System.out.println("Matriz C = matrizA * matrizB: ");
        System.out.println();
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                System.out.printf("|%6d", matrizC[i][j]);
            }
        }
    }
}