import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.FileWriter;
import java.io.PrintWriter;

public class StepTwo {
    public static void main(String[] args) {
        List<Integer> vetor = new ArrayList<Integer>();
        for (int i = 1; i <= 10000; i++) {
            vetor.add(i);
        }

        Random random = new Random();
        List<Integer> resultados = new ArrayList<Integer>();
        int contador = 0;
        for (int i = 0; i < 1000000; i++) {
            int numeroSorteado = random.nextInt(11000) + 1;
            int posicao = 10001;
            posicao = vetor.indexOf(numeroSorteado);
            if (posicao != -1) {
                contador++;
            }
            if (i % 500 == 0 && i > 0) {
                resultados.add(contador);
                contador = 0;
            }
        }
        resultados.add(contador);

        System.out.println("Resultados dos contadores de 500 em 500 iterações:");
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println((i * 500) + " - " + ((i + 1) * 500) + ": " + resultados.get(i));
        }
    }
}

