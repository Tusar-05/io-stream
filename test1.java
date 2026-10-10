//a program to read the content of a file 
import java.io.*;
public class test1{
    public static void main(String args[]){
        try{
            FileInputStream ob = new FileInputStream("stud2.dat");
            int i = ob.read();
            
            System.out.println("the file data is "+i);
            ob.close();
            System.out.println("data wrote");


        }
        catch(Exception e){
            System.out.println("file not found");
        }
    }
}