public class NumberGenerator implements Runnable {



    @Override
    public void run() {
        try{
            for(int i=1;i<=10;i++){
                System.out.println("Number" +i+ ", generator hashcode: "+this.hashCode()+", priority: "+Thread.currentThread().getPriority());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
