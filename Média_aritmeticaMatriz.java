
import java.util.Scanner;

public class Média_aritmeticaMatriz {

    final static Scanner ler =new Scanner(System.in);

    public static void main(String[] args) {
        
        int[][] matrizA = new int[4][4];

        int soma = 0;

        int qtd = 0;

        double media = 0;

        System.out.println("Preencha a mstriz somente com números interos!!!");
        System.out.println();

        for (int i = 0; i < matrizA.length; i++) {
            
            for (int j = 0; j < matrizA.length; j++) {
                
                System.out.println("...................................");
                System.out.println("Elementos ["+i+"] ["+j+"]: ");
                matrizA[i][j] = ler.nextInt();

                if (i>j) {
                    soma += matrizA[i][j];
                    qtd++;
                    
                }
                media = (double)soma/qtd;
            }
        }

        System.out.println();
        System.out.println(".....................................");
        System.out.println("A média aritmética da matriz 12X12 é:");
        System.out.printf("%.4f    ",media);

    }
}