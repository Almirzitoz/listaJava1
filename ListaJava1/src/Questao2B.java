public class Questao2B {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int verificarMenor = 100;
        int verificarMaior = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]<verificarMenor) {
                verificarMenor = numeros[i];
            }
            if (numeros[i]>verificarMaior) {
                verificarMaior = numeros[i];
            }
        }
        System.out.println("Maior número:"+ verificarMaior);
        System.out.println("Menor número:"+verificarMenor);


    }
}
