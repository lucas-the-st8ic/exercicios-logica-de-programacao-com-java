void main(String[] args) {
    Scanner input = new Scanner(System.in);
    /*Pergunta ao usuário quantos cigarro fuma por dia
    * e calcula quantos dias de vida ele perdeu por fumar.*/

    double minutosPerdidos = 10, anosFumando, cigarrosPorDia;
    double cigarrosAoTodo, minutosDeVidaPerdidos, minutosPerdidosEmDias;


    System.out.println("Cada cigarro reduz 10 minutos de vida");
    System.out.println("=====================================");

    System.out.print("Há quantos anos você fuma? ");
    anosFumando = input.nextDouble();

    System.out.print("Quantos cigarros você fuma por dia? ");
    cigarrosPorDia = input.nextDouble();

    cigarrosAoTodo = (anosFumando * 365) * cigarrosPorDia;
    minutosDeVidaPerdidos = cigarrosAoTodo * 10;
    minutosPerdidosEmDias = (minutosDeVidaPerdidos / 60) / 24;

    System.out.println("Ao todo você já fumou " + cigarrosAoTodo+
            " cigarros!");
    System.out.printf("Estima-se que você já perdeu %.1f minutos de vida!!", minutosDeVidaPerdidos );
    System.out.printf("\nO equivalente a %.2f dias.", minutosPerdidosEmDias);;




}
