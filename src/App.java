import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Entradas

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Informe o Peso: ");
        double peso = sc.nextDouble();

        sc.close();

        //Processamentos
        
        //double imc = peso / (altura * altura);

        double imc = peso / Math.pow(altura, 2);

        String diagnostico = retornaDiagnostico(imc);
        
        //Saída

        System.out.println("Peso: "+ peso);
        System.out.println("Altura: "+ altura);
        System.out.println("Imc: "+ imc);
        System.out.println("Diagnostico: "+ diagnostico);
    }

    private static String retornaDiagnostico(double imc) {
        String retorno = "";

        if (imc < 18.5) {
            retorno = "MAGREZA";
        } else if ((imc >= 18.5) && (imc < 25)) {
            retorno = "NORMAL";
        } else if ((imc >= 25) && (imc < 30)) {
            retorno = "SOBREPESO";
        } else if ((imc >= 30) && (imc < 40)) {
            retorno = "OBESIDADE";
        } else {
            retorno = "OBESIDADE GRAVE";
        }

        return retorno;
    }
}
