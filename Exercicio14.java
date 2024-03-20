public class Exercicio14 {
    public static void executar(){
        int[] vet = new int[5];
        int maior = 0;

        for(int i = 0; i < 5; i ++){
            vet[i] = Prompt.lerInteiro("Digite o valor " + (i + 1) + " do vetor:");
            if (vet[i] > vet[maior]){
                maior = i;
            }
        }
   
        // Armazena o último elemento do vetor na variável 'ult'
        int ult = vet[vet.length - 1];
         // Coloca o maior elemento na última posição do vetor
        vet[vet.length - 1] = vet[maior];
        // Coloca o valor que estava na última posição no lugar do maior elemento
        vet[maior] = ult;

        for (int i = 0; i < 5; i++) {
            Prompt.imprimir("Valor " + (i+1) + " atualizado: " + vet[i]);
        }
    }

}
