import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anos2010 = 0, carros = 0;
        double desconto;
        while (true) {
            System.out.println("Qual é o ano do veículo:\nmodelo (____) ");
            int ano = ler.nextInt();
            System.out.println("Qual o preço do veículo: ");
            float valor = ler.nextFloat();
            if (ano <= 2010) {
                desconto = valor * 0.12;anos2010++;} else {
                desconto = valor * 0.07;}carros++;
            System.out.println("Desconto: R$" + desconto+"\nDigite 1 para continuar ou outro número para terminar");
            int continuar = ler.nextInt();
            if (continuar != 1) {break;}
        }
        System.out.println("Total de carros até 2010: " + anos2010+
                "\nTotal de carros: " + carros);
    }
}
