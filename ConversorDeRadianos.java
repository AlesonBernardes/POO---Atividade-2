import java.util.Scanner;

public class ConversorDeRadianos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em radianos: ");
        double radianos = scanner.nextDouble();

        double graus = Math.toDegrees(radianos);
        System.out.println("Graus: " + graus);
        scanner.close();
    }
}
