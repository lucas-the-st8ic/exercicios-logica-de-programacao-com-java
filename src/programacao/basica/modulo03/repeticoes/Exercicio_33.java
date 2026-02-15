package programacao.basica.modulo03.repeticoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio_33 {
    /*  Pergunta quantos números
    o usuário quer que sejam sorteados
    sorteia a quantidade de números aleatóriamente
    e soma todos.
    */
    static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int soma = 0;
        int quantidade;
        List<Integer> numeros = new ArrayList<>();

        System.out.print("Quantos números você quer sortear? ");
        quantidade = input.nextInt();

        System.out.println("Sorteando os " +quantidade+ " números...");
        for (int i = 0; i <= quantidade; i++) {

            numeros.add( i, random.nextInt(100));
            System.out.print(numeros.get(i)+ " - ");
            Thread.sleep(1000);
            soma += numeros.get(i);
        }
        System.out.println("--------------------------------------------");
        System.out.print("\nA soma entre todos esses valores é igual a: ");
        System.out.println(soma);
    }
}
