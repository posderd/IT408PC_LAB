import java.lang.*; 
import java.util.*; 

class L6p3{ 
	public static void main(String[] args) { 
		PriorityQueue<String> pq = new PriorityQueue<>(); 
		Scanner s = new Scanner(System.in); 
		System.out.println(pq.isEmpty()); 
		System.out.println();
		for (int i = 0; i < 5; i++){ 
			pq.add(s.nextLine()); 
		}
		System.out.println(); 
		System.out.println(pq);
		List<String> list = new ArrayList<>(pq);
		list.remove(3);
		pq.clear();
		pq.addAll(list); 
		List<String> slist = new ArrayList<>();
		while(!pq.isEmpty()){
			slist.add(pq.poll());
		}
		pq.clear(); 
		pq.addAll(slist); 
		System.out.println();
		Iterator<String> iterator = pq.iterator(); 
		while (iterator.hasNext()) { 
			System.out.println(iterator.next()); 
      		}
     		System.out.println();
      		System.out.println(pq.peek() + "  peek");
	} 
}
