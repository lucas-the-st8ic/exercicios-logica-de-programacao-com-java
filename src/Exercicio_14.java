void main(String[] args) {
    /*Se o valor da compra for maior que
    * 500 reais calcula e aplica um desconto
    * de 10%*/

    Scanner input = new Scanner(System.in);

    double valor;
    double valorDeDesconto;
    double desconto = 10;

    System.out.print("Qual foi o valor total da compra? R$");
    valor = input.nextDouble();

    System.out.println("==========RESULTADO==========");
    System.out.printf("Você comprou R$%.2f na nossa loja!\n", valor);
    if (valor >= 500){

        valorDeDesconto = valor * (desconto / 100.00);
        valor -= valorDeDesconto;

        System.out.println("=========ATENÇÃO==========");
        System.out.println("Por comprar mais de R$500 reais \nvocê terá desconto em suas compras");
        System.out.printf("Valor de desconto: R$%.2f", valorDeDesconto);
        System.out.printf("\nValor total da sua compra: R$%.2f\n", valor);
    } else {
        System.out.printf("Valor total da sua compra: R$%.2f\n", valor);
    }

    System.out.println("=========OBRIGADO========");
    System.out.println("=======VOLTE SEMPRE=======");



}
