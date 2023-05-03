import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = ler.nextInt();

        System.out.println("Digite um numero elevado");
        int numeroelevado = ler.nextInt();
        valorElevado(num, numeroelevado);
    }
    public static void valorElevado(int num, int elevado){

        double resultado = Math.pow(num, elevado);
        System.out.println("O resultado é " + resultado);
    }
}

