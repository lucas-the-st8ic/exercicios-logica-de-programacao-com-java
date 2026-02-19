package programacao.basica.modulo03.repeticoes;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Exercicio_36 {
        /*  Programa solicita a quantidade
        de números a serem sorteados, sorteia
        os números e dentre eles, mostra quantos
        são maiores que 5 e quantos são
        divisíveis por 3
        */
    static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int quantidadeDeNumerosASortear;
        int totalNumerosMaioresQueCinco = 0;
        int totalNumerosDivisiveisPorTres = 0;
        String pluralOuSingularDeMaior;
        String pluralOuSingularDeDivisiveis;

        System.out.print("Quantos números você" +
                " deseja sortear? ");
        quantidadeDeNumerosASortear = input.nextInt();
        System.out.println("================================");
        Thread.sleep(1000);
        System.out.println("Sorteando " +quantidadeDeNumerosASortear+
                            " valores:");

        for (int i = 1; i <= quantidadeDeNumerosASortear; i++) {
            int numeroSorteado;

            numeroSorteado = random.nextInt(100) + 1;

            System.out.print(numeroSorteado+ " - ");
            Thread.sleep(1000);

            if (numeroSorteado > 5) {
                totalNumerosMaioresQueCinco += 1;
            }

            if (numeroSorteado % 3 == 0) {
                totalNumerosDivisiveisPorTres += 1;
            }

            if (i % 6 == 0) {
                System.out.println();
            }

        }
        System.out.print("!FIM DO SORTEIO\n");
        System.out.println("================================");
        pluralOuSingularDeMaior = (totalNumerosMaioresQueCinco <= 1) ? " maior " : " maiores ";
        pluralOuSingularDeDivisiveis = (totalNumerosDivisiveisPorTres <= 1) ? " divisível " : " divisíveis ";

        System.out.println("Dos " +quantidadeDeNumerosASortear+
                " números sorteados temos " +totalNumerosMaioresQueCinco+
                pluralOuSingularDeMaior+ "que cinco");
        System.out.println("e " +totalNumerosDivisiveisPorTres+
                pluralOuSingularDeDivisiveis+ "por três.");


    }
}
