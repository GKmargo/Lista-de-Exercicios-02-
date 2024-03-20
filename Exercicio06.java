public class Exercicio06{
    public static void executar(){
        double[] nota = new double[5];
        double[] peso = new double[5];

        double somaPeso = 0;
        double media = 0;

        for (int i = 0; i < 5; i++){
            nota[i] = Prompt.lerDecimal("Digite a nota " + (i+1) + " do aluno:");
            peso[i] = Prompt.lerDecimal("Digite o peso da nota " + (i+1) + ":");
            
            somaPeso += peso[i];
            media += nota[i] * peso[i];
        }

        media /= somaPeso;
        Prompt.imprimir("A media ponderada do aluno é: " + media);

    }
}