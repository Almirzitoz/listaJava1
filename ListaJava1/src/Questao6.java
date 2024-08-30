public class Questao6 {
    public static void main(String[] args) {
        double massaEmGramas = 250.00;
        double massaincial = massaEmGramas;
        int contadorSegundos = 0;
        while (massaEmGramas > 0.5) {
            massaEmGramas = massaEmGramas/2;
            contadorSegundos = contadorSegundos+50;
        }

        int minutos = contadorSegundos/60;
        int horas = minutos/60;
        int segundos = contadorSegundos%60;
        System.out.println("Tempo de redução da massa(horas:minutos:segundos): \n"+horas+":"+minutos+":"+segundos);
        System.out.println("Massa incial(g):"+massaincial+"\n"+"Massa final (g):"+massaEmGramas);
    }
}
