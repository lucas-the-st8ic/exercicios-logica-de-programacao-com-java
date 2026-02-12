package programacao.basica.modulo03.repeticoes;

import java.util.Scanner;

public class Exercicio_30 {
    /*  Jogo do Pin
    Solicita ao usuario um numero para iniciar
    a contagem e substitui os múltiplos de 4
    pela palavra PIN!
    * */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 1;
        int numeroFinal;

        System.out.print("Quer contar até quanto? ");
        numeroFinal = input.nextInt();

        while(numero <= numeroFinal) {
            if(numero % 4 == 0) {
                System.out.print("PIN! - \n");
                numero++;
            }
            System.out.print(numero + " - ");
            numero++;
        }

        System.out.println("FIM!");
    }
}
