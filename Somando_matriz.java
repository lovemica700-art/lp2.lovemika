
import java.util.Scanner;

public class Somando_matriz {
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
         int[][] matriz = new int[5][5];

         int soma = 0;

         System.out.println("Preencha a matriz com numeros inteiros 5X5 ");

         for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = ler.nextInt();

                soma += matriz[i][j];
                
            }
            
         }

         System.out.println(".......................................");
         System.out.println("A soma dos elementos da matriz é: "+soma);
         System.out.println("........................................");
    }
}
