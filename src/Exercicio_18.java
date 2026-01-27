import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;

void main(String[] args) {
    Scanner input = new Scanner(System.in);


    double distanciaTotal;
    double valorPorKm = 0.50;
    double valorPorKmAcimaDe200 = 0.35;
    double precoDaViagem;

    System.out.println("============VIAÇÃO ESTUDONAUTA============");
    System.out.printf("Viagens até 200 Km:\t R$%.2f /KM\n", valorPorKm);
    System.out.printf("Viagens acima de 200 Km:\tR$%.2f /KM\n", valorPorKmAcimaDe200);
    System.out.println("===========================================");

    System.out.print("Informe a distância total da viagem, em Km: ");
    distanciaTotal = input.nextDouble();

    if (distanciaTotal <= 200.0) {
        precoDaViagem = distanciaTotal * valorPorKm;
    } else {
        precoDaViagem = distanciaTotal * valorPorKmAcimaDe200;
    }

    System.out.println("============CALCULO DA VIAGEM============");
    if (distanciaTotal <= 200) {
        System.out.printf("Uma viagem de %.0fKM vai custar R$%.2f/KM\n", distanciaTotal, valorPorKm);
    } else {
        System.out.printf("Uma viagem de %.0fKM vai custar R$%.2f/KM\n", distanciaTotal, valorPorKmAcimaDe200);
    }
    System.out.printf("Valor total: R$%.2f", precoDaViagem);
}
