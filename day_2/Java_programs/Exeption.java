import java.io.FileNotFoundException;
import java.io.IOException;


public class Exeption {
    public static void method() throws IOException{
        throw new FileNotFoundException("File Kaha hai.");
    }
    public static void main(String[] args){
        try{
            //String s = null;
            // System.out.println(s.length());

            //int d = 100/0 + s.length();

            //throw new IOException("device problem.");

            method();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.err.println("boom");
        }
        
    }
}
