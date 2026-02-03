import java.lang.*;

abstract class L3p6{
	abstract void makeSound();
}
public abstract class L3p7 extends L3p6{
	public abstract void behave();
}
class L3p8 extends L3p7{
	@Override
	public void makeSound(){
	System.out.println("tiger sound");
	}
	@Override
	public void behave(){
	System.out.println("tiger behaviour");
	}
}

class L3p9{
	public static void main(String[] args){
		L3p8 w = new L3p8();
		w.behave();
		w.makeSound();
	}
}
