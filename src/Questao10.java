
    import java.util.Scanner;

    public class Questao10 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            System.out.println("Digite um número inteiro:");
            int numero = ler.nextInt();

            System.out.println(verificar(numero) ? "é um número perfeito" : "não é um número perfeito");
        }

        public static boolean verificar(int numero) {
            int somaDivisores = 0;

            for (int verificarnum = 1; verificarnum < numero; verificarnum++) {
                if (numero % verificarnum == 0) {
                    somaDivisores += verificarnum;
                }
            }

            return somaDivisores == numero;
        }
    }