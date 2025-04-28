public class OddThread extends Thread{
    public void run(){
        System.out.println("OddThread started");
        try{
            for(int i=1;i<=10;i++){
                if(i%2!=0){
                    System.out.println(i);
                }
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
