public class Questao1F {
    public static void main(String[] args) {
        int inicio = 0;
        while (inicio <= 1000) {
            if (inicio%4 == 0) {
                System.out.print(inicio+ ",");
            }
            inicio++;
        }
    }
}
