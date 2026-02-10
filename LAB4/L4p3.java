import java.util.*;
import java.lang.*;
import java.io.*;

class L4p3 extends Exception{

	public static void getValue(int a){
		if(a%2!=0){
			throw new ArithmeticException("odd number");
		}else{
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			getValue(x);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
} 
