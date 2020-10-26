package aula70;

public class Teste{

    public static void main(String[] args) {

        MinhaThreadRunndable thread1 = new MinhaThreadRunndable("#1", 500);
        MinhaThreadRunndable thread2 = new MinhaThreadRunndable("#2", 500);
        MinhaThreadRunndable thread3 = new MinhaThreadRunndable("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
