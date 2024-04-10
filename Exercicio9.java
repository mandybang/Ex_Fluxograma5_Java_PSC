/**Fazer um algoritmo, utilizando o comando for, que calcule e escreva a soma dos 50 primeiros termos da seguinte série: 
 * S = 1000 / 1 - 997 / 2 + 994 / 3 - 991 / 4 + ... 
 */

public class Exercicio9 {
    public static void main(String[] args) {
        double S = 0;
        int sinal = 1;
        int denominador = 1;

        for (int i = 1; i <= 50; i++) {
            S += sinal * (1000.0 / denominador);
            sinal *= -1;
            denominador += 3;
        }

        System.out.println("A soma dos 50 primeiros termos da série é: " + S);
    }
}
