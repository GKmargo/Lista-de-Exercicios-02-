public class Exercicio02 {
    public static void executar(){
        int qtd = Prompt.lerInteiro("Digite a quantidade:");

        double[] num = new double[qtd];
        
        for (int i = 0; i < num[qtd]; i ++){
            if (num.length > 0){ 
                Prompt.imprimir("Número: " + (i + 1) + " é positivo");
            } else if (num.length < 0){
                Prompt.imprimir("Número: " + (i + 1) + " é negativo");
            } else if (num.length == 0){
                Prompt.imprimir("Número: " + (i + 1) + " é Zero");
            }
        }

    }
}