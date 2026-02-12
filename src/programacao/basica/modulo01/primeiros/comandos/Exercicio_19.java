void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double numero;

    System.out.println("===Números positivos: INVERSO | Outros: OPOSTO===");
    System.out.print("Digite um numero: ");
    numero =  (int) input.nextInt();

    if(numero > 0) {
         double inverso = 1 / numero;
        System.out.printf("O inverso de %.0f é: %.3f\n", numero, inverso);

    } else if (numero <= 0) {
        double oposto = numero * -1;
        System.out.printf("O oposto de %.0f é: %.0f\n", numero, oposto);
    }
}
