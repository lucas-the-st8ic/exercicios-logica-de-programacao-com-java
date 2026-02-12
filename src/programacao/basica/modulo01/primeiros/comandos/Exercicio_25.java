void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a, b, c;

    System.out.println("Digite três números inteiros\npara ordená-los" +
            " do menor para o maior");
    System.out.println("===============================================");

    System.out.print("Digite o primeiro valor: ");
    a = input.nextInt();

    System.out.print("Digite o segundo valor: ");
    b = input.nextInt();

    System.out.print("Digite o ultimo valor: ");
    c = input.nextInt();

    if(a > b) {
        int auxiliar = a;
        a = b;
        b = auxiliar;
    }

    if (a > c) {
        int auxiliar = a;
        a = c;
        c = auxiliar;
    }
    if (b > c) {
        int auxiliar = b;
        b = c;
        c = auxiliar;
    }

    System.out.println("Menor valor: " +a);
    System.out.println("Valor Intermediário: " +b);
    System.out.println("Maior valor: " +c);
}
