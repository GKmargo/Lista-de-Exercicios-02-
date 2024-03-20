public class Exercicio15 {
    public static void executar(){
        int[] vetor = new int[5];
        int ultimoValor = Integer.MIN_VALUE; //retorna o menor valor possivel 

        // Loop para ler os elementos do vetor
        for(int i = 0; i < vetor.length; i++){
            int valorAtual;

            // Se for o primeiro elemento, aceita qualquer valor
            if(i == 0){
                valorAtual = Prompt.lerInteiro("Digite o valor " + (i + 1) + " do vetor:");
            } else {
                // Para os demais elementos, só aceita valores maiores que o anterior
                do {
                    valorAtual = Prompt.lerInteiro("Digite um valor maior que " + ultimoValor + ":");
                } while(valorAtual <= ultimoValor);
            }

            vetor[i] = valorAtual;
            ultimoValor = valorAtual;
        }

        // Imprime o vetor
        Prompt.imprimir("Vetor:");
        for(int valor : vetor){
            Prompt.imprimir(valor);
        }
    }

}
