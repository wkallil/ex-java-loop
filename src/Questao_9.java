import java.util.Scanner;

public class Questao_9 {
    public static void main(String[] args) {
//        Ler um número inteiro N e calcular todos os seus divisores.
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
