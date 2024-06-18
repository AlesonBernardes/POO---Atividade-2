import java.util.Scanner;

public class DetectorDeConteudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        if (frase.contains("sexo") || frase.contains("sexual")) {
            System.out.println("Conteúdo impróprio");
        } else {
            System.out.println("Conteúdo liberado");
        }
        scanner.close();
    }
}
