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
    System.out.printf("As notas do aluno foram %.2f e %.2f \n", primeiraNota, segundaNota);
    System.out.printf("A média final foi: %.2f \n", media);

}