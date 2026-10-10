//import java.io.OutputStreamReader;
import java.io.*;
class test{
    public static void main(String args[]){
        try{
            FileOutputStream ob = new FileOutputStream("stud.dat");
            ob.write(65);
            ob.close();
            System.out.println("Syuccessfully wrote");

        }
        catch(Exception e){
            System.out.println("file wirte failed");

        }
    }
}