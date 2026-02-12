void main(String[] args) {
    //Programa pergunta o nome do usuário e dá as boas vindas
    Scanner input = new Scanner(System.in);

    String nome;

    System.out.println("Olá!! Qual o seu nome?");
    nome = input.nextLine();

    System.out.println("Seja Bem-Vindo " +nome+ "!!!\nÉ um prazer te conhecer!!!");
}