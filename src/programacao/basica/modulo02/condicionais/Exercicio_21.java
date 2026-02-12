void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double numero;

    System.out.print("Digite um numero: ");
    numero = input.nextDouble();

    if(Math.signum(numero) > 0) {
        System.out.println("O número é positivo.");
    } else if(Math.signum(numero) == 0) {
        System.out.println("O número é nulo.");
    } else if (Math.signum(numero) < 0) {
        System.out.println("O número é negativo.");
    }

}
