void main(String[] args) {
    //Pede um número ao usuário e demonstra o antecessor
    //e o sucessor.

    Scanner input = new Scanner(System.in);

    int numero;
    int antecessor;
    int sucessor;

    System.out.print("Digite um número: ");
    numero = input.nextInt();

    antecessor = numero - 1;
    sucessor = numero + 1;

    System.out.println("=================================");
    System.out.println("O antecessor de " +numero+
    " é " +antecessor);
    System.out.println("O sucessor de " +numero+
            " é " +sucessor);
    System.out.println("=================================");

}