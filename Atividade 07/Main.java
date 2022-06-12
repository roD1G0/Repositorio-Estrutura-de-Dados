package aula_e_dados;

import java.util.Random;

/**
 *
 * @author 2110102369
 */
public class Main {
    public static void main(String args[]){
        int vet[] = new int[1000];
        LDE lde = new LDE();
        
        Random gerador = new Random();
        
        for(int i = 0; i <= vet.length-1; i++){
            vet[i] = gerador.nextInt();
        }
        
        int inicio = 0;
        int fim = vet.length-1;
        
        long startTime = System.currentTimeMillis();
        System.out.println("Maior numero encontrado com método recursivo: "+ lde.maximoRec(vet, inicio, fim));
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Método recursivo levou otempo de: "+totalTime);
        
        startTime = System.currentTimeMillis();
        System.out.println("Maior numero encontrado com método iterativo: "+ lde.maximoRecIt(vet, inicio, fim));
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Método iterativo levou otempo de: "+totalTime);
        
    }
    
}
