void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double primeiroNumero;
    double segundoNumero;

    System.out.print("Digite o primeiro número: ");
    primeiroNumero = input.nextDouble();

    System.out.print("Digite o segundo número: ");
    segundoNumero = input.nextDouble();


    if (primeiroNumero > segundoNumero) {
        System.out.println("Os valores digitados em ordem são: " +(int) segundoNumero + " e " + (int) primeiroNumero);
    } else if (primeiroNumero < segundoNumero) {
        System.out.println("Os valores digitados em ordem são: " + (int) primeiroNumero + " e " + (int) segundoNumero);
    } else if (primeiroNumero == segundoNumero) {
        System.out.println("Não há necessidade de ordenar os números, eles são iguais.");
    }


}
