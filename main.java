import java.util.Random;

import java.util.ArrayList;
import java.util.Collections;

public class Aplicacao {
    public static void main(String[] args) {
    	int iteracoes = 0;
    	
    	
    	while(iteracoes < 50) {
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        Random gerador = new Random();
        
        for(int i=1; i<=100000; i++){
            vetor.add(gerador.nextInt());
        }
        
        Collections.shuffle(vetor);
        
        // Agora está o vetor original está sendo clonado
        ArrayList<Integer> copiaVetor = (ArrayList<Integer>) vetor.clone();
        
        int n = vetor.size();
        long comp = 0;
        long trocas = 0;
        
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                comp++;
                if (vetor.get(j) > vetor.get(j+1)) {
                    trocas++;
                    int temp = vetor.get(j);
                    vetor.set(j, vetor.get(j+1));
                    vetor.set(j+1, temp);
                }
            }
        }
        
        System.out.println("RESULTADO BOLHA:\nComparacoes: " + comp + " Trocas: " + trocas);
        
        int size = copiaVetor.size();
        long comparacoes = 0;
        long count = 0;

        for (int i = 0; i < size-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < size; j++) {
                comparacoes++;
                if (copiaVetor.get(j) < copiaVetor.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                count++;
                int temp = copiaVetor.get(i);
                copiaVetor.set(i, copiaVetor.get(minIndex));
                copiaVetor.set(minIndex, temp);
            }
        } 
        
        System.out.println("RESULTADO SELECAO:\nComparacoes: " + comparacoes + " Trocas feitas: " + count);
        vetor.clear();
        copiaVetor.clear();
        iteracoes++;
        System.out.println("\n-----------------------------------------------------------------------\n");
    }

    	System.out.println(iteracoes);
    }
}
