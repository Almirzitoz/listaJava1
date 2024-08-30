public class Questao2E {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 16, 16, 17};
        int[] frequencia = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    frequencia[i]++;
                }
            }
        }
        int moda = numeros[0];
        int maxFrequencia = frequencia[0];
        for (int i = 1; i < numeros.length; i++) {
            if (frequencia[i] > maxFrequencia) {
                maxFrequencia = frequencia[i];
                moda = numeros[i];
            }
        }

        System.out.println("Moda:" + moda);
    }
}
