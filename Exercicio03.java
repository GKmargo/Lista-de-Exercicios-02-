public class Exercicio03{
    public static void executar(){
        int qtd = Prompt.lerInteiro("Digite a quantidade:");

        double[] num = new double[qtd];
        double[] dobro = new double[qtd];

         for (int i = 0; i < qtd; i++){
            num[i] = Prompt.lerDecimal("Digite o " + (i + 1) + " número:");
            dobro[i] = num[i] * 2;
        }

        for (int i = 0; i < qtd; i++){
            Prompt.imprimir("O dobro do número: " + (i+1) + " : " + dobro[i]);
        }
    }
}