public class Exercicio05 {
    public static void executar(){
         double n = Prompt.lerDecimal("Digite um número qualquer: ");

         double[] num = new double[5];

         int contador = 0;

        for (int i = 0; i < 5; i ++){
            num[i] = Prompt.lerDecimal("Digite o número " + (i+1) + " : ");
            if (num[i] == n){
                contador++;
            }
        }

        Prompt.imprimir("O número:  " + n + "apareceu " + contador + " vezes");
    }
}