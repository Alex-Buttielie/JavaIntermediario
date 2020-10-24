package aula66;

import aula61.Contato;

public class ColetorDelixo {
    public static void obterMemoriaUsada(){
        final int Mb = 10240 *1024;
        Runtime runtime = Runtime.getRuntime(); //singleton
        System.out.println((runtime.totalMemory()-runtime.freeMemory()/Mb));
    }
    public static void main(String[] args) {

        Contato [] contatos = new Contato[10000];
        Contato contato;
        for(int i=0; i<contatos.length; i++ ){
          contato = new Contato("Contato" +i, "1234-56789"+i ,"contato"+i+"@email.com");
          contatos[i]=contato;
        }
        System.out.println("Contatos criados");
        obterMemoriaUsada();
        contatos = null;
        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc();
        System.out.println("Contatos removidos da memória");
        obterMemoriaUsada();
    }


}
