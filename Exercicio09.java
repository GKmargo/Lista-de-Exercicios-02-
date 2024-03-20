public class Exercicio09 {
    public static void executar(){
        double[] vetA = new double[5];
        double[] vetB = new double[5];
        double[] vetC = new double[5];

        for(int i = 0; i <5 ; i ++){
            vetA[i] = Prompt.lerDecimal("Digite os valor " + (i+1) +  " de A:");
        }

        Prompt.imprimir("\n");

        for(int i = 0; i <5 ; i ++){
            vetB[i] = Prompt.lerDecimal("Digite os valor " + (i+1) +  " de B:");
        }

        for(int i = 0; i < 5; i++){
            if (i % 2 == 0){
                vetC[i] = vetA[i];
            } else {
                vetC[i] = vetB[i];
            }
        }

        Prompt.imprimir("\nOs valores do Vetor C:");
        for(int i=0; i<5; i++){
            Prompt.imprimir("valor "+ (i+1) + ":" + vetC[i]);
        }

    }

}
