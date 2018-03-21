import javax.swing.text.DateFormatter;
import java.io.*;
import java.net.Socket;
import java.nio.Buffer;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;
import java.text.DateFormat;


public class Client {
  //  private Formatter x;
    public static void main (String []args)throws Exception{
        String ip="localhost";
        int port =8888;
        Socket ss=new Socket(ip,port);
      //  Scanner scn=new Scanner(System.in);
        OutputStreamWriter os =new OutputStreamWriter(ss.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        /*Random num=new Random();
        int numm=num.nextInt(10)+5;*/
        String s=new Scanner(System.in).nextLine();
        String id;
        System.out.println("wseq    sseq");
        BufferedReader bf=null;



                while (true)
                {
                    out.println(s);
                 /*   bf= new BufferedReader(new InputStreamReader(ss.getInputStream()));
                    System.out.println("hellow");

                    id=bf.readLine();
                    System.out.println(id);*/


                }



           /* BufferedReader bf= new BufferedReader(new InputStreamReader(ss.getInputStream()));
            String id=bf.readLine();

            Formatter x=new Formatter("Log"+id);*/

           /* BufferedReader rr=new BufferedReader(new InputStreamReader(ss.getInputStream()));
            String message=rr.readLine();
            System.out.println("the server message is: "+ message);*/





    }
}
