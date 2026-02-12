void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int anoDeNascimento;
    int anoAtual = 2026;
    int idade;

    System.out.print("Em que ano você nasceu?:");
    anoDeNascimento = input.nextInt();

    idade = anoAtual - anoDeNascimento;

    System.out.println("Hoje em " +anoAtual+", você tem "
    +idade+ " anos certo?");
    System.out.println("==================================");
    System.out.println("Seja bem-vindo(a) ao Banco Itaú!!");
    if (idade >= 60) {
        System.out.println("===!ATENÇÃO DIRIJA-SE À FILA PREFERENCIAL!===");
    }
}
