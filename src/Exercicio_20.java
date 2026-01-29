void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double precoDoIngresso = 29.99;

    LocalTime horario = LocalTime.now();

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

    System.out.println("Agora são- " +horario.format(formato));
    System.out.println(
            "===== FILMES EM CARTAZ =====\n" +
                    "1 - Interestelar\n" +
                    "   Horários: 14:30 | 18:00 | 21:45\n\n" +
                    "2 - O Senhor dos Anéis: A Sociedade do Anel\n" +
                    "   Horários: 13:00 | 17:15 | 20:40\n\n" +
                    "3 - Matrix\n" +
                    "   Horários: 15:20 | 19:00 | 22:10\n\n" +
                    "4 - Vingadores: Ultimato\n" +
                    "   Horários: 14:00 | 18:30 | 22:00\n\n" +
                    "5 - Batman: O Cavaleiro das Trevas\n" +
                    "   Horários: 16:10 | 20:00\n" +
                    "============================"
    );

    System.out.println("Digite o horário do filme (HH:mm):");
    String hora = input.nextLine();

    System.out.println();
    LocalTime horarioDoFilme = LocalTime.parse(hora, formato);

    System.out.println(horarioDoFilme);

    if (horarioDoFilme.isAfter(horario)) {
        System.out.println("Vendas para a sessão encerradas");
    } else {
        System.out.println("Ingressos disponíveis para a sessão");
    }
}
