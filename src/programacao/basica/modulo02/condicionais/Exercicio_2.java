void main(String[] args) {
    //Pergunta nome,ano de nascimento e salário de um funcionário e mostra na tela uma ficha funcional)
    Scanner input = new Scanner(System.in);

    String nomeFuncionario;
    int anoNascimento;
    double salario;

    System.out.println("Digite o nome do funcionário: ");
    nomeFuncionario = input.nextLine();

    System.out.println("Digite o ano de nascimento: ");
    anoNascimento = input.nextInt();

    System.out.println("Digite o salario: R$");
    salario = input.nextDouble();

    System.out.println("=====-FICHA FUNCIONAL-=====");
    System.out.println("Nome: "+nomeFuncionario);
    System.out.println("Ano de nascimento: "+anoNascimento);
    System.out.printf("Salario: R$%.2f\n",salario);
    System.out.println("===========================");
}
