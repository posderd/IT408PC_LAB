import java.lang.Exception;
import java.util.Scanner;

class AgeException extends Exception{
	public AgeException(String msg){
		super(msg);
	}
}

class L5p1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		try{
			int age =  s.nextInt();
			if( age< 18){
				throw new AgeException("sorry you are minor");
			}else{
				System.out.println("Please vote");
			}
		}catch(AgeException ae){
			System.out.println(ae.getMessage());
		}
	}
}
