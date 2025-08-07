package anagramas.console;

import anagramas.service.AnagramaService;

import java.util.List;
import java.util.Scanner;

public class AnagramaConsoleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma sequência de letras: ");
        String input = scanner.nextLine();

        AnagramaService service = new AnagramaService();

        try {
            List<String> anagramas = service.gerarAnagramas(input);
            System.out.println("\nAnagramas gerados:");
            anagramas.forEach(System.out::println);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
