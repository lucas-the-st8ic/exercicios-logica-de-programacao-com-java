package programacao.basica.modulo03.repeticoes;

import java.util.Scanner;

public class Exercicio_37 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        String nomePessoaMaisVelha = "";
        String nomePessoaMaisNova = "";

        int idade;
        int idadePessoaMaisVelha = 0;
        int idadePessoaMaisNova = 0;

        for(int i = 1; i <= 5; i++) {
            System.out.println("-------------");
            System.out.println(i+ "° Pessoa");
            System.out.println("-------------");
            System.out.print("NOME: ");
            nome = input.next();

            System.out.print("IDADE: ");
            idade = input.nextInt();

            if (i == 1) {

                nomePessoaMaisVelha = nome;
                nomePessoaMaisNova = nome;

                idadePessoaMaisNova = idade;
                idadePessoaMaisVelha = idade;

            }

            if (idade > idadePessoaMaisVelha) {
                idadePessoaMaisVelha = idade;
                nomePessoaMaisVelha = nome;
            }

            if (idade < idadePessoaMaisNova) {
                idadePessoaMaisNova = idade;
                nomePessoaMaisNova = nome;
            }
        }

        System.out.println("===========================================");
        System.out.println("A pessoa mais jovem é " +nomePessoaMaisNova+ " com " +idadePessoaMaisNova+
            " anos.");
        System.out.println("A pessoa mais velha é " +nomePessoaMaisVelha+ " com " +idadePessoaMaisVelha+
                " anos.");
    }
}
