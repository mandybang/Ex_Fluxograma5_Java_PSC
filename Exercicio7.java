/**Foi feita uma estatística em n cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
nome da cidade;
número de veículos de passeio;
número de acidentes de trânsito com vítimas.
Deseja-se saber:
 qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem;
 qual é a média de veículos nas cinco cidades juntas
 */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;
        System.out.print("Digite o número de cidades a serem analisadas: ");
        n = scanner.nextInt();
        
        String cidadeMaisAcidentes = "";
        String cidadeMenosAcidentes = "";
        int maiorIndiceAcidentes = Integer.MIN_VALUE;
        int menorIndiceAcidentes = Integer.MAX_VALUE;
        int totalVeiculos = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nCidade " + (i+1) + ":");
            
            System.out.print("Nome da cidade: ");
            String nomeCidade = scanner.next();
            
            System.out.print("Número de veículos de passeio: ");
            int numVeiculos = scanner.nextInt();
            
            System.out.print("Número de acidentes de trânsito com vítimas: ");
            int numAcidentes = scanner.nextInt();
            
            // Verifica se é o maior índice de acidentes
            if (numAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = numAcidentes;
                cidadeMaisAcidentes = nomeCidade;
            }
            
            // Verifica se é o menor índice de acidentes
            if (numAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = numAcidentes;
                cidadeMenosAcidentes = nomeCidade;
            }
            
            totalVeiculos += numVeiculos;
        }
        
        double mediaVeiculos = (double) totalVeiculos / n;
        
        System.out.println("\nResultado:");
        System.out.println("Maior índice de acidentes de trânsito: " + maiorIndiceAcidentes + " - Cidade: " + cidadeMaisAcidentes);
        System.out.println("Menor índice de acidentes de trânsito: " + menorIndiceAcidentes + " - Cidade: " + cidadeMenosAcidentes);
        System.out.println("Média de veículos nas cidades: " + mediaVeiculos);
        
        scanner.close();
    }
}
