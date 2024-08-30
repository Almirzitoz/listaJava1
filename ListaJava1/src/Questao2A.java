public class Questao2A {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int somar = 0;
        for (int i = 0; i < numeros.length; i++) {
            somar += numeros[i];
        }
        System.out.println("Soma:"+ somar);
    }
}
