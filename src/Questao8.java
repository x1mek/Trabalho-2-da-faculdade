import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, grupoDeRisco;
        String categoria = "Sem resposta";

        System.out.print("Digite o seu nome: ");
        String nome = ler.next().toUpperCase().charAt(0) + ler.next().substring(1);

        System.out.print("Digite a sua idade: ");
        idade = ler.nextInt();

        System.out.print("Digite o grupo de risco: ");
        grupoDeRisco = ler.nextInt();

        if (idade < 17 || idade > 70) {
            System.out.println("Sua idade não entra no uso deste plano!");
            System.exit(0);}

        switch (idade / 5 - 2) {
            case 0:
                if (grupoDeRisco == 1) categoria = "Baixo";
                else if (grupoDeRisco == 2) categoria = "Médio";
                else if (grupoDeRisco == 3) categoria = "Alto";
                break;
            case 1:
                if (grupoDeRisco == 2) categoria = "Baixo";
                else if (grupoDeRisco == 3) categoria = "Médio";
                else if (grupoDeRisco == 4) categoria = "Alto";
                break;
            case 2:
                if (grupoDeRisco == 3) categoria = "Baixo";
                else if (grupoDeRisco == 4) categoria = "Médio";
                else if (grupoDeRisco == 5) categoria = "Alto";
                break;
            case 3:
                if (grupoDeRisco == 4) categoria = "Baixo";
                else if (grupoDeRisco == 5) categoria = "Médio";
                else if (grupoDeRisco == 6) categoria = "Alto";
                break;
            case 4:
                if (grupoDeRisco == 7) categoria = "Baixo";
                else if (grupoDeRisco == 8) categoria = "Médio";
                else if (grupoDeRisco == 9) categoria = "Alto";
                break;}

        System.out.println("Dados:"+"\nNome: " + nome+"\nIdade: " + idade
                +"\nGrupo de risco " + grupoDeRisco + ", o contratante à " + nome + " tipo " + categoria);
    }
}


