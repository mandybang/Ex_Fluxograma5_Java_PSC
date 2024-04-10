/**Uma empresa fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto lançado. Para isso, forneceu o sexo do entrevistado e sua resposta (S — sim; ou N — não). Sabe-se que foram entrevistadas dez pessoas. Faça um programa que calcule e mostre:
 o número de pessoas que responderam sim;
o número de pessoas que responderam não;
o número de mulheres que responderam sim; e
a percentagem de homens que responderam não, entre todos os homens analisados
 */

 import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalEntrevistados = 10;
        int contSim = 0;
        int contNao = 0;
        int contMulheresSim = 0;
        int contHomens = 0;
        int contHomensNao = 0;
        
        for (int i = 0; i < totalEntrevistados; i++) {
            System.out.println("Entrevistado " + (i+1) + ":");
            
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            
            System.out.print("Resposta (S/N): ");
            char resposta = scanner.next().charAt(0);
            resposta = Character.toUpperCase(resposta);
            
            if (resposta == 'S') {
                contSim++;
                
                if (sexo == 'F') {
                    contMulheresSim++;
                }
            } else if (resposta == 'N') {
                contNao++;
                
                if (sexo == 'M') {
                    contHomens++;
                    contHomensNao++;
                }
            }
        }
        
        double porcentagemHomensNao = 0;
        if (contHomens > 0) {
            porcentagemHomensNao = (double) contHomensNao / contHomens * 100;
        }
        
        System.out.println("\nResultado:");
        System.out.println("Número de pessoas que responderam sim: " + contSim);
        System.out.println("Número de pessoas que responderam não: " + contNao);
        System.out.println("Número de mulheres que responderam sim: " + contMulheresSim);
        System.out.println("Percentagem de homens que responderam não: " + porcentagemHomensNao + "%");
        
        scanner.close();
    }
}
