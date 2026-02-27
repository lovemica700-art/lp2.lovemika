import java.util.Scanner;

public class Media_matriz {
    
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[][] matrizA = new int[10][10];

        int soma = 0;

        int qtd = 0;

        double media = 0;

        System.out.println("Preencha a matriz somente com elmetos inteiros!!!");
        System.out.println();

        for (int i = 0; i < matrizA.length; i++) {
            
            for (int j = 0; j < matrizA.length; j++) {
                
                System.out.println("..........................................");
                System.out.println("Elementos ["+i+"] ["+j+"]");
                matrizA[i][j] = ler.nextInt();

                if (i<j) {
                    soma += matrizA[i][j];
                    qtd++;
                }
            }
        }
        
        media = (double) soma / qtd;

        System.out.println("A soma dos elementos acima da diagonal principal da matriz 10X10 é: ");
        System.out.printf("%.4f",media);
    }
}
