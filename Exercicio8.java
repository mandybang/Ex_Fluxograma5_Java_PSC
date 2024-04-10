/**Sendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, fazer um algoritmo, utilizando o comando para ... faça, para gerar o número H. O número N é lido através de uma unidade de entrada qualquer uma única vez. 
 */

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();
        
        double H = 0;
        for (int i = 1; i <= N; i++) {
            H += 1.0 / i;
        }
        
        System.out.println("O valor de H é: " + H);
        
        scanner.close();
    }
}
