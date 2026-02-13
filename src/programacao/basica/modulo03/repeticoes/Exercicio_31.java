package programacao.basica.modulo03.repeticoes;

import java.util.Scanner;

public class Exercicio_31 {

    /*  Conta regressivamente
    a partir de um número inserido
    pelo usuário e marca os multiplos
    de um número também escolhido.
    */

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int multiplo;

        System.out.print("Insira um número para iniciar" +
                " a contagem regressiva: ");
        numero = input.nextInt();

        System.out.print("Marcar os múltiplos de: ");
        multiplo = input.nextInt();

        for(numero = numero; numero >= 0; numero--){
            if(numero % multiplo == 0) {
                System.out.print("[ " +numero+ " ] - ");
            } else {
                System.out.print(numero + " - ");
            }

        }

        System.out.println("FIM!");
    }
}
