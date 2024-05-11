public class MultiThreadStudy extends Thread {

    private static int x = 0;

    public static void main(String[] args) {
            new Thread(run1).start();
            //new Thread(run2).start();
    }

    private static Runnable run1 =new Runnable(){
        public void run(){
            while (x<100) {
                   try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: " + ++x);};
            }
        };
    @SuppressWarnings("unused")
    private static Runnable run2  = new Runnable(){
        public void run(){
            System.out.println("Thread 2: " + x++);
        };
    };

}