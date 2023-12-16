import java.util.Scanner;

public class Questao_2 {
    public static void main(String[] args) {
      /*  Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

        Scanner s = new Scanner(System.in);

        int x, y;

        x = s.nextInt();
        y = s.nextInt();

        while (x != 0 && y != 0) {
            if (x>0 && y>0) {
                System.out.println("primeiro");
                x = s.nextInt();
                y = s.nextInt();
            } else if (x<0 && y>0) {
                System.out.println("segundo");
                x = s.nextInt();
                y = s.nextInt();
            } else if (x<0 && y<0) {
                System.out.println("terceiro");
                x = s.nextInt();
                y = s.nextInt();
            } else {
                System.out.println("quarto");
                x = s.nextInt();
                y = s.nextInt();
            }
        }

        s.close();



    }
}
