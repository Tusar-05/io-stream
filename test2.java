//write a program to write your full name into a file called stud1.dat
import java.io.*;
public class test2{
    public static void main(String args[]){
        try{
            FileOutputStream ob = new FileOutputStream("stud1.dat");
            String s="this is the first writing tech";
            byte b[] = s.getBytes();
            ob.write(b);
            ob.close();
            System.out.println("successfully wrote");


        }
        catch(Exception e){
            System.out.println("unable to write");
        }
    }
}