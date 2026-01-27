import java.lang.*;
import java.util.*;
class L1P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int p : arr){
			int a = 0;
			for(int i =1;i<=p/2;i++){
				if(p%i==0){
					a++;
				}
			}
			if(a==1&&p!=1){
				System.out.println(p);
			}
		}
	}
}
