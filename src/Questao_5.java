import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {
        /*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

        Scanner s = new Scanner(System.in);
        int n,x;
        int contadorIn = 0, contadorOut = 0;

        n = s.nextInt();

        for (int i=0;i<n;i++) {
            x = s.nextInt();
            if (x>=10 && x<=20) {
                contadorIn++;
            } else {
                contadorOut++;
            }
        }
        System.out.println(contadorIn + " in");
        System.out.println(contadorOut + " out");

        s.close();

    }
}
