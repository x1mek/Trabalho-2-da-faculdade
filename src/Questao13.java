public class Questao13 {
    public static void main(String[] args) {
        class Aluno {
            private int matricula;
            private String nome;
            private double notaProva1;
            private double notaProva2;
            private double notaTrabalho;

            public Aluno(int matricula, String nome, double notaProva1,
                         double notaProva2, double notaTrabalho) {
                this.matricula = matricula;
                this.nome = nome;
                this.notaProva1 = notaProva1;
                this.notaProva2 = notaProva2;
                this.notaTrabalho = notaTrabalho;
            }
            public int getMatricula() {
                return matricula;}

            public String getNome() {
                return nome;}
            public double getNotaProva1() {
                return notaProva1;}
            public double getNotaProva2() {
                return notaProva2;}
            public double getNotaTrabalho() {
                return notaTrabalho;}
            public double calcularMedia() {
                double media = (notaProva1 + notaProva2) * 0.5 + notaTrabalho * 0.4;
                return media;}
            public double finalPontuacao() {
                double media = calcularMedia();
                double necessaria = 0;
                if (media < 6) {
                    necessaria = 12 - media * 1.75;
                    if (necessaria < 0) {
                        necessaria = 0;
                    }
                }
                return necessaria;
            }
        }
    }
}
