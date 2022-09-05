import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client{
    public static void main(String[]args){
        try{
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            dout.writeUTF(str);
            dout.flush();
            dout.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}