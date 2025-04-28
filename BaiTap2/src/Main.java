//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    EvenThread evenThread = new EvenThread();
    OddThread oddThread = new OddThread();

    oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        evenThread.start();
    }
}