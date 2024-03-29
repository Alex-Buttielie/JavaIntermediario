//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package aula53;

public class Teste {
    public Teste() {
    }

    public static void main(String[] args) {
        usandoConstantes();
        System.out.println();
        usandoEnum();
    }

    private static void usandoConstantes() {
        int segunda = 1;
        int terca = 2;
        int quarta = 3;
        int quinta = 4;
        int sexta = 5;
        int sabado = 6;
        int domingo = 7;
        System.out.println("Teste usando constantes no Java:");

        imprimeDiaSemana(segunda);
        imprimeDiaSemana(terca);
        imprimeDiaSemana(quarta);
        imprimeDiaSemana(quinta);
        imprimeDiaSemana(sexta);
        imprimeDiaSemana(sabado);
        imprimeDiaSemana(domingo);
    }
    private static void usandoEnum(){

        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        System.out.println("Testes utilizando Enum no java: ");
        imprimeDiasSemana(segunda);
        imprimeDiasSemana(terca);
        imprimeDiasSemana(quarta);
        imprimeDiasSemana(quinta);
        imprimeDiasSemana(sexta);
        imprimeDiasSemana(sabado);
        imprimeDiasSemana(domingo);


    }
    private static void imprimeDiaSemana(int dia) {
        switch(dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
        }
    }
    private static void imprimeDiasSemana(DiaSemana dia) {
        switch(dia) {
            case SEGUNDA:
                System.out.println("Segunda-Feira");
                break;
            case TERCA:
                System.out.println("Terça-Feira");
                break;
            case QUARTA:
                System.out.println("Quarta-Feira");
                break;
            case QUINTA:
                System.out.println("Quinta-Feira");
                break;
            case SEXTA:
                System.out.println("Sexta-Feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
        }
    }

}
