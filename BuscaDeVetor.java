package buscadevetor;
import java.util.Scanner;

public class BuscaDeVetor {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scn.nextLine();
        }

        System.out.print("\nDigite um nome para buscar: ");
        String busca = scn.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                System.out.println("O nome '" + busca + "' foi encontrado na posição " + i + ".");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O nome '" + busca + "' não foi encontrado no vetor.");
        }
    }
}