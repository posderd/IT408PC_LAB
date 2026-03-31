import java.lang.*;
import java.util.*;

class L6p1{
	public static void main(String[] args){
		ArrayDeque<String> ad = new ArrayDeque<>();
		Scanner s = new Scanner(System.in);
		System.out.println(ad.isEmpty());
		for(int i  = 0;i<5;i++){
			ad.add(s.nextLine());
		}
		System.out.println();
		int j = 0;
		List<String> list = new LinkedList<>(ad);
		list.remove(3);		
		Collections.sort(list);
		ad.clear();
		ad.addAll(list); 
		Iterator<String> iterator = ad.iterator(); 
        		while(iterator.hasNext()){ 
        			System.out.println(iterator.next());
        		}
        		System.out.println(ad.peek() + " peek");
	}
}
