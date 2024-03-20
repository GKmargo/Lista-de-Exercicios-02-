public class Exercicio13 {
    public static void executar(){
        int n = Prompt.lerInteiro("Digite um número:");

        int[] f = new int[n];

        if (n > 0) {
            f[0] = 1; //declarando que o primeiro termo é 1
        }
        if (n > 1) {
            f[1] = 1; //declarando que o segundo termo é 1
        }

        for (int i = 2; i < n; i++) {
            f[i] = f[i-1] + f[i-2]; // cada termo que vem depois é a soma dos dois termos anteriores
        }

        Prompt.imprimir("Os " + n + " primeiros termos da sequência de Fibonacci:");
        for (int i = 0; i < n; i++) {
            Prompt.imprimir(f[i]);
        }
    }

}
