package programacao.basica.modulo03.repeticoes;
import java.util.Scanner;

public class Exercicio_41_1 {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = null;
        int idade;
        int totalDeAmigos = 0;
        double mediaDasIdades = 0.0;
        int somaDasIdades = 0;

        int idadeAmigoMaisNovo = 0;
        String nomeAmigoMaisNovo = null;

        int idadeAmigoMaisVelho = 0;
        String nomeAmigoMaisVelho = null;

        System.out.println("Adicione nome e idade de quantos amigos você desejar:");

        while (true) {
            System.out.println("--Digite FIM para encerrar--");
            System.out.println("--------NOVO AMIGO--------");
            System.out.print("Nome: ");
            nome = input.next();

            if (nome.equalsIgnoreCase("FIM")) {

                System.out.println("--==FINALIZANDO CADASTROS==--");
                break;

            } else {
                System.out.print("IDADE: ");
                idade = input.nextInt();

                totalDeAmigos++;
                somaDasIdades += idade;

                if (totalDeAmigos == 1) {
                    idadeAmigoMaisNovo = idade;
                    nomeAmigoMaisNovo = nome;

                    idadeAmigoMaisVelho = idade;
                    nomeAmigoMaisVelho = nome;

                } else {

                    if(idade < idadeAmigoMaisNovo) {

                        idadeAmigoMaisNovo = idade;
                        nomeAmigoMaisNovo = nome;
                    }

                    if(idade > idadeAmigoMaisVelho) {

                        idadeAmigoMaisVelho = idade;
                        nomeAmigoMaisVelho = nome;
                    }
                }


            }

        }

        mediaDasIdades = (double) somaDasIdades / totalDeAmigos;

        System.out.println("========RESULTADOS========");
        System.out.println("Total de amigos: " + totalDeAmigos);
        System.out.printf("A média das idades é: %.2f%n", mediaDasIdades);
        System.out.println("Seu amigo mais jovem é " + nomeAmigoMaisNovo +
                " com " + idadeAmigoMaisNovo + " anos.");
        System.out.println("Seu amigo mais velho é " + nomeAmigoMaisVelho +
                " com " + idadeAmigoMaisVelho + " anos.");
        System.out.println("-------------------------------------------------------");


    }

}