import java.util.Scanner;
    public class Questao9 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            String nome, cpf, telefone, senha;
            int idusuario = 0;int bancoID = 1;
            System.out.println("Nome: ");nome = ler.nextLine();
            System.out.println("CPF: ");cpf = ler.nextLine();
            System.out.println("Telefone: ");telefone = ler.nextLine();
            System.out.println("Senha: ");senha = ler.nextLine();

            cadastrarUsuario(nome, cpf, telefone, senha, ++idusuario);
            novoLogin(idusuario);}
        public static void cadastrarUsuario(String nome, String cpf, String telefone, String senha, int idusuario) {
            System.out.println("Usuário cadastrado!");
        }

        public static void novoLogin(int idusuario) {
            System.out.println("Usuário " + idusuario + " logado!");
        }
    }
