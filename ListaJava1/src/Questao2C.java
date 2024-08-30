public class Questao2C {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int somar = 0;
        for (int i = 0; i < numeros.length; i++) {
            somar += numeros[i];
        }
        int media = somar/2;
        System.out.println("Média:"+media);
  
    }
}
