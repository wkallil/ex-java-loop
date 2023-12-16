import java.util.Scanner;

public class Questao_3 {
    public static void main(String[] args) {
       /* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo.*/

        Scanner s = new Scanner(System.in);
        int tipoCombustivel;
        int quantidadeAlcool = 0, quantidadeGasolina = 0, quantidadeDiesel = 0;

        tipoCombustivel = s.nextInt();

        while (tipoCombustivel != 4) {
            if (tipoCombustivel < 1 || tipoCombustivel > 4) {
                System.out.println("Código Inválido!");
                tipoCombustivel = s.nextInt();
            } else if (tipoCombustivel == 1) {
                quantidadeAlcool++;
                tipoCombustivel = s.nextInt();
            } else if (tipoCombustivel == 2) {
                quantidadeGasolina++;
                tipoCombustivel = s.nextInt();
            } else {
                quantidadeDiesel++;
                tipoCombustivel = s.nextInt();
            }
        }
        System.out.println("Muito obrigado!");
        System.out.println("Alcool: " + quantidadeAlcool);
        System.out.println("Gasolina: " + quantidadeGasolina);
        System.out.println("Diesel: " + quantidadeDiesel);

    }
}
