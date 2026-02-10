import java.lang.*; 
import java.util.*; 

class L4p1 {  
    public static void main(String[] args) {   
        Scanner s = new Scanner(System.in);   
        try {    
            int a = s.nextInt();    
            int b = s.nextInt();    
            System.out.println(a / b);   
        } catch(InputMismatchException ime) {    
            System.out.println(ime.getMessage());   
        } catch(ArithmeticException ame) {    
            System.out.println(ame.getMessage());   
        } finally {    
            System.out.println("Exception Handled");   
            s.close();
        }  
    } 
}
