import java.util.Scanner;

public class preenchimento {
      final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int[] vet1 = new int[10];

//        int n = ler.nextInt();
        vet1[0] = ler.nextInt();;
        
        for (int i = 1; i < vet1.length; i++) {
           // vet1[1] = n;
            vet1[i] = vet1[i-1]*2;
        }

        for (int i = 0; i < vet1.length; i++) {
            System.out.println("N["+i+"] = "+vet1[i]);
        }
    }
}
