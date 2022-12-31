// Java program that illustrate the creation of threats by using runnable classes
package threadCreation;

class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from a thread!");
    }
}

public class threadCreation {
    public static void main(String[] args) {
        Thread thread = new Thread(new HelloRunnable());
        thread.start();
    }
}
