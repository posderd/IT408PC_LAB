import java.lang.*;

abstract class Animal{
	abstract void makeSound();
}
class Lion extends Animal{
	@Override
	public void makeSound(){
	System.out.println("lion sound");
	}
}
class Tiger extends Animal{
	@Override
	public void makeSound(){
	System.out.println("tiger sound");
	}
}
class L3p5{
	public static void main(String[] args){
		Lion q = new Lion();
		q.makeSound();
		Tiger w = new Tiger();
		w.makeSound();
	}
}
