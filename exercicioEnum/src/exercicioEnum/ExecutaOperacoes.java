package exercicioEnum;

public class ExecutaOperacoes {


    private Operacoes simbolo;
    private double num1;
    private double num2;

    public ExecutaOperacoes() {super();
    }

    public ExecutaOperacoes(Operacoes simbolo, double num1, double num2) {
        super();
        this.simbolo = simbolo;
        this.num1 = num1;
        this.num2 = num2;
    }

    public static double dividir() {
        double num1 = 0;
        double num2 = 0;
        double result = num1 / num2;
        return result;
    }
    public static double multiplicar() {
        double num1 = 0;
        double num2 = 0;
        double result = num1 * num2;
        return result;
    }
    public static double subtrair() {
        double num1 = 0;
        double num2 = 0;
        double result = num1 - num2;
        return result;
    }
    public static double somar() {
        double num1 = 0;
        double num2 = 0;
        double result = num1 + num2;
        return result;
    }

    public Operacoes getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(Operacoes simbolo) {
        this.simbolo = simbolo;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "ExecutaOperacoes{" +
                "simbolo=" + simbolo +
                '}';
    }
}
