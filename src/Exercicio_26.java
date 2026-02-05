import java.sql.SQLOutput;

void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double primeiroOperando;
    double segundoOperando;
    double resultado;
    String opcao;

    System.out.printf("%s%n", "================= TABUADA =================");
    System.out.printf("%-25s %s%n", "( + ou Adição) =>",        "Operação de Soma");
    System.out.printf("%-25s %s%n", "( - ou Subtração) =>",     "Operação de Subtração");
    System.out.printf("%-25s %s%n", "( * ou Multiplicação) =>", "Operação de Multiplicação");
    System.out.printf("%-25s %s%n", "( / ou Divisão) =>",       "Operação de Divisão");
    System.out.printf("%s%n", "==========================================");


    System.out.print("Escolha uma das opções: => ");
    opcao = input.nextLine();
    opcao = Normalizer.normalize(opcao, Normalizer.Form.NFD)
            .replaceAll("\\p{M}", "")
            .trim()
            .toUpperCase();

    switch (opcao) {
        case "+":
        case "ADICAO":
            System.out.print("Digite o primeiro operando: ");
            primeiroOperando = input.nextDouble();
            System.out.print("Digite o segundo operando: ");
            segundoOperando = input.nextDouble();
            System.out.printf("Resultado da soma: %.0f%n",
                    primeiroOperando + segundoOperando);
            break;

        case "-":
        case "SUBTRACAO":
            System.out.print("Digite o primeiro operando: ");
            primeiroOperando = input.nextDouble();
            System.out.print("Digite o segundo operando: ");
            segundoOperando = input.nextDouble();
            System.out.printf("Resultado da subtração: %.0f%n",
                    primeiroOperando - segundoOperando);
            break;

        case "*":
        case "MULTIPLICACAO":
            System.out.print("Digite o primeiro operando: ");
            primeiroOperando = input.nextDouble();
            System.out.print("Digite o segundo operando: ");
            segundoOperando = input.nextDouble();
            System.out.printf("Resultado da multiplicação: %.0f%n",
                    primeiroOperando * segundoOperando);
            break;

        case "/":
        case "DIVISAO":
            System.out.print("Digite o primeiro operando: ");
            primeiroOperando = input.nextDouble();
            System.out.print("Digite o segundo operando: ");
            segundoOperando = input.nextDouble();
            if (segundoOperando == 0) {
                System.out.println("Erro: divisão por zero!");
            } else {
                System.out.printf("Resultado da divisão: %.1f%n",
                        primeiroOperando / segundoOperando);
            }
            break;

        default:
            System.out.println("Opção inválida!");
    }

}
