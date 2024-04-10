/**Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas. Finalize digitando idade igual a zero.
 */

 import java.util.Scanner;

 public class Exercicio1 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = 0;
        int soma = 0;
        int contador = 0;

        System.out.println("Digite uma idade, caso queira encerrar digite 0: ");

        while (true) {
            idade = input.nextInt();
            if (idade == 0) {
                break;
            }
            soma += idade;
            contador++;
        }
            if (contador == 0) {
            System.out.println("Nenhuma idade foi inserida, favor insira uma idade válida.");
    
        } 
            else {
            double media = soma / contador;
            System.out.println("A média das idades é: " + media);
        }

        input.close();
    }

        
}