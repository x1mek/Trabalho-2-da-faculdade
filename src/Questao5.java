import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("coloque um valor maior que 10 ou iqual: ");
        int n=  ler.nextInt();
        if (n >= 10) {
            System.out.println("ta aí " +n);
        }
        else;
        System.out.println("é menor que 10");
    }
}
