
package contagempareseimpares;
import java.util.Scanner;

public class ContagemParesEimpares {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] numeros = new int[15];
        int pares = 0, impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scn.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}