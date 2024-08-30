import java.util.Scanner;

public class Questao10B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas e colunas (deve ser igual): ");
        int tamanho = scanner.nextInt();
        
        String Digito1 = "*";
        String Digito2 = "%";
        String Digito3 = "&";
        
        int contador1 = 0;
        
        while (contador1 < tamanho / 3) {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(Digito1);
            }
            System.out.println();
            contador1++;
        }

        while (contador1 < 2 * tamanho / 3) {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(Digito2);
            }
            System.out.println();
            contador1++;
        }

        while (contador1 < tamanho) {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(Digito3);
            }
            System.out.println();
            contador1++;
        }
        
        scanner.close();
    }
}
