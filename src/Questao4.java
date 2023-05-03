import java.util.Scanner;
public class Questao4 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Informe o valor de depósito: ");
            float deposito = ler.nextFloat();
            System.out.println("1. Poupança em 0,9% ao mês \n2. CDB em 1,1% ao mês \n3. Previdência privada 1,3% ao mês");
            int opcao = ler.nextInt();
            double rendimento = 0;
            double total = deposito;
            switch (opcao) {
                case 1:
                    rendimento = deposito * 0.009;
                    for (int i = 1; i <= 12; i++) {
                        total += rendimento;}break;
                case 2:
                    rendimento = deposito * 0.011;
                    for (int i = 1; i <= 12; i++) {
                        total += rendimento;}break;
                case 3:
                    rendimento = deposito * 0.013;
                    for (int i = 1; i <= 12; i++) {
                        total += rendimento;}break;
                default:
                    System.out.println("Erro: opções de 1 a 3");}
            double soma =rendimento +deposito;
            System.out.println("O rendimento do próximo mês é: " + soma + "O rendimento após 12 meses é: " + total);
        }
    }
