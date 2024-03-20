public class Exercicio01{
    public static void executar(){
        double[] num = new double[5];
        int soma = 0;
        double media = 0;
        

        for (int i = 0; i < 5; i ++){
            num[i] = Prompt.lerDecimal("Digite o numero " + (i+1) + " : ");

            soma += num[i]; 
        }
       
        media = soma/5;
        Prompt.imprimir("A media dos numeros: " + media);

        for (int i = 0; i < 5; i ++){
            if (num[i] > media){
                Prompt.imprimir("o número: " + num[i] + " é maior que e a média: " + media);
            } else if (num[i] < media){
                Prompt.imprimir("o número: " + num[i] + " é menor que e a média: " + media);
            } else if (num[i] == media){
                Prompt.imprimir("o número: " + num[i] + " é igual que e a média: " + media);
            }
        }

    }
}