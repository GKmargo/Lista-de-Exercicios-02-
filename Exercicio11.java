public class Exercicio11 {
    public static void executar(){
        int[] vetA = new int[5];
        int[] vetB = new int[5];
        double produto = 0;

        for(int i = 0; i <5 ; i ++){
            vetA[i] = Prompt.lerInteiro("Digite os valor " + (i+1) +  " de A:");
        }

        for(int i = 0; i <5 ; i ++){
            vetB[i] = Prompt.lerInteiro("Digite os valor " + (i+1) +  " de B:");
        }

        for(int i = 0; i < 5; i ++){
            produto += vetA[i] * vetB[i];
        }

        Prompt.imprimir("Produto Escalar: " + produto);


    }

}
