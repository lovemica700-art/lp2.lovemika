import java.util.Scanner;

public class Somando_diagonal_secundaria {
    final static Scanner ler = new Scanner(System.in);

    public static void main (String[] args){

        int[][] matriz = new int[6][6];

        int soma = 0;

        System.out.println("Preencha a matriz 6X6 com numeros inteiros:");


        for (int i = 0; i < matriz.length; i++ ){

            for (int j = 0; j < matriz[i].length; j++){

                System.out.print("Elemento [" + i + "][" + j + "]: ");
                 
                matriz[i][j] = ler.nextInt();

                if(i + j == matriz.length -1){
                    
                    soma += matriz[i][j];

                }
            }
        }

        System.out.println("A soma da diagonal secundaria é: "+soma);
        System.out.println("......................................");

        
    }
}

