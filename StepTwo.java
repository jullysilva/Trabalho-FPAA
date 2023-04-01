import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class StepTwo {

    public static void main(String[] args) {
        ArrayList<Integer> lista = gerarLista(10000);
        int[] resultados = new int[20001]; // para armazenar os resultados dos contadores
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            int chave = rand.nextInt(11000) + 1; // sorteia um número entre 1 e 11000
            int posicao = buscaSequencial(lista, chave);
            if (posicao == -1) {
                resultados[20000]++; // número não encontrado, conta na posição 20000
            } else {
                resultados[(posicao - 1) / 500]++; // conta na posição correspondente ao contador
            }
        }
        System.out.println(Arrays.toString(resultados));
        // exibe os resultados na forma de vetor para conferência
    }

    public static ArrayList<Integer> gerarLista(int tamanho) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= tamanho; i++) {
            lista.add(i); // preenche a lista com os valores de 1 a tamanho
        }
        return lista;
    }

    public static int buscaSequencial(ArrayList<Integer> lista, int chave) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == chave) {
                return i;
            }
        }
        return -1;
    }
}
