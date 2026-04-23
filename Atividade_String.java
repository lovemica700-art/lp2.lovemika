import java.util.Scanner;

public class Atividade_String{
    final static Scanner MK = new Scanner(System.in);
    
    public static void main(String[] args) {
        String nome = MK.nextLine();

        String result = nome.toUpperCase();//maiusculo

        String resulb = nome.toLowerCase();//minusculo

       int numCarctere = nome.length();

       String qtdCaracter = nome.substring(0,3);
       System.out.println(qtdCaracter);


        

    }
}