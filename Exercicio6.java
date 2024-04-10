/**Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opção desejada, receba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de opção inválida e não se preocupe com restrições do tipo salário inválido.
Menu de opções:
1. Imposto
2. Novo salário
3. Classificação
4. Finalizar o programa
Digite a opção desejada.

Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as regras a seguir.

SALÁRIO
% DO IMPOSTO
Menor que R$ 1400,00
5
De R$ 1400,00 a R$ 2500,00
10
Acima de R$ 2500,00
15



Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor do novo salário usando as regras a seguir.

Salário
Aumento
Maiores que R$ 5000,00
R$ 25,00
De R$ 2500,00 (inclusive) a R$ 5.000,00 (inclusive) 
R$ 50,00
De R$ 1400,00 (inclusive) a R$ 2500,00
R$ 75,00
Menores que R$ 1400,00 
R$ 100,00



Na opção 3: receber o salário de um funcionário e mostrar sua classificação usando esta tabela:

Salário
Classificação
Até 1400,00
Mal remunerado
Maiores que R$ 1400,00
Bem remunerado

 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\nMenu de opções:");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    calcularImposto();
                    break;
                case 2:
                    calcularNovoSalario();
                    break;
                case 3:
                    classificarSalario();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite uma opção válida.");
            }
        } while (opcao != 4);
        
        scanner.close();
    }
    
    public static void calcularImposto() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: R$");
        double salario = scanner.nextDouble();
        
        double imposto;
        if (salario < 1400) {
            imposto = salario * 0.05;
        } else if (salario >= 1400 && salario <= 2500) {
            imposto = salario * 0.10;
        } else {
            imposto = salario * 0.15;
        }
        
        System.out.println("Valor do imposto a ser pago: R$" + imposto);
        
        scanner.close();
    }
    
    public static void calcularNovoSalario() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: R$");
        double salario = scanner.nextDouble();
        
        double aumento;
        if (salario < 1400) {
            aumento = 100;
        } else if (salario >= 1400 && salario <= 2500) {
            aumento = 75;
        } else if (salario > 2500 && salario <= 5000) {
            aumento = 50;
        } else {
            aumento = 25;
        }
        
        double novoSalario = salario + aumento;
        System.out.println("Novo salário do funcionário: R$" + novoSalario);
        
        scanner.close();
    }
    
    public static void classificarSalario() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: R$");
        double salario = scanner.nextDouble();
        
        if (salario <= 1400) {
            System.out.println("Classificação: Mal remunerado");
        } else {
            System.out.println("Classificação: Bem remunerado");
        }
        
        scanner.close();
    }
}
