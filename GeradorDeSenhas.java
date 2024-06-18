import java.util.Random;

public class GeradorDeSenhas {
    public static void main(String[] args) {
        Random random = new Random();
        int numDigitos = random.nextInt(6) + 5; // Número entre 5 e 10
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < numDigitos; i++) {
            int digito = random.nextInt(10); // Número entre 0 e 9
            senha.append(digito);
        }

        System.out.println("Senha gerada: " + senha.toString());
    }
}
