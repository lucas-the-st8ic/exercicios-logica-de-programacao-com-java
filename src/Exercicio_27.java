void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double peso;
    int opcao;
    double pesoConvertido;

    System.out.print("Qual seu peso na terra? (Kg) ");
    peso = input.nextDouble();

    System.out.println("=== Menu de Planetas ===");
    System.out.println("1 - Mercúrio");
    System.out.println("2 - Vênus");
    System.out.println("3 - Marte");
    System.out.println("4 - Júpiter");
    System.out.println("5 - Saturno");
    System.out.println("6 - Urano");
    System.out.print("Escolha um planeta pelo número: ");
    opcao = input.nextInt();

    switch (opcao) {
        case 1:
            pesoConvertido = peso * 0.38;
            System.out.printf("Seu peso em Mercúrio seria: %.1f%n Kg", pesoConvertido);

            break;
        case 2:
            pesoConvertido = peso * 0.90;
            System.out.printf("Seu peso em Vênus seria: %.1f%n Kg", pesoConvertido);

            break;
        case 3:
            pesoConvertido = peso * 0.38;
            System.out.printf("Seu peso em Marte seria: %.1f%n Kg", pesoConvertido);

            break;

        case 4:
            pesoConvertido = peso * 2.53;
            System.out.printf("Seu peso em Júpiter seria: %.1f%n Kg", pesoConvertido);

            break;
        case 5:
            pesoConvertido = peso * 1.06;
            System.out.printf("Seu peso em Saturno seria: %.1f%n Kg", pesoConvertido);

            break;
        case 6:
            pesoConvertido = peso * 0.89;
            System.out.printf("Seu peso em Urano seria: %.1f%n Kg", pesoConvertido);

            break;

        default:
            System.out.println("Opção Inválida!!");
    }
}
