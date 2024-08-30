import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        boolean verificarPagador;
        double salarioMinimo = 1412.00;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário:");
        double salarioPessoa = scanner.nextDouble();
        System.out.println("Digite o número de dependentes:");
        int numeroDependentes = scanner.nextInt();
        double impostoBruto = 0.00;

        double vintePorCento = salarioPessoa*0.2;
        double oitoPorCento = salarioPessoa*0.08;
        double descontoPorDependente = salarioMinimo*(numeroDependentes*0.02);
        if (salarioPessoa>(salarioMinimo*12)) {
            impostoBruto = vintePorCento-descontoPorDependente;
            verificarPagador = true;
            
        }else if (salarioPessoa>(salarioMinimo*5)) {
        impostoBruto = oitoPorCento-descontoPorDependente;
         verificarPagador = true;
        }else {
             verificarPagador = false;
           
        }
        double impostoExtra = impostoBruto*0.04;

        if (verificarPagador == true) {
            System.out.println("Imposto que deve se pagar:"+(impostoBruto+impostoExtra));
        }else{
            System.out.println("Não se deve pagar imposto");
        }
        scanner.close();
    }
}
