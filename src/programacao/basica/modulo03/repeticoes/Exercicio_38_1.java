package programacao.basica.modulo03.repeticoes;

import java.util.Scanner;

public class Exercicio_38_1 {

        static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String nome;

            String nomeDoHomemMaisNovo = "";
            String nomeDoHomemMaisVelho = "";

            String nomeDaMulherMaisNova = "";
            String nomeDaMulherMaisVelha = "";

            int idade;

            int idadeHomemMaisNovo = Integer.MAX_VALUE;
            int idadeHomemMaisVelho = Integer.MIN_VALUE;

            int idadeDaMulherMaisNova = Integer.MAX_VALUE;
            int idadeDaMulherMaisVelha = Integer.MIN_VALUE;

            int totalDeHomens = 0;
            int totalDeMulheres = 0;
            String sexo = "";

            for(int i = 1; i <= 5; i++) {
                System.out.println("-------------");
                System.out.println(i+ "° Pessoa");
                System.out.println("-------------");
                System.out.print("NOME: ");
                nome = input.next();
                System.out.print("SEXO [M/F]: ");
                sexo = input.next().trim().toUpperCase();

                System.out.print("IDADE: ");
                idade = input.nextInt();

                if(sexo.equals("M")){
                    totalDeHomens++;
                    if (totalDeHomens == 1) {
                        idadeHomemMaisNovo = idade;
                        nomeDoHomemMaisNovo = nome;

                        idadeHomemMaisVelho = idade;
                        nomeDoHomemMaisVelho = nome;

                    } else {
                        if (idade < idadeHomemMaisNovo){
                            idadeHomemMaisNovo = idade;
                            nomeDoHomemMaisNovo = nome;
                        }

                        if(idade > idadeHomemMaisVelho){
                            idadeHomemMaisVelho = idade;
                            nomeDoHomemMaisVelho = nome;
                        }
                    }

                } else if (sexo.equals("F")) {
                    totalDeMulheres++;
                    
                    if (totalDeMulheres == 1) {
                        idadeDaMulherMaisNova = idade;
                        nomeDaMulherMaisNova = nome;

                        idadeDaMulherMaisVelha = idade;
                        nomeDaMulherMaisVelha= nome;

                    } else {

                        if(idade < idadeDaMulherMaisNova){
                            idadeDaMulherMaisNova = idade;
                            nomeDaMulherMaisNova = nome;
                        }

                        if(idade > idadeDaMulherMaisVelha){
                            idadeDaMulherMaisVelha = idade;
                            nomeDaMulherMaisVelha = nome;
                        }
                    }
                } else {
                    System.out.println("Insira um caracter válido.(M/F)");
                    i--;
                }
            } 

            String pluralOuSingularH = (totalDeHomens <= 1) ? " homem " : " homens ";

            String pluralOuSingularM = (totalDeMulheres <= 1) ? " mulher " : " mulheres ";

            System.out.println("=======================================================");
            System.out.println("Ao todo tivemos " +totalDeHomens + pluralOuSingularH+
                    "e " +totalDeMulheres +pluralOuSingularM+ "cadastrados.");

            System.out.println("O homem mais jovem é " +nomeDoHomemMaisNovo+
                    " que tem " +idadeHomemMaisNovo+ " anos.");
            System.out.println("O homem mais velho é " +nomeDoHomemMaisVelho+
                    " que tem " +idadeHomemMaisVelho+ " anos.");

            System.out.println("A mulher mais jovem é " +nomeDaMulherMaisNova+
                    " que tem " +idadeDaMulherMaisNova+ " anos.");
            System.out.println("A mulher mais velha é " +nomeDaMulherMaisVelha+
                    " que tem " +idadeDaMulherMaisVelha+ " anos.");
            System.out.println("=======================================================");
        }
}
