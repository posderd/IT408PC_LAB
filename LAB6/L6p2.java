import java.lang.*;
import java.util.*;

class L6p2{
	public static void main(String[] args){
		Set<String> set = new HashSet<>();
		Scanner s = new Scanner(System.in);
		System.out.println(set.isEmpty());
		for(int i  = 0;i<5;i++){
			set.add(s.nextLine());
		}
		System.out.println();
		System.out.println(set);
		List<String> list = new LinkedList<>(set);
		list.remove(3);		
		Collections.sort(list);
		set.clear();
		set.addAll(list);
		Iterator<String> iterator = set.iterator(); 
        		while(iterator.hasNext()){ 
        			System.out.println(iterator.next());
        		}
	}
}
