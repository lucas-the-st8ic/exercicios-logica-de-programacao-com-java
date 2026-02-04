void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String estado = " ";
    String gentilico = " ";

    System.out.print("Em que estado do Brasil você nasceu? ");
    estado = input.nextLine();

    estado = estado.trim().toUpperCase();

    if (estado.equals("AC") || estado.equals("ACRE")) {
        gentilico = "acreano";
    } else if (estado.equals("AL") || estado.equals("ALAGOAS")) {
        gentilico = "alagoano";
    } else if (estado.equals("AP") || estado.equals("AMAPÁ") || estado.equals("AMAPA")) {
        gentilico = "amapaense";
    } else if (estado.equals("AM") || estado.equals("AMAZONAS")) {
        gentilico = "amazonense";
    } else if (estado.equals("BA") || estado.equals("BAHIA")) {
        gentilico = "baiano";
    } else if (estado.equals("CE") || estado.equals("CEARÁ") || estado.equals("CEARA")) {
        gentilico = "cearense";
    } else if (estado.equals("DF") || estado.equals("DISTRITO FEDERAL")) {
        gentilico = "brasiliense";
    } else if (estado.equals("ES") || estado.equals("ESPÍRITO SANTO") || estado.equals("ESPIRITO SANTO")) {
        gentilico = "capixaba";
    } else if (estado.equals("GO") || estado.equals("GOIÁS") || estado.equals("GOIAS")) {
        gentilico = "goiano";
    } else if (estado.equals("MA") || estado.equals("MARANHÃO") || estado.equals("MARANHAO")) {
        gentilico = "maranhense";
    } else if (estado.equals("MT") || estado.equals("MATO GROSSO")) {
        gentilico = "mato-grossense";
    } else if (estado.equals("MS") || estado.equals("MATO GROSSO DO SUL")) {
        gentilico = "sul-mato-grossense";
    } else if (estado.equals("MG") || estado.equals("MINAS GERAIS")) {
        gentilico = "mineiro";
    } else if (estado.equals("PA") || estado.equals("PARÁ") || estado.equals("PARA")) {
        gentilico = "paraense";
    } else if (estado.equals("PB") || estado.equals("PARAÍBA") || estado.equals("PARAIBA")) {
        gentilico = "paraibano";
    } else if (estado.equals("PR") || estado.equals("PARANÁ") || estado.equals("PARANA")) {
        gentilico = "paranaense";
    } else if (estado.equals("PE") || estado.equals("PERNAMBUCO")) {
        gentilico = "pernambucano";
    } else if (estado.equals("PI") || estado.equals("PIAUÍ") || estado.equals("PIAUI")) {
        gentilico = "piauiense";
    } else if (estado.equals("RJ") || estado.equals("RIO DE JANEIRO")) {
        gentilico = "carioca";
    } else if (estado.equals("RN") || estado.equals("RIO GRANDE DO NORTE")) {
        gentilico = "potiguar";
    } else if (estado.equals("RS") || estado.equals("RIO GRANDE DO SUL")) {
        gentilico = "gaúcho";
    } else if (estado.equals("RO") || estado.equals("RONDÔNIA") || estado.equals("RONDONIA")) {
        gentilico = "rondoniense";
    } else if (estado.equals("RR") || estado.equals("RORAIMA")) {
        gentilico = "roraimense";
    } else if (estado.equals("SC") || estado.equals("SANTA CATARINA")) {
        gentilico = "catarinense";
    } else if (estado.equals("SP") || estado.equals("SÃO PAULO") || estado.equals("SAO PAULO")) {
        gentilico = "paulista";
    } else if (estado.equals("SE") || estado.equals("SERGIPE")) {
        gentilico = "sergipano";
    } else if (estado.equals("TO") || estado.equals("TOCANTINS")) {
        gentilico = "tocantinense";
    } else {
        gentilico = "Estado inválido";
    }

    System.out.println("Nascendo no estado " +estado+
            " você é " +gentilico);
}


