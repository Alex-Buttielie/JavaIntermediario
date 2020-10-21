package exercicioEnum;



public class TesteCal{

    public static void main(String[] args) {
      //  "No enum constant " + enumType.getCanonicalName() + "." + name);
       double x = 2.0;
       double y = 3.0;

       for(Operacoes op : Operacoes.values()){
           System.out.print(x + " ");
           System.out.print(op.toString() + " ");
           System.out.print(y + " = ");
           System.out.println(op.executarOperacao(x, y));
       }

    }


}
