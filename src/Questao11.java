import java.util.Arrays;
import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] entrada = new int[3];

        for (int numero = 0; numero < entrada.length; numero++) {
            System.out.println("Digite o valor do numero " + (numero+1) + ":");
            do {
                if (!ler.hasNextInt()) {
                    System.out.println("Valor invalido. Digite um numero inteiro:");
                    ler.next();}
            } while (!ler.hasNextInt());
            entrada[numero] = ler.nextInt();
        }

        Arrays.sort(entrada);

        System.out.println("Valores em ordem crescente:");
        for (int valor : entrada) {
            System.out.println(valor);
        }
    }
}
