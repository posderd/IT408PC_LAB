import java.util.*;
class poo{
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(cheking(input));
		}
	}
    
    public boolean cheking(String s){
        Stack<Character> sss =  new stack<>(); 
       for (char ss : s.toCharArray()) {
            if (ss == '(' || ss == '{' || ss == '[') {
                sss.push(ss);
            } else if (ss == ')' || ss == '}' || ss == ']') {
                if (sss.isEmpty()) {
                    return false;
                }
                char t = sss.pop();
                if (ss == ')' && t != '(') {
                    return false;
                } else if (ss == '}' && t != '{') {
                    return false;
                } else if (ss == ']' && t != '[') {
                    return false;
                }
            }
        }
        return sss.isEmpty();
    }
}
