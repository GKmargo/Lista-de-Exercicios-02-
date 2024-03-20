public class Exercicio12 {
    public static void executar(){
        int[] vet = new int[12]; 
        int produto = 1; 

        for(int i = 0; i <12 ; i ++){
            vet[i] = Prompt.lerInteiro("Digite os valor " + (i+1) +  " do vetor:");
        }

        for (int i = 0; i <12; i++){
            if(vet[i] > 0 && vet[i] % 2 == 0){ 
                produto *= vet[i]; 
            }
        }

        Prompt.imprimir("O produto dos elementos pares psoitivos: " + produto); 
    }

}
