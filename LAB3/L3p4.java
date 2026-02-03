import java.lang.*;

class Animal{
	void makeSound(){
		System.out.println("Animal");
	}
}
class Cat extends Animal{
	@Override
	void makeSound(){
	super.makeSound();
	System.out.println(": meow");
	}
}
class Dog extends Animal{
	@Override
	void makeSound(){
	super.makeSound();
	System.out.println(": bark");
	}
}
class L3p4{
	public static void main(String[] args){
		Cat q = new Cat();
		q.makeSound();
		Dog w = new Dog();
		w.makeSound();
	}
}
