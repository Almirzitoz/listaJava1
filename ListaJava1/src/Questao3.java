import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma palavra:");
        String palavra = scanner.nextLine();
        char[] letras = palavra.toCharArray();
        
        for (int i = 0; i < letras.length / 2; i++) {
            char temp = letras[i];
            letras[i] = letras[letras.length - 1 - i];
            letras[letras.length - 1 - i] = temp;
        }
        
        String palavraInvertida = new String(letras);
        if (palavra.equals(palavraInvertida)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
        
        scanner.close();
    }
}
