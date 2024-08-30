import java.util.Scanner;

public class Questao10H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas e colunas (deve ser igual): ");
        int tamanho = scanner.nextInt();
        
        int contador = 0;
        String Digito1 = "*";
        String Digito3 = "&";
        
        while (contador < tamanho) {
            if (contador < tamanho / 4 || contador >= 3 * tamanho / 4) {
                for (int index = 0; index < tamanho; index++) {
                    System.out.print(Digito1);
                }
                contador++;
                System.out.println();
            } else {
                for (int i = 0; i < tamanho; i++) {
                    if (i < tamanho / 4 || i >= 3 * tamanho / 4) {
                        System.out.print(Digito1);
                    } else {
                        System.out.print(Digito3);
                    }
                }
                contador++;
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
