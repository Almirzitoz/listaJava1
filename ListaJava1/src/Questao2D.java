public class Questao2D {
       public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        if (numeros.length%2 != 0) {
            int mediana = numeros.length%2;
            System.out.println("Mediana:"+numeros[mediana]);
        }
        if (numeros.length%2 == 0) {
            int mediana1 = (numeros.length/2)-1;
            int mediana2 = numeros.length/2;
            System.out.println("Medianas:"+numeros[mediana1]+","+numeros[mediana2]);
            
        }

    }
}
