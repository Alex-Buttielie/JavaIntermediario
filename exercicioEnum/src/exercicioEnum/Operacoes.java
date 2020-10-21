package exercicioEnum;

public enum Operacoes {

    SOMAR("+"){
        @Override
        public double executarOperacao(double x, double y) {
            return x+y;
        }
    },
    SUBTRAIR("-"){
        @Override
        public double executarOperacao(double x, double y){
            if(x>y)
                return x-y;
            else return y-x;
        }
    },
    MULTIPLICAR("*"){
        @Override
        public double executarOperacao(double x, double y) {
            return x*y;
        }
    },
    DIVIDIR("/"){
        @Override
        public double executarOperacao(double x, double y) {

            if(x>y)
                return x/y;
            else return y/x;
        }
    };

    private String simbolo;

    Operacoes(String simbolo){
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return this.simbolo;
    }

    public String toString(){
        return this.simbolo;
    }
    public abstract double executarOperacao(double x, double y);
}
