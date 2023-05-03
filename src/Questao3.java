import java.util.Scanner;

public class Questao3 {public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("escreva 'a' ");
    String a = ler.nextLine();
    System.out.println("escreva 'b' ");
    String b = ler.nextLine();
    System.out.println("valores atuais:\na: "+a+"\nb: "+b);
    String ab = a; a = b; b = ab;
    System.out.println("troca de valoores:\na: " +a + "\nb: "+b);
}
}
