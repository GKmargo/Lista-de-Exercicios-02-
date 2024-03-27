public class Exercicio15 {
    public static void executar(){
        int[] vetor = new int[5];
        int ultimoValor = Integer.MIN_VALUE; //retorna o menor valor possivel 

        
        for(int i = 0; i < vetor.length; i++){
            int valorAtual;
            if(i == 0){
                valorAtual = Prompt.lerInteiro("Digite o valor " + (i + 1) + " do vetor:");
            } else {
                do {
                    valorAtual = Prompt.lerInteiro("Digite um valor maior que " + ultimoValor + ":");
                } while(valorAtual <= ultimoValor);
            }
            vetor[i] = valorAtual;
            ultimoValor = valorAtual;
        }
        Prompt.imprimir("Vetor:");
        for(int valor : vetor){
            Prompt.imprimir(valor);
        }
    }
}
