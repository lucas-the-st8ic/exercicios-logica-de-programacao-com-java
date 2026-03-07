package programacao.basica.modulo03.repeticoes;

import java.util.Scanner;

public class Exercicio_43 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int totalDeValores = 0;
        int qtdNumerosPares = 0;
        int menorValorImpar = 0;
        String opcao = "";

        do {
            totalDeValores++;

            System.out.print("Digite o " +totalDeValores+
                    "° número: ");
            numero = input.nextInt();

            System.out.print("Quer continuar? [S/N]:");
            opcao = input.next();

            if (numero % 2 == 0){
                qtdNumerosPares++;

            } else {
                if (menorValorImpar == 0) {

                    menorValorImpar = numero;

                } else if (numero < menorValorImpar) {
                    menorValorImpar = numero;
                }
            }


        } while(opcao.equalsIgnoreCase("S"));

        System.out.println("========== RESULTADOS ==========");
        System.out.println("Ao todo, você digitou " +totalDeValores+
                " numeros.");
        System.out.println("Você digitou " +qtdNumerosPares+
                " números pares.");
        System.out.println("O menor valor ímpar digitado foi o " +menorValorImpar);
    }
}
