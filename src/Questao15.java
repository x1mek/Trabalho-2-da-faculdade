import java.util.Scanner;

    public class Questao15 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            System.out.print("Digite o valor de A: ");
            double a = ler.nextDouble();

            System.out.print("Digite o valor de B: ");
            double b = ler.nextDouble();

            System.out.print("Digite o tipo de operador: +, -, *, / ");
            String operador = ler.next();

            double resultado = 0;

            if (operador.equals("+")) {
                resultado = a + b;
            } else if (operador.equals("-")) {
                resultado = a - b;
            } else if (operador.equals("*")) {
                resultado = a * b;
            } else if (operador.equals("/")) {
                if (b == 0) {
                    System.out.println("Não é possível dividir por 0.");
                    return;
                } else {resultado = a / b;}
            } else {System.out.println("Operador inválido.");
                return;}
            System.out.println("Resultado: " + resultado);
        }
    }