import java.util.Scanner;

public class Exercicio_28 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precoProduto;

        System.out.print("Digite o preço do produto: R$ ");
        precoProduto = input.nextDouble();
        input.nextLine();

        System.out.println("--------------------------------");
        System.out.println("       TABELA DE REAJUSTE       ");
        System.out.println("--------------------------------");

        System.out.printf("%-2s | %-18s | %6s%n", "1", "Carnaval", "+10%");
        System.out.printf("%-2s | %-18s | %6s%n", "2", "Férias Escolares", "+20%");
        System.out.printf("%-2s | %-18s | %6s%n", "3", "Dia das Crianças", "+5%");
        System.out.printf("%-2s | %-18s | %6s%n", "4", "Black Friday", "-30%");
        System.out.printf("%-2s | %-18s | %6s%n", "5", "Natal", "-5%");
        System.out.printf("==========================================\n");

        System.out.print("Digite sua opção: => ");
        var opcao = input.nextLine();

        String epoca;
        double porcentagem;
        double reajuste;

        switch (opcao) {

            case "1":
                 epoca = "Carnaval";
                 porcentagem = 10 / 100.0;
                 reajuste = precoProduto * porcentagem;
                precoProduto += reajuste;

                System.out.printf("Na época de %s, o preço do produto\naumenta para R$ %.2f", epoca, precoProduto);
                break;

            case "2":
                epoca = "Férias escolares";
                porcentagem = 20 / 100.0;
                reajuste = precoProduto * porcentagem;
                precoProduto += reajuste;

                System.out.printf("Na época de %s, o preço do produto\naumenta para R$ %.2f", epoca, precoProduto);
                break;

            case "3":
                epoca = "Dia das crianças";
                porcentagem = 5 / 100.0;
                reajuste = precoProduto * porcentagem;
                precoProduto += reajuste;

                System.out.printf("No %s, o preço do produto\naumenta para R$ %.2f", epoca, precoProduto);
                break;

            case "4":
                epoca = "Black friday";
                porcentagem = 30 / 100.0;
                reajuste = precoProduto * porcentagem;
                precoProduto -= reajuste;

                System.out.printf("Na %s, o preço do produto\ndiminui para R$ %.2f", epoca, precoProduto);
                break;

            case "5":
                epoca = "Natal";
                porcentagem = 10 / 100.0;
                reajuste = precoProduto * porcentagem;
                precoProduto -= reajuste;

                System.out.printf("No %s, o preço do produto\ndiminui para R$ %.2f", epoca, precoProduto);
                break;

            default:
                System.out.printf("Em épocas assim mantenha o produto em %.2f ", precoProduto);
        }
    }
}
