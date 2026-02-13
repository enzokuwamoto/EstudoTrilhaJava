package ZZHthreads.test;

class ThreadExample extends Thread{
    private final char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.println(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable2 implements Runnable{
    private final char c;

    public ThreadExampleRunnable2(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.println(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
        Thread.yield();
    }
}

public class ThreadsTest02 {
    static void main(String[] args) {
        Thread t1 = new Thread(new  ThreadExampleRunnable2('A')) ;
        Thread t2 = new Thread(new  ThreadExampleRunnable2('B')) ;
        t1.start();
        t2.start();

    }
}
