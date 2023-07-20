import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Cadastro de Pessoas");

        String nome;
        do {
            System.out.println("Digite um nome para cadastrar ou digite '0' para sair ");
            nome = scan.nextLine();

            if (!nome.equals("0")) {
                nomes.add(nome);
            }

        } while (!nome.equals("0"));

        System.out.println("A quantidade de pessoas cadastradas foram: " + nomes.size());
        System.out.println();
        System.out.println("Lista de pessoas cadastradas");

        for (String nomeCadastrado : nomes) {
            System.out.println("Nome: " + nomeCadastrado);
        }
    }
}
