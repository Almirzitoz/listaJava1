import java.util.Scanner;

public class Questao10E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas e colunas (deve ser igual): ");
        int tamanho = scanner.nextInt();
        
        int contador = 0;
        String Digito1 = "*";
        String Digito3 = "&";
        
        while (contador < tamanho) {
            if (contador < tamanho / 3 || contador >= 2 * tamanho / 3) {
                for (int i = 0; i < tamanho; i++) {
                    if (i < tamanho / 3 || i >= 2 * tamanho / 3) {
                        System.out.print(Digito1);
                    } else {
                        System.out.print(Digito3);
                    }
                }
                System.out.println();
                contador++;
            } else {
                for (int i = 0; i < tamanho; i++) {
                    System.out.print(Digito3);
                }
                System.out.println();
                contador++;
            }
        }
        
        scanner.close();
    }
}
