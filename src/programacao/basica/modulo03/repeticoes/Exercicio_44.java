package programacao.basica.modulo03.repeticoes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_44 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numero;
        int totalDeValores = 0;
        int repeticaoNumeroCinco = 0;
        int somaDosValores = 0;
        int menorValor = 0;
        int maiorValor = 0 ;
        String opcao = "";
        String pluralOuSingular = " vez ";
        do {
            totalDeValores++;

            numero = random.nextInt(50) + 1;

            System.out.print("O " +totalDeValores+
                    "° valor sorteado foi: " +numero);


            System.out.print("\nQuer continuar? [S/N]: ");
            opcao = input.next();

            if(totalDeValores == 1) {
                menorValor = numero;
                maiorValor = numero;
            } else {
                if (numero < menorValor) {
                    menorValor = numero;
                }

                if (numero > maiorValor) {
                    maiorValor = numero;
                }
            }

            if (numero == 5) {
                repeticaoNumeroCinco++;
            }

            somaDosValores += numero;

        } while(opcao.equalsIgnoreCase("S"));

        System.out.println("========== RESULTADOS ==========");
        System.out.println("Ao todo foram sorteados " +totalDeValores+
                " valores.");
        System.out.println("A soma de todos os números sorteados foi "
        +somaDosValores);
        System.out.println("O menor valor foi " +menorValor+
                " e o maior valor foi " +maiorValor);
        if (repeticaoNumeroCinco > 1) {
            pluralOuSingular = " vezes. ";
        }
        System.out.println("O valor 5 foi sorteado " +repeticaoNumeroCinco+
                pluralOuSingular);
        System.out.println("------------------------------------------------");
    }
}
