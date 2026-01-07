void main(String[] args) {
    //Converte uma distância fornecia pelo usuário em metros
    //para outras unidades de comprimento/distância


    Scanner input = new Scanner(System.in);
    double metros;

    System.out.print("Digite a distância em metros: ");
    metros = input.nextDouble();

    System.out.println("====CONVERSÃO PARA OUTRAS UNIDADES=====");

    System.out.println((metros / 1000) + " km");
    System.out.println((metros / 100) + " Hm");
    System.out.println((metros / 10) + " Dam");
    System.out.println((metros * 10) + " Dm");
    System.out.println((metros * 100) + " Cm");
    System.out.println((metros * 1000) + " Mm");

}
