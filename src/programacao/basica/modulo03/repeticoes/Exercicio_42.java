package programacao.basica.modulo03.repeticoes;

import java.util.Scanner;

public class Exercicio_42 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        String sexo;
        double salario;

        String continuar = "S";
        int totalDeFuncionarios = 0;
        int totalDeHomens = 0;
        int totalDeMulheres = 0;
        double somaSalarialHomens = 0;
        double mediaSalarialHomens = 0.0;
        int qtdMulheresGanhando1000ouMais = 0;
        double maiorSalarioHomens = 0.0;

        do {
            System.out.print("Nome: ");
            nome = input.next();
            System.out.print("Sexo[M/F]: ");
            sexo = input.next();
            System.out.print("Salário: R$");
            salario = input.nextDouble();
            System.out.print("Quer continuar? [S/N]: ");
            continuar = input.next();
            System.out.println("-----------------------------");
                totalDeFuncionarios++;

                if (sexo.equalsIgnoreCase("M")) {
                    totalDeHomens++;

                    if (totalDeHomens == 1) {
                        maiorSalarioHomens = salario;
                    } else if(salario > maiorSalarioHomens) {
                        maiorSalarioHomens = salario;
                    }

                    somaSalarialHomens += salario;

                } else if (sexo.equalsIgnoreCase("f")) {
                    totalDeMulheres++;

                  if (salario > 1000) {
                      qtdMulheresGanhando1000ouMais++;
                  }

                }

        } while (continuar.equalsIgnoreCase("S"));

        mediaSalarialHomens = somaSalarialHomens /(double)totalDeHomens;

        System.out.println("========= RESULTADOS =========");
        System.out.println("Total de funcionários: " +totalDeFuncionarios);
        System.out.println("Total de Homens: " +totalDeHomens);
        System.out.println("Total de Mulheres: " +totalDeMulheres);
        System.out.printf("A média salarial dos Homens é R$%.2f\n", mediaSalarialHomens);
        System.out.println("Temos " +qtdMulheresGanhando1000ouMais+
        " mulheres ganhando mais de R$1000");
        System.out.printf("O maior salário entre os Homens é de R$%.2f\n", maiorSalarioHomens);
        System.out.println("===============================================");
    }
}
