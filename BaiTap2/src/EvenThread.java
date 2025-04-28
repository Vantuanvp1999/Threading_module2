public class EvenThread extends Thread {
    public void run() {
        System.out.println("EvenThread started");
        try{
            for(int i=1;i<=10;i++){
                if(i%2==0){
                    System.out.println(i);
                }
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
