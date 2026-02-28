package programacao.basica.modulo03.repeticoes;

import java.util.Scanner;

public class Exercicio_40 {
    static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        double primeiroOperando;
        double segundoOperando;
        int opcao = 0;

        System.out.print("Digite o primeiro operando: ");
        primeiroOperando = input.nextDouble();

        System.out.print("Digite o segundo operando: ");
        segundoOperando = input.nextDouble();

        while(opcao != 5) {

            System.out.println("========= ESCOLHA UMA OPERAÇÃO =========");
            System.out.println("[1]\tAdição");
            System.out.println("[2]\tSubtração");
            System.out.println("[3]\tMultiplicação");
            System.out.println("[4]\tEntrar com novos dados");
            System.out.println("[5]\tSair");
            System.out.println("-------------------------");
            System.out.print("Digite sua opção: ");
            opcao = input.nextInt();
            System.out.println("-------------------------");
            Thread.sleep(2500);

            switch (opcao) {
                case 1:

                    System.out.printf("Calculando %.0f + %.0f = %.0f" ,primeiroOperando,
                            segundoOperando,(primeiroOperando + segundoOperando));
                    System.out.println("\n------------------");
                    Thread.sleep(1000);
                    break;

                    case 2:

                    System.out.printf("Calculando %.0f - %.0f = %.0f" ,primeiroOperando,
                            segundoOperando,(primeiroOperando - segundoOperando));
                    System.out.println("\n------------------");
                    Thread.sleep(1000);
                    break;

                    case 3:

                    System.out.printf("Calculando %.0f * %.0f = %.0f" ,primeiroOperando,
                            segundoOperando,(primeiroOperando * segundoOperando));
                    System.out.println("\n------------------");
                    Thread.sleep(1000);
                    break;

                    case 4:
                        System.out.print("Digite o primeiro operando: ");
                        primeiroOperando = input.nextDouble();

                        System.out.print("Digite o segundo operando: ");
                        segundoOperando = input.nextDouble();
                        Thread.sleep(1000);
                    break;

                    case 5:
                        break;

                    default :
                        System.out.println("============ OPÇÃO INVÁLIDA ============");
                        Thread.sleep(1300);
            }
        }
    }
}
