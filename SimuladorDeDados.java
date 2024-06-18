import java.util.Random;

public class SimuladorDeDados {
    public static void main(String[] args) {
        Random random = new Random();
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            int jogada = random.nextInt(6) + 1; // Gera um número entre 1 e 6
            System.out.println("Jogada " + (i+1) + ": " + jogada);
            soma += jogada;
        }

        System.out.println("Soma das jogadas: " + soma);
    }
}
