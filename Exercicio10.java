public class Exercicio10 {
    public static void executar(){
        double[] vetA = new double[5];
        double[] vetB = new double[5];

        for(int i = 0; i <5 ; i ++){
            vetA[i] = Prompt.lerDecimal("Digite os valor " + (i+1) +  " de A:");
        }

        for(int i = 0; i <5 ; i ++){
            vetB[4-i] = vetA[i];
        }

        for( int i = 0; i < 5; i ++){
            Prompt.imprimir("Os valores trocados do vetor A: " + vetB[i]);
        }
}
}
