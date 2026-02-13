package programacao.basica.modulo03.repeticoes;

import java.util.Scanner;

public class Exercicio_32 {

    /*Solicita 5 valores aos
    usuários e calcula o total de
    valores pares e valores ímpares.
    */

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor, somaNumerosPares = 0, somaNumerosImpares = 0;

        for(int i = 1; i <= 5; i++){

            System.out.print("Digite o " +i+ "° valor: ");
            valor = input.nextInt();

            if(valor % 2 == 0){
                somaNumerosPares += valor;
            } else {
                somaNumerosImpares += valor;
            }
        }

        System.out.println("Somando todos os pares, temos " +somaNumerosPares);

        System.out.println("Somando todos os ímpares, temos " +somaNumerosImpares);


    }
}
