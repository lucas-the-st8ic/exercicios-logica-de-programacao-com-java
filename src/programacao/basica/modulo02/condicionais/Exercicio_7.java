void main(String[] args) {
    //Solicita uma largura e uma altura em metros
    // calcula a área e quanto de tinta será necessário para cobrir a mesma
    Scanner input = new Scanner(System.in);

    double largura;
    double altura;
    double area;

    System.out.println("\t!!!INFORMAÇÃO IMPORTANTE!!!");
    System.out.println("\t1 litro de tinta pinta uma área de 2m² de parede\n");
    System.out.print("Digite a largura da parede em metros: ");
    largura = input.nextDouble();

    System.out.print("Digite a altura da parede em metros: ");
    altura = input.nextDouble();

    area = (largura * altura);

    System.out.println("\nUma parede de " + largura + "m por " + altura +
            "m tem uma área de " + area + " metros²");

    System.out.println("Precisaremos de " +(area / 2)+ " litros de tinta.");


}
