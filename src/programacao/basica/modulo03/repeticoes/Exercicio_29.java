package programacao.basica.modulo03.repeticoes;

import java.util.Scanner;

public class Exercicio_29 {
    /*Solicita ao utilizador um valor inicial,
    um valor final e um incremento e realiza
    uma contagem a partir destes dados.
    */
    static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        int numeroInicial;
        int numeroFinal;
        int incremento;

        System.out.println("==Contagem Personalizada==");

        System.out.print("Por qual valor a contagem irá começar? ");
        numeroInicial = input.nextInt();

        System.out.print("Em qual valor a contagem terminará? ");
        numeroFinal = input.nextInt();

        System.out.print("Qual vai ser o incremento? ");
        incremento = input.nextInt();

        while (numeroInicial <= numeroFinal) {
            System.out.print(numeroInicial+ " - ");
            Thread.sleep(500);
            numeroInicial += incremento;
        }
        System.out.println("Fim");
    }
}
