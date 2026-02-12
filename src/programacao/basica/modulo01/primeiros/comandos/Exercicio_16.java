import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int anoDeNascimento = 0;
        int idade;

        System.out.print("Em que ano você nasceu? ");
        anoDeNascimento = input.nextInt();

        LocalDate dataNascimento = LocalDate.of(anoDeNascimento, 12,31);

        idade = Period.between(dataNascimento, LocalDate.now()).getYears();

        System.out.println("=============RESULTADO=============");
        System.out.println("Sua idade atual é de " + idade + " anos");

        if (idade > 18) {
            System.out.println("Você já deveria ter se alistado a essa altura");
        } else if (idade < 18) {
            System.out.println("Você ainda não completou 18 anos. Não Pode se alistar.");
        } else if (idade == 18) {
            System.out.println("Você precisa se alistar esse ano.");
        }
    }

