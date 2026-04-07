import java.lang.*;
class L7p1 extends Thread{
	L7p1(String str){
		super(str);
	}
	public static void main(String[] args){
		L7p1 t = new L7p1("thread name");
		System.out.println(t.getName());
	}
}
