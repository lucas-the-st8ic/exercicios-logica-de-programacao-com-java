package programacao.basica.modulo03.repeticoes;

import java.util.Scanner;

public class Exercicio_42 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        String sexo;
        double salario;

        String continuar = null;
        int totalDeFuncionarios;
        int totalDeHomens;
        int totalDeMulheres;
        double somaSalarialHomens;
        double mediaSalarialHomens;
        int qtdMulheresGanhando1000ouMais;
        double maiorSalarioHomens;

        while(true) {
            System.out.print("Nome: ");
            nome = input.next();
            System.out.print("\nSexo[M/F]: ");
            sexo = input.nextLine();
            System.out.print("Salário: R$");
            salario = input.nextDouble();
            System.out.print("Quer continuar? [S/N]: ");
            continuar = input.nextLine();

            if (continuar.equalsIgnoreCase("n")) {
                break;
            }
            else {
                if (sexo.equalsIgnoreCase())
            }
        }
    }
}
