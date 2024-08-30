import java.util.Scanner;

public class Questao10A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas e colunas (deve ser igual): ");
        int tamanho = scanner.nextInt();
        
        String Digito1 = "*";
        String Digito2 = "%";
        String Digito3 = "&";

        for (int contadorDaLinha = 0; contadorDaLinha < tamanho; contadorDaLinha++) {
            if (contadorDaLinha == 0 || contadorDaLinha == tamanho - 1) {
                for (int i = 0; i < tamanho; i++) {
                    System.out.print(Digito1);
                }
                System.out.println();
            } else if (contadorDaLinha == 1 || contadorDaLinha == tamanho - 2) {
                for (int i = 0; i < tamanho; i++) {
                    if (i < tamanho / 2 - 1 || i > tamanho / 2) {
                        System.out.print(Digito1);
                    } else if (i == tamanho / 2) {
                        System.out.print(Digito2);
                    }
                }
                System.out.println();
            } else if (contadorDaLinha == 2 || contadorDaLinha == tamanho - 3) {
                for (int i = 0; i < tamanho; i++) {
                    if (i < tamanho / 2 - 2 || i == tamanho / 2 || i > tamanho / 2 + 1) {
                        System.out.print(Digito1);
                    } else if (i == tamanho / 2 - 1 || i == tamanho / 2 + 1) {
                        System.out.print(Digito2);
                    }
                }
                System.out.println();
            } else if (contadorDaLinha == 3 || contadorDaLinha == tamanho - 4) {
                for (int i = 0; i < tamanho; i++) {
                    if (i < tamanho / 2 - 3 || (i > tamanho / 2 - 1 && i < tamanho / 2 + 2) || i > tamanho / 2 + 2) {
                        System.out.print(Digito1);
                    } else if (i == tamanho / 2 - 2 || i == tamanho / 2 + 2) {
                        System.out.print(Digito2);
                    }
                }
                System.out.println();
            } else if (contadorDaLinha == 4 || contadorDaLinha == tamanho - 5) {
                for (int i = 0; i < tamanho; i++) {
                    if (i == 0 || i == tamanho / 2 - 2 || i == tamanho / 2 + 2 || i == tamanho - 1) {
                        System.out.print(Digito1);
                    } else if (i == 1 || i == tamanho - 2) {
                        System.out.print(Digito2);
                    } else if (i == tamanho / 2 - 1 || i == tamanho / 2 || i == tamanho / 2 + 1) {
                        System.out.print(Digito3);
                    }
                }
                System.out.println();
            } else {
                for (int i = 0; i < tamanho; i++) {
                    System.out.print(Digito1);
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
