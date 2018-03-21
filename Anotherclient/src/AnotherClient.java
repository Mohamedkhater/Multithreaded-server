import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

public class AnotherClient {


    public static void main(String[] args) throws Exception {
        String ip = "localhost";
        int port = 8888;
        Socket ss = new Socket(ip, port);
        //OutputStreamWriter os = new OutputStreamWriter(ss.getOutputStream());
        //PrintWriter out = new PrintWriter(os);
      //  Scanner scn = new Scanner(System.in);
           /* Random num=new Random();
            int numm=num.nextInt(2);*/
        // String s=String.valueOf(numm);
       // String s=null;
        //s=new Scanner(System.in).nextLine();

          /*  String s = scn.nextLine();
            if (s=="q"){
                break;
            }*/

          Formatter x= new Formatter("log");

        InputStreamReader is=new InputStreamReader(ss.getInputStream());
        System.out.println("rseq    sseq    oval");


           while (true){
                BufferedReader rr=new BufferedReader(is);
                String message=rr.readLine();
                int num=Integer.valueOf(message);
                System.out.println("               "+num);




            }














              //  System.out.println("the server message is: "+ message);

        //}
        //  os.flush();
        // os.close();




}

}
