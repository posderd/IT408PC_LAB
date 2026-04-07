import java.lang.*;
class L7p2 extends Thread{
	public static void main(String[] args){
		L7p2 t = new L7p2();
		t.start();
	}
	public void run(){
		System.out.println("thread name");
	}
}                                    
