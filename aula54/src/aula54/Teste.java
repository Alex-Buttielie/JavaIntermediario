package aula54;


public class Teste  {

    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.DOMINGO;
        System.out.println(dia.toString() + ": " + dia.getValor());

        Data data = new Data(1, 4, 2020, DiaSemana.SEXTA);


    }


}
