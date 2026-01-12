void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String cidade;
    int numeroDeCaracteres;

    System.out.print("Em que cidade você mora?: ");
    cidade = input.nextLine();

    cidade.toUpperCase();
    cidade.replaceAll(" ","");
    char primeiroCaracter = cidade.toUpperCase().charAt(0);
    numeroDeCaracteres = cidade.length();

    cidade.replaceAll(""," ");

    System.out.println("Você mora na cidade " + cidade);
    System.out.println("A primeira letra é: " +primeiroCaracter);
    System.out.println("E contém " +numeroDeCaracteres+ " letras.");

}
