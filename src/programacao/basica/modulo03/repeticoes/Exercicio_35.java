package programacao.basica.modulo03.repeticoes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_35 {
    /*Programa que pergunte qantas pessoas serão cadastradas
    e o peso de referência a considerar-se.
    Depois disso, pergunte o peso e o sexo de cada pessoa
    e analise se cada uma está dentro do limite de peso
    ou não. No final de tudo, mostre quantos homens
    e quantas mulheres estão acima do limite
    de referência.
    */
    static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        int totalDePessoas;
        String sexo;
        double pesoDeReferencia;
        double peso;
        int totalDeHomensAcimaDoPeso = 0, totalDeMulheresAcimaDoPeso = 0;
        String pluralOuSingularM;
        String pluralOuSingularF;

        System.out.print("Quantas pessoas você deseja cadastrar? ");
        totalDePessoas = input.nextInt();

        do {
            System.out.print("Qual será o peso de referência? ");
            pesoDeReferencia = input.nextDouble();
            if (pesoDeReferencia <= 20) {
                System.out.println("\t\t!!! ATENÇÃO !!!");
                System.out.println("Insira um peso de referência válido!!");
            }

        } while (pesoDeReferencia <= 20);

        for (int i = 1; i <= totalDePessoas ; i++) {
            System.out.println("---------------------------");
            System.out.print("Pessoa " +i+ " de " +totalDePessoas);
            System.out.print("\nPeso: (Kg) ");
            peso = input.nextDouble();
            System.out.print("Sexo: [M/F] ");
            sexo = input.next();

            if (peso > pesoDeReferencia){
                System.out.print("====PESO ACIMA DO LIMITE==== \n");
                if (peso > pesoDeReferencia && sexo.equalsIgnoreCase("M")) {
                    totalDeHomensAcimaDoPeso += 1;
                } else if (peso > pesoDeReferencia && sexo.equalsIgnoreCase("F")) {
                    totalDeMulheresAcimaDoPeso += 1;
                }
            }
            if (peso <= pesoDeReferencia) {
                System.out.println("====PESO DENTRO DO LIMITE====");
            }
            System.out.println("======================");
        }

        pluralOuSingularM = (totalDeHomensAcimaDoPeso <= 1) ? " Homem" : " Homens";

        pluralOuSingularF = (totalDeMulheresAcimaDoPeso <= 1) ? " Mulher" : " Mulheres";
        System.out.println("CALCULANDO RESULTADO...");
        Thread.sleep(2000);
        System.out.println("Ao todo temos, " +totalDeHomensAcimaDoPeso+
                pluralOuSingularM + " e " +totalDeMulheresAcimaDoPeso+
                pluralOuSingularF+ " acima\ndo peso de referência.");
    }
}
