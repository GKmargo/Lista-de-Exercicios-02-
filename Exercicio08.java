public class Exercicio08 {
    public static void executar(){
        double[] vetA = new double[5];
        double[] vetB = new double[5];
        double[] vetC = new double[10];

        for(int i = 0; i <5 ; i ++){
            vetA[i] = Prompt.lerDecimal("Digite os valor " + (i+1) +  " de A:");
        }

        for(int i = 0; i <5 ; i ++){
            vetB[i] = Prompt.lerDecimal("Digite os valor " + (i+1) +  " de B:");
        }

        for(int i = 0; i <5 ; i ++){
            vetC[i] = vetA[i];
        }

        for(int i = 0; i <5 ; i ++){
            vetC[i+5] = vetB[i]; 
        }

        Prompt.imprimir("\nOs valores do Vetor C:");
        for(int i=0; i<10; i++){
            Prompt.imprimir("valor "+ (i+1) + ":" + vetC[i]);
        }
        
    }

}
