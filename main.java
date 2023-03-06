import java.util.Random;

public class Aplicacao {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		
		
		int vetor[] = new int[100000];
		int aux, comparacao = 0, realizada = 0;
		Random gerador = new Random();
		
		for(int i = 0; i < 100000; i++) {
			vetor[i] = gerador.nextInt();
		}
		
		// ALGOTIMO DE ORDENAÇÃO USANDO O MÉTODO BOLHA DO VETOR ORIGINAL
		for(int i = 0; i<100000; i++){
			for(int j = 0; j<4; j++){
				realizada++;
				if(vetor[j] > vetor[j + 1]){
					comparacao++;
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		
		System.out.println("Realizada: " + realizada + "\nComparada: " + comparacao);
		
		int [] vetorB = vetor.clone();
		
		// ALGORITMO DE ORDANAÇÃO USANDO O MÉTODO DE SELEÇÃO DO VETOR B CLONADO
		for (int fixo = 0; fixo < vetorB.length - 1; fixo++) {
		    int menor = fixo;

		    for (int i = menor + 1; i < vetorB.length; i++) {
		       if (vetorB[i] < vetorB[menor]) {
		          menor = i;
		       }
		    }
		    if (menor != fixo) {
		      int t = vetorB[fixo];
		      vetorB[fixo] = vetorB[menor];
		      vetorB[menor] = t;
		    }
		  }
		
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in milliseconds: " + timeElapsed);
	}

}
