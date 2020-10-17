package aula53;

public class Teste {
    public Teste() {
    }

    public static void main(String[] args) {
        usandoConstantes();
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
}
