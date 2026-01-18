void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int anoDeNascimento = 0;
    int idade;



    System.out.print("Em que ano você nasceu? ");
    anoDeNascimento = input.nextInt();

    LocalDate dataDeNascimento = LocalDate.of(anoDeNascimento, 12, 31);

    idade = Period.between(dataDeNascimento, LocalDate.now()).getYears();

    System.out.println("Hoje em " +LocalDate.now().getYear()+", você tem "
            +idade+ " anos certo?");
    System.out.println("==================================");
    System.out.println("Seja bem-vindo(a) ao Banco Itaú!!");
    if (idade >= 60) {
        System.out.println("===!ATENÇÃO DIRIJA-SE À FILA PREFERENCIAL!===");
    }
}
