package aula61;

public class PassagemValorParametro   {

    public static void main(String[] args) {

        Contato contato = new Contato("Contato 1",  "1234-5678", "contato@gmail.com");
        int valor = 10;

        System.out.println(contato);
        System.out.println(valor);

        testePassagemValorReferencia(valor, contato);

        System.out.println(contato);
        System.out.println(valor);

        System.out.println(contato);
        System.out.println(valor);

    }

    private static void testePassagemValorReferencia(int valor, Contato contato) {
   }


}
