import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int masculino = 0, feminino = 0;

        for(int pessoa = 1; pessoa <=30;  pessoa++){
            System.out.println("Digite o nome da " + pessoa + " pessoa: ");
            String nome = ler.nextLine();
            System.out.println("Digite o sexo do ou da " + nome + "\nM para Homem,  F para Mulher: ");
            char sexo = ler.nextLine().toUpperCase().charAt(0);
            if(sexo == 'M') {
                System.out.println(nome + " é homem");masculino++;
            }
            else if (sexo == 'F') {
                System.out.println(nome + " é mulher");feminino++;
            }
        }
        System.out.println("Total de homens: " + masculino);
        System.out.println("Total de mulheres: " + feminino);
    }
}