/**Faça um programa que receba dez idades, pesos e alturas, calcule e mostre: 
a média das idades das dez pessoas;
a quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro; e 
a porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m. 
*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalIdades = 0;
        int contPessoasAcima90kgAlturaMenor150 = 0;
        int contPessoasMais190m = 0;
        int contPessoasEntre10e30AnosMais190m = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Pessoa " + (i+1) + ":");
            
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            totalIdades += idade;
            
            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();
            
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            
            if (peso > 90 && altura < 1.50) {
                contPessoasAcima90kgAlturaMenor150++;
            }
            
            if (altura > 1.90) {
                contPessoasMais190m++;
                
                if (idade >= 10 && idade <= 30) {
                    contPessoasEntre10e30AnosMais190m++;
                }
            }
        }
        
        double mediaIdades = (double) totalIdades / 10;
        double porcentagemPessoasEntre10e30AnosMais190m = 
            (double) contPessoasEntre10e30AnosMais190m / contPessoasMais190m * 100;
        
        System.out.println("\nResultado:");
        System.out.println("Média das idades das dez pessoas: " + mediaIdades);
        System.out.println("Quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 m: " + 
                           contPessoasAcima90kgAlturaMenor150);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: " + 
                           porcentagemPessoasEntre10e30AnosMais190m + "%");
        
        scanner.close();
    }
}
