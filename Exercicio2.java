/**Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em determinado dia. Para cada casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo aquele canal. Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa não entrava na pesquisa. Faça um programa que:
leia um número indeterminado de dados (número do canal e número de pessoas que estavam assistindo); e
calcule e mostre a porcentagem de audiência de cada canal.
Para encerrar a entrada de dados, digite o número do canal ZERO.
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializa contadores para cada canal
        int totalPessoas = 0;
        int canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
        
        System.out.println("Digite o número do canal e o número de pessoas assistindo (digite 0 para encerrar):");
        
        while (true) {
            int numeroCanal = scanner.nextInt();
            
            // Verifica se o número do canal é zero para encerrar a entrada de dados
            if (numeroCanal == 0) {
                break;
            }
            
            int numeroPessoas = scanner.nextInt();
            
            // Atualiza o total de pessoas assistindo
            totalPessoas += numeroPessoas;
            
            // Atualiza os contadores para o canal correspondente
            switch (numeroCanal) {
                case 4:
                    canal4 += numeroPessoas;
                    break;
                case 5:
                    canal5 += numeroPessoas;
                    break;
                case 7:
                    canal7 += numeroPessoas;
                    break;
                case 12:
                    canal12 += numeroPessoas;
                    break;
                default:
                    System.out.println("Canal inválido.");
            }
        }
        
        // Calcula e mostra a porcentagem de audiência de cada canal
        System.out.println("Porcentagem de audiência de cada canal:");
        if (totalPessoas == 0) {
            System.out.println("Nenhuma casa assistindo.");
        } else {
            double porcentagem4 = (double) canal4 / totalPessoas * 100;
            double porcentagem5 = (double) canal5 / totalPessoas * 100;
            double porcentagem7 = (double) canal7 / totalPessoas * 100;
            double porcentagem12 = (double) canal12 / totalPessoas * 100;
            
            System.out.println("Canal 4: " + porcentagem4 + "%");
            System.out.println("Canal 5: " + porcentagem5 + "%");
            System.out.println("Canal 7: " + porcentagem7 + "%");
            System.out.println("Canal 12: " + porcentagem12 + "%");
        }
        
        scanner.close();
    }
}
