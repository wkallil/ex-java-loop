import java.util.Locale;
import java.util.Scanner;

public class Questao_7 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();

            if (b == 0) {
                System.out.println("divisao impossível");
            } else {
                double div = (double) a/b;
                System.out.printf("%.1f%n",div);
            }

        }


    }
}
