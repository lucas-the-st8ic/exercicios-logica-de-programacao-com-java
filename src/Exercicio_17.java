import java.time.Year;

   static void main(String[] args) {

       int ano = 2008; //LocalDate.now().getYear();

       /*  Método manual de verificação
       1. ano % 400 == 0
              -Verifica se o ano é divisível por 400
              -Exemplo: 1600, 2000 → bissextos
              -Esta condição sozinha já garante o bissexto, independentemente das outras

        2. (ano % 4 == 0 && ano % 100 != 0)
               -ano % 4 == 0 → candidato a bissexto
               -ano % 100 != 0 → exclui anos seculares (1700, 1800, 1900…)

        3. Operador || (OU)
                -Basta uma das duas condições ser
                -verdadeira para o ano ser bissexto

       * */
       //boolean anoBissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);

       boolean anoBissexto = Year.isLeap(ano);

       if (anoBissexto) {
           System.out.println(ano+ " é um ano bissexto.");
       } else {
           System.out.println(ano+ " não é um ano bissexto.");
       }
   }

