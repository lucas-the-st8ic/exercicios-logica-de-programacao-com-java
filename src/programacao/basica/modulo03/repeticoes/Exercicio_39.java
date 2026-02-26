package programacao.basica.modulo03.repeticoes;

import java.util.Scanner;

public class Exercicio_39 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0;
        int soma = 0;
        int totalValores = 0;
        double media = 0.0;
        int maiorValor = 0;

        System.out.println("============================================================");
        while(true) {

            System.out.println("Digite 9999 para encerrar o programa");
            System.out.print((totalValores + 1) + "° Valor: ");
            numero = input.nextInt();
            System.out.println("-----------------------------------------");

            if (numero == 9999) {
                break;
            }

            if (totalValores == 1) {
                maiorValor = numero;
            } else if(numero > maiorValor) {
                maiorValor = numero;
            }

            soma += numero;
            totalValores += 1;

        }

        media = (double) soma / totalValores;

        System.out.println("==============================================");
        System.out.println("Ao todo, foram digitados " +totalValores+ " valores.");
        System.out.println("A soma entre esses valores é " + soma + ".");
        System.out.println("A média entre eles é " +media);
        System.out.println("O maior valor digitado foi " +maiorValor+ ".");
        System.out.println("==============================================");
    }
}
