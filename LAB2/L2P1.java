import java.lang.*;
import java.util.*;
class L2P1{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		loop:
			for(int i =1;1<=a;i++){
				int p = 0;
				for(int j= 1;j<11;j++){
					System.out.println( i+ "*"+j+ "= "+ i*j);
					if(j==10){
					System.out.println("enter 0 to end and 1 to continue");
					p = sc.nextInt();
					if(p==0){
					break loop;}
					else{
					continue;}
					}
					}
				}
		}
}

