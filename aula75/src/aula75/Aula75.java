package aula75;
public class Aula75 {

    public static void main(String [] args){
        String vazia = new String();
        System.out.printf(vazia);

        String java = new String("Java");
        System.out.println(java);

        String java1 = new String(java);
        System.out.println(java1);

        char [] charsJava = {'j', 'a', 'v', 'a'};
        String java2 = new String (charsJava);
        System.out.println(java2);

        char [] abced = {'A', 'B', 'C', 'D', 'E', 'F'};
        String abc = new String(abced, '0', '3');
        System.out.println(abc);

        byte [] ascii= {65, 66, 67, 68, 69};
        String abcde = new String (ascii);
        System.out.println(abcde);

        String bcd = new String (ascii, 1, 3);
        System.out.println(bcd);

        String java3 = "JAVA";
        String java4 = "JAVA";





    }

}
