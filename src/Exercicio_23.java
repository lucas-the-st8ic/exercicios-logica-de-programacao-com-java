void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int anoDeNascimento = 0;
    int idade;

    System.out.print("Em que ano você nasceu? ");
    anoDeNascimento = input.nextInt();

    LocalDate dataNascimento = LocalDate.of(anoDeNascimento, 1,1);
    LocalDate dataDeAlistamento = dataNascimento;

    idade = Period.between(dataNascimento, LocalDate.now()).getYears();

    System.out.println("=============RESULTADO=============");
    System.out.println("Sua idade atual é de " + idade + " anos");

    if (idade > 18) {

        dataDeAlistamento = LocalDate.now().minusYears(idade - 18);

        int atrasoEmAnos = Period.between(dataDeAlistamento, LocalDate.now()).getYears();

        System.out.println("Você já deveria ter se alistado no ano de " +dataDeAlistamento.getYear());
        System.out.println("Você já está atrasado " +atrasoEmAnos+ " Anos");

    } else if (idade < 18) {

        dataDeAlistamento = LocalDate.now().plusYears(18 - idade);

        System.out.println("Você ainda não completou 18 anos. Não Pode se alistar.");
        System.out.println("Você deve se alistar no ano de " +dataDeAlistamento.getYear());

    } else {
        System.out.println("Você precisa se alistar esse ano.");
    }
}
