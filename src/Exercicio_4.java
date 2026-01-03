void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double operador1;
    double operador2;

    System.out.print("Digite um valor: ");
    operador1 = input.nextDouble();

    System.out.print("Digite outro valor: ");
    operador2 = input.nextDouble();

    System.out.println("========RESULTADOS========");
    System.out.println("Soma = " +(int) (operador1 + operador2));
    System.out.println("Subtração = " +(int) (operador1 - operador2));
    System.out.println("Multiplicação = " +(int) (operador1 * operador2));
    System.out.println("Divisão inteira = " +(int) (operador1 / operador2));
    System.out.println("Divisão real = " +(operador1 / operador2));
    System.out.println("Resto da divisão = " + (int) (operador1 % operador2));
}
