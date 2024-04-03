import java.util.Arrays;
import java.util.Random;

public class Vetor1000 {
    public static void main(String[] args) {

        int[] vetor = {};

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int aleatorio = random.nextInt();
            vetor = add(vetor, aleatorio);
        }

        System.out.println(Arrays.toString(vetor));
    }

    public static int[] add(int[] vetor, int valor) {
        int[] vetorNovo = new int[vetor.length + 1];

        for (int i = 0; i < vetor.length; i++) {
            vetorNovo[i] = vetor[i];
        }

        vetorNovo[vetor.length] = valor;

        return vetorNovo;
    }
}
