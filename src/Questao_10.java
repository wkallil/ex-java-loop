import java.util.Scanner;

public class Questao_10 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro positivo N.O programa deve então mostrar na tela N linhas,
         começando de 1 até N.Para cada linha, mostrar o número da linha, depois o quadrado e o cubo
        do valor, conforme
        exemplo.*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            int quadrado = i*i;
            int cubo = i*i*i;

            System.out.printf("%d %d %d%n", i, quadrado, cubo);
        }

    }
}
