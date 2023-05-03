import java.util.Scanner;

public class Questao2 { public static void main(String[] args) {
    double salario, vendas;
    Scanner ler = new Scanner(System.in);
    System.out.println("nome do vendedor: ");
    String nome = ler.nextLine();
    System.out.println("seu salario fixo: ");
    salario = ler.nextDouble();
    System.out.println("quantidade de vendas em dinheiro: ");
    vendas = ler.nextDouble();
    double comissao = vendas * 0.15;
    double total = comissao + salario;
    System.out.println("o salario do vendedor " + nome +
            "\nsera no final do mês, com as comissões: " + total + "R$");

}
}
