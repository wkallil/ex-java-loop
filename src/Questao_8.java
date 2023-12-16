import java.util.Scanner;

public class Questao_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n,fatorial=1;
        n = s.nextInt();

        for (int i = 1; i <= n ; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
