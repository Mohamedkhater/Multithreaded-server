import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Myserver implements Runnable {
    public static int sharedVal=-1;
    public static int sSeq=1;




    @Override
    public void run() {
        //String ip="localhost";
      //  Scanner scn=new Scanner(System.in);

        int port=8888;
        int i=1;
        int j=1;


        ServerSocket serSoc= null;
        //ServerSocket serSoc2= null;

        try {
            serSoc = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
       /* try {
            serSoc2 = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
            Clientthread cl= new Clientthread(serSoc,i,port,sharedVal);

       // System.out.println("the shared object is :"+sharedVal);




            Thread clientThreadw=new Thread(cl);
            clientThreadw.start();

       // System.out.println();
        //sharedVal=new Clientthread().oval;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        ClientReaderThread clr=new ClientReaderThread(port,serSoc,j,sharedVal);


        Thread clientTheadr=new Thread(clr);
            clientTheadr.start();
        //sharedVal=Clientthread.oval;











           // String nickname=scn.nextLine();

        /*    OutputStreamWriter os = null;
            try {
                os = new OutputStreamWriter(s.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
            PrintWriter out= new PrintWriter(os);
            out.println(nickname);
            try {
                os.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }*/
           // System.out.println("Data sent to the client is:"+ nickname  );



    }
}
