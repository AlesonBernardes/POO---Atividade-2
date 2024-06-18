import java.util.Scanner;

public class InversorDeFrases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String semEspacos = frase.replaceAll("\\s", "");
        String invertida = new StringBuilder(semEspacos).reverse().toString();

        System.out.println("Frase invertida: " + invertida);
        scanner.close();
    }
}
