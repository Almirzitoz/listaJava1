import java.util.Scanner;

public class Questao10G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas e colunas (deve ser igual): ");
        int tamanho = scanner.nextInt();
        
        int contador = 0;
        String Digito1 = "*";
        String Digito2 = "%";
        String Digito3 = "&";
        
        while (contador < tamanho) {
            if (contador % 2 == 0) {
                for (int i = 0; i < tamanho; i++) {
                    if (i < tamanho / 3) {
                        System.out.print(Digito1);
                    } else if (i == tamanho / 3) {
                        System.out.print(Digito3);
                    } else {
                        System.out.print(Digito2);
                    }
                }
                contador++;
                System.out.println();
            } else {
                for (int i = 0; i < tamanho; i++) {
                    if (i <= tamanho / 3) {
                        System.out.print(Digito1);
                    } else if (i == tamanho / 3 + 1) {
                        System.out.print(Digito3);
                    } else {
                        System.out.print(Digito2);
                    }
                }
                contador++;
                System.out.println();
            }
        }
        
        scanner.close();
    }
}