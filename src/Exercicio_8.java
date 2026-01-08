void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double preco;
    double desconto;
    double valorDesconto;
    double precoFinal;

    System.out.print("Qual é o preço do produto? R$");
    preco = input.nextDouble();

    System.out.println("==============================");

    System.out.print("Qual será a porcentagem de desconto? % ");
    desconto = input.nextDouble();

    System.out.println("==============================");

    valorDesconto = (desconto / 100) * preco;
    precoFinal = preco - valorDesconto;

    System.out.printf("O produto custava R$%.2f e agora custará R$%.2f\njá com %d%% de desconto.\n", preco, precoFinal, (int) desconto);
    System.out.printf("Ao todo teremos R$%.2f de economia", valorDesconto);
}
