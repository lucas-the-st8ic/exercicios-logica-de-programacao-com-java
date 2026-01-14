void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String nome;
    String primeiroNome;
    int finalPrimeiroNome;

    System.out.print("Digite seu nome completo: ");
    nome = input.nextLine();

    finalPrimeiroNome = nome.indexOf(" ");

    primeiroNome = nome.substring(0, finalPrimeiroNome).toUpperCase();

    System.out.println("Seu primeiro nome é: " + primeiroNome);

}
