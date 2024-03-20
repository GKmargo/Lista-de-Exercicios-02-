public class Exercicio04{
    public static void executar(){
        double n = Prompt.lerDecimal("Digite um número qualquer: ");

        double[] num = new double[5];

        for (int i = 0; i < 5; i ++){
            num[i] = Prompt.lerDecimal("Digite o número " + (i+1) + " : ");
        }

        for (int i = 0; i < 5; i ++){
            if (num[i] < n){
                Prompt.imprimir("O índicie do número: " + num[i] + " é inferior a: " + n);
            }
        }
    }
}