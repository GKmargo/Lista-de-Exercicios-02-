public class Exercicio02 {
    public static void executar(){
        int qtd = Prompt.lerInteiro("Digite a quantidade:");

        double[] num = new double[qtd];

         for (int i = 0; i < qtd; i++){
            num[i] = Prompt.lerDecimal("Digite o " + (i + 1) + " número:");
        }
        
        for (int i = 0; i < qtd; i ++){
            if (num[i] > 0){ 
                Prompt.imprimir("Número: " + (num[i]) + " é positivo");
            } else if (num[i] < 0){
                Prompt.imprimir("Número: " + (num[i]) + " é negativo");
            } else if (num[i] == 0){
                Prompt.imprimir("Número: " + (i + 1) + " é Zero");
            }
        }

    }
}