import java.lang.*; 
import java.util.*; 
import java.io.*;
class L4p2 {  
    public static void main(String[] args) throws IOException{   
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader s = new BufferedReader(isr);   
        try {    
            int a = Integer.parseInt(s.readLine());    
            int b = Integer.parseInt(s.readLine());   
            System.out.println(a / b);   
        } 
        catch(Exception e) {    
            System.out.println(e.getMessage());   
        }
        finally {    
            System.out.println("Exception Handled");   
        }  
    } 
}
