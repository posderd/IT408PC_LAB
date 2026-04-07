import java.lang.*;
class L7p4 implements Runnable{
	static int i =1;
	public static void main(String[] args) throws Exception{
		L7p4 r = new L7p4();
		Thread t = new Thread(r,"even thread");
		Thread t1 = new Thread(r,"odd thread");
		t.start();
		t1.start();
	}
	@Override
	public void run(){
		String nmae = Thread.currentThread().getName();
		while (i<=20){		
			try{
				if(i%2==0 && nmae.equals("even thread")){
					System.out.println(nmae + " printing " + i++);
				}else if(i%2!=0 && nmae.equals("odd thread")){
					System.out.println(nmae + " printing " + i++);
				}
			}catch(Exception e){}
		}
	}
}                                    
