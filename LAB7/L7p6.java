import java.lang.*;
class L7p6 implements Runnable{
	static int bal =500;
	public static void deposit(int r){
		System.out.println("deposit amount : " + r);
		bal+=r;
		System.out.println("after deposit amount : " + bal);

	}
	public static void withdrawl(int r){
		System.out.println("withdrawl amount : " + r);
		bal+=r;
		System.out.println("after withdrawl amount : " + bal);

	}
	Object lock = new Object();
	public static void main(String[] args) throws Exception{
		L7p6 r = new L7p6();
		Thread t = new Thread(r,"deposit");
		Thread t1 = new Thread(r,"withdrawl");
		System.out.println("initial" + bal);
		t.start();
		t1.start();

	}
	@Override
	public void run(){
		String nmae = Thread.currentThread().getName();
			try{
				if(nmae.equals("deposit")){
					deposit(500);
					lock.wait();
				}else if(nmae.equals("withdrawl")){
					withdrawl(300);
				}
			}catch(Exception e){}

	}
}                                    
