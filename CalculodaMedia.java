package calculodamedia;
import java.util.Scanner;

public class CalculodaMedia {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scn.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        int acimaMedia = 0, abaixoMedia = 0, naMedia = 0;

        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            } else if (nota < media) {
                abaixoMedia++;
            } else {
                naMedia++;
            }
        }

        System.out.printf("\nMédia das notas: %.2f\n", media);
        System.out.println("Quantidade de alunos acima da média: " + acimaMedia);
        System.out.println("Quantidade de alunos abaixo da média: " + abaixoMedia);
        System.out.println("Quantidade de alunos na média: " + naMedia);
    }
}
