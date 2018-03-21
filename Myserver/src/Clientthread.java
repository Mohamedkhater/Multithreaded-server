import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Clientthread implements Runnable{
   public Socket s= null;
 //  public static int oval;
   public int port;
   public int ID;
    public Clientthread (){

    }
    public Clientthread(ServerSocket serSoc,int ID ,int port,int shared){

        try {
            this.ID=ID;
            this.port=port;
            s = serSoc.accept();
            Myserver.sharedVal=shared;
        } catch (IOException e) {
            System.out.println("client disconnected.");
        }


    }
    @Override
    public void run(){









       // String str= null;
        System.out.println("Writers:");


        System.out.println("sSeq   Oval   wID");



        String value= null;
       /* try {
            value = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
       while (true){
           try {
               BufferedReader br= null;
               InputStreamReader ir=new InputStreamReader(s.getInputStream());
               br=new BufferedReader(ir);
               value=br.readLine();
               Myserver.sharedVal=Integer.valueOf(value);
               System.out.println("   "+Myserver.sSeq+"   "+Myserver.sharedVal+"      "+this.ID);
               OutputStreamWriter ow=new OutputStreamWriter(s.getOutputStream());
               PrintWriter pwp= new PrintWriter(ow);
               pwp.println(String.valueOf(this.ID));
               pwp.flush();
           } catch (IOException e) {
               e.printStackTrace();
           }











           Myserver.sSeq++;


           //  System.out.println("   "+Myserver.sSeq+"      "+Myserver.sharedVal+"   "+ID);

           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }



       }





    }

}

