public class Start {
    public static void main(String[] args) {
        Runnable r = new Myserver();
        Thread serThread = new Thread(r);
        serThread.start();
        System.out.println("Server has started!!");
       /* Runnable sec=new Myserver();
        Thread second=new Thread(sec);
        second.start();
*/
    }
}

