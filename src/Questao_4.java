import java.util.Scanner;

public class Questao_4 {
    public static void main(String[] args) {
        /*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        X, se for o caso.*/

        Scanner s = new Scanner(System.in);
        int x;

        x = s.nextInt();

        for (int i=1; i<=x;i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }


        s.close();


    }
}
