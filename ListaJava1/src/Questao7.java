public class Questao7 {

    public static void main(String[] args) {
        int[] numeros1 = { 1, 2, 3, 4 };
        int[] numeros2 = { 5, 6, 7, 8 };
        int[] numero3 = { 9, 10, 11, 12 };
        questaoAeB(numeros1, numeros2, numero3);
    }

    public static void questaoAeB(int numero1[], int numero2[], int numero3[]) {
        int soma1 = 0;
        int soma2 = 0;
        int soma3 = 0;
        for (int i = 0; i < numero1.length; i++) {
            soma1 += numero1[i];
        }
        for (int i = 0; i < numero2.length; i++) {
            soma2 += numero2[i];
        }
        for (int i = 0; i < numero3.length; i++) {
            soma3 += numero3[i];
        }
        System.out.println("Somas: " + soma1 + "," + soma2 + "," + soma3);
        int produto1 = 1;
        int produto2 = 1;
        int produto3 = 1;
        for (int i = 0; i < numero1.length; i++) {
            produto1 *= numero1[i];
        }
        for (int i = 0; i < numero2.length; i++) {
            produto2 *= numero2[i];
        }
        for (int i = 0; i < numero3.length; i++) {
            produto3 *= numero3[i];
        }
        System.out.println("Produtos: " + produto1 + "," + produto2 + "," + produto3);

        double media1 = soma1 / numero1.length;
        double media2 = soma2 / numero2.length;
        double media3 = soma3 / numero3.length;
        System.out.println("Médias: " + media1 + "," + media2 + "," + media3);
        
        int[] listaSomas = {soma1,soma2,soma3};
        int[] listaProdutos = {produto1,produto2,produto3};
        double[] listaMedias = {media1,media2,media3};

        questaoC(listaSomas, listaProdutos, listaMedias);
    }

    public static void questaoC(int somas[],int produtos[],double medias[]){
        int somaFinal= 0;
        double mediaTrasicao = 0;
        double mediaFinal = 0;
        int produtoFinal = 1;
        for (int i = 0; i < somas.length; i++) {
             somaFinal += somas[i];
        }

        for (int i = 0; i < produtos.length; i++) {
            produtoFinal *= produtos[i];
        }

        for (int i = 0; i < medias.length; i++) {
            mediaTrasicao += medias[i];
        }
        mediaFinal = mediaTrasicao/medias.length;
        System.out.println("Soma das somas: "+somaFinal);
        System.out.println("Produto dos produtos: "+produtoFinal);
        System.out.println("Média das médias: "+mediaFinal);
        
    }
    
}
