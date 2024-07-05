package creational_design_patterns.SingletonPattern.scenarios_breaking_singleton;

public class ThreadTest extends Thread{

    @Override
    public void run() {
        System.out.println("Inside the thread"+ Thread.currentThread().getName());
        System.out.println(Singleton.getInstance().hashCode());
    }

    public static void main(String[] args) {
        // There is a chance when both the thread will come at the same time and will create 2 new objects
        // using synchronized to spot entering of multiple threads simultaneously
        ThreadTest thread1 = new ThreadTest(); //multi object threads
        ThreadTest thread2 = new ThreadTest(); //multi object threads
        thread1.start();
        thread2.start();
        Thread thread11 = new Thread(thread1); //single object threads for thread1 object
        Thread thread12 = new Thread(thread1); //single object threads for thread1 object
        thread11.start();
        thread12.start();
    }
}
