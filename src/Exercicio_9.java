void main(String[] args) {
    /*Solicita ao usuário nome do funcionário
    * salário e porcentagem de reajuste
    * calcula quanto ira receber de aumento e demonstra na
    * tela*/

    Scanner input = new Scanner(System.in);

    String nomeFuncionaro;
    double salario;
    double porcentagemAumento;
    double valorAumento;
    double salarioFinal;

    System.out.print("Digite o nome do funcionário:");
    nomeFuncionaro = input.nextLine();

    System.out.print("Salário: R$");
    salario = input.nextDouble();

    System.out.print("Reajuste: (%)");
    porcentagemAumento = input.nextDouble();

    valorAumento = (porcentagemAumento / 100) * salario;

    salarioFinal = salario + valorAumento;

    System.out.println("================RESULTADO================");
    System.out.printf("O funcionário %s ganhava R$%.2f\n", nomeFuncionaro, salario);
    System.out.printf("Depois de ganhar %.0f%% de aumento, \nvai passar a ganhar R$%.2f a mais por mês.\n", porcentagemAumento, valorAumento);
    System.out.printf("Seu novo salário será de R$%.2f\n\n", salarioFinal);
}
