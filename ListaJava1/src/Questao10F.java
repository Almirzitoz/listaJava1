import java.util.Scanner;

public class Questao10F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas e colunas (deve ser igual): ");
        int tamanho = scanner.nextInt();
        
        int contador = 0;
        String Digito1 = "*";
        String Digito2 = "$";
        String Digito3 = "&";
        
        while (contador < tamanho) {
            if (contador == 0 || contador == 2) {
                for (int i = 0; i < tamanho; i++) {
                    if (i < tamanho / 3) {
                        System.out.print(Digito1);
                    } else {
                        System.out.print(Digito2);
                    }
                }
                System.out.println();
                contador++;
            } else if (contador == 1 || contador == 3) {
                for (int i = 0; i < tamanho; i++) {
                    if (i < tamanho / 3) {
                        System.out.print(Digito1);
                    } else {
                        System.out.print(Digito3);
                    }
                }
                System.out.println();
                contador++;
            } else if (contador == 4 || contador == 6 || contador == 8) {
                for (int i = 0; i < tamanho; i++) {
                    System.out.print(Digito2);
                }
                System.out.println();
                contador++;
            } else if (contador == 5 || contador == 7) {
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
