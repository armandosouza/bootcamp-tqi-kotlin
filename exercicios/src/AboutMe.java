import java.util.Scanner;

public class AboutMe {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
    }
}