void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String cidade;
    int numeroDeCaracteres;

    System.out.print("Em que cidade você mora?: ");
    cidade = input.nextLine();

    cidade.toUpperCase();
    char primeiroCaracter = cidade.charAt(0);
    numeroDeCaracteres = 0;

    for(int caracter = 0; caracter < cidade.length(); caracter++){
        if(cidade.charAt(caracter) != ' '){
            numeroDeCaracteres++;
        }
    }

    System.out.println("Você mora na cidade: " + cidade);
    System.out.println("A primeira letra é: " +primeiroCaracter);
    System.out.println("E contém " +numeroDeCaracteres+ " letras.");
}
