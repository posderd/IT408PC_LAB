import java.lang.*;
class L7p3 extends Thread{
	public static void main(String[] args) throws Exception{
		L7p3 t = new L7p3();
		t.setName("thread name");
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());
		Thread.sleep(500);
		System.out.println(t.getState());
		t.join();
		System.out.println(t.getState());
	}
	@Override
	public void run(){
		System.out.println(this.getName() + " is running");
		System.out.println(this.getState());
		
		try{
			for(int i = 0; i<=3; i++){
				System.out.println("awaiting step: " + i);
				System.out.println(this.getState());
				this.sleep(500);
			}
		}catch(Exception e){}
	}
}                                    
