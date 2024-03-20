public class Exercicio07 {
    public static void executar(){
        double[] vetor1 = new double[5];
        double[] vetor2 = new double[5];

        boolean igual = true; // variável para verificar se os vetores são iguais

        for(int i = 0; i < 5; i++){
            vetor1[i] = Prompt.lerDecimal("Digite o número " + (i+1) + " do primeiro vetor:");
        }

        Prompt.imprimir("\n");

        for(int i = 0; i < 5; i++){
            vetor2[i] = Prompt.lerDecimal("Digite o número " + (i+1) + " do segundo vetor:");
        }

        for(int i = 0; i < 5; i++){
            if(vetor1[i] != vetor2[i]){
                igual = false;
                break;
            }
        }

        if(igual){
            Prompt.imprimir("Os dois vetores possuem exatamente os mesmos valores.");
        } else {
            Prompt.imprimir("Os dois vetores não possuem exatamente os mesmos valores.");
        }

    }

}
