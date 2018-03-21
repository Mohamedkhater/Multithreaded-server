import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientReaderThread implements Runnable {
    public int port;
    public int ID;

    Socket s=null;
    public ClientReaderThread(int port,ServerSocket sersoc,int ID,int val){                    //val: value in shared object
        this.port=port;
        this.ID=ID;
        Myserver.sharedVal=val;
       // this.shared=sharedVal;
        try {
             s=sersoc.accept();
        } catch (IOException e) {
            System.out.println("socket is bad :(");
        }
    }

    @Override
    public void run() {


       // OutputStreamWriter os = null;

       // while (true){
        System.out.println("Readers:");
        System.out.println("sSeq   Oval   rID   rNum");
        System.out.println("   "+Myserver.sSeq+"   "+Myserver.sharedVal+"      "+this.ID);

        try {
              OutputStreamWriter  os = new OutputStreamWriter(s.getOutputStream());
                PrintWriter pw= new PrintWriter(os);
                pw.println(Myserver.sharedVal);
                pw.flush();
                os.flush();
                //System.out.println("read here");
            } catch (IOException e) {
                System.out.println("7777");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

       // }



    }
}
