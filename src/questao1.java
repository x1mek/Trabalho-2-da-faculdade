import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {

                Scanner ler = new Scanner(System.in);
                System.out.println("Qual foi a distancia total da viagem em km? ");
                float distanciaPercorrida = ler.nextFloat();
                System.out.println("Quantos litros foi usado de combustivel?");
                float gasosa = ler.nextFloat();
                double resultado = distanciaPercorrida / gasosa;
                System.out.println("esse foi o consumo do altomovel em km: " + resultado+"L");
            }
        }