package programacao.basica.modulo03.repeticoes;

import java.util.Scanner;

public class Exercicio_34 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        int totalDePares = 0, totalDeImpares = 0;
        int somaPares = 0, somaImpares = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número inteiro: ");
            numero = input.nextInt();

            if (numero % 2 == 0) {
                totalDePares = totalDePares + 1;
                somaPares += numero;
            } else  {
                totalDeImpares += 1;
                somaImpares += numero;
            }
        }

        double mediaPares = (double) somaPares / totalDePares;
        double mediaImpares = (double) somaImpares / totalDeImpares;

        System.out.printf("Você digitou %d números pares.\nE a média entre eles é %.2f.", totalDePares, mediaPares);
        System.out.printf("Você digitou %d números ímpares.\nE a média entre eles é %.2f.", totalDeImpares, mediaImpares);
    }
}
