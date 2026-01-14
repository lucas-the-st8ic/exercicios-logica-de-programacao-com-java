void main(String[] args) {
    //Solicita duas notas ao usuário e calcula
    //a média do aluno.

    Scanner input = new Scanner(System.in);

    double primeiraNota;
    double segundaNota;
    double media;

    System.out.print("Insira a primeira nota: ");
    primeiraNota = input.nextDouble();

    System.out.print("Insira a segunda nota: ");
    segundaNota = input.nextDouble();

    media = (primeiraNota+segundaNota)/2;

    System.out.println("======RESULTADO=========");
    System.out.printf("As notas do aluno foram %.1f e %.1f \n", primeiraNota, segundaNota);
    if(media >= 7) {
        System.out.println("Parabéns!!");
    }
    System.out.printf("SUa média final foi: %.1f \n", media);

}