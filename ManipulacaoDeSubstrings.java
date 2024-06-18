import java.util.Scanner;

public class ManipulacaoDeSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        if (texto.length() > 1) {
            String substring = texto.substring(0, texto.length() - 1);
            System.out.println("Substring: " + substring);
        } else {
            System.out.println("String muito curta para operação");
        }
        scanner.close();
    }
}
