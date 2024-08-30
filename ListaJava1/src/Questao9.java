public class Questao9 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String[] nomesProdutos = new String[100];
        int[] quantidadesEstoque = new int[100];
        int numeroProdutos = 0;

        while (true) {
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Consultar quantidade de um produto");
            System.out.println("3. Atualizar estoque de um produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Quantidade em estoque: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();
                nomesProdutos[numeroProdutos] = nome;
                quantidadesEstoque[numeroProdutos] = quantidade;
                numeroProdutos++;
                System.out.println("Produto cadastrado!");
            } else if (opcao == 2) {
                System.out.print("Nome do produto: ");
                String nome = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < numeroProdutos; i++) {
                    if (nomesProdutos[i].equals(nome)) {
                        System.out.println("Quantidade em estoque de " + nome + ": " + quantidadesEstoque[i]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Produto não encontrado.");
                }
            } else if (opcao == 3) {
                System.out.print("Nome do produto: ");
                String nome = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < numeroProdutos; i++) {
                    if (nomesProdutos[i].equals(nome)) {
                        System.out.print("Nova quantidade em estoque: ");
                        int novaQuantidade = scanner.nextInt();
                        scanner.nextLine();
                        atualizarEstoque(quantidadesEstoque, i, novaQuantidade);
                        System.out.println("Estoque atualizado!");
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Produto não encontrado.");
                }
            } else if (opcao == 4) {
                System.out.println("Saindo");
                break;
            } else {
                System.out.println("Opção inválida tente novamente.");
            }
        }
        scanner.close();
    }

    public static void atualizarEstoque(int[] quantidades, int indice, int novaQuantidade) {
        quantidades[indice] = novaQuantidade;
    }
}
