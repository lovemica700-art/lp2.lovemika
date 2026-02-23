import java.util.Scanner;

public class Diagonal_secundaria_menorElemento{

    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz = new int[6][6];

        int menorElemento = 0;

        System.out.println("preencha os elementos da matriz 6X6 com números inteiros! ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                System.err.println("............................");

                System.err.println("Elementos: ["+i+"] ["+j+"]");
               

                matriz[i][j] = ler.nextInt();

                if (i+j == matriz.length-1) {

                    if (i==0) {
                      menorElemento = matriz[i][j];

                    }

                    else{
                        if (matriz[i][j] < menorElemento) {
                            menorElemento = matriz[i][j];
                            
                        }
                    }
                    
                }
            }
            
        }

        System.out.println("O menor elemento da diagonal secundária é: "+menorElemento);
        System.out.println(".......................................................");

    }
}