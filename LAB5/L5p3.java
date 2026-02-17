import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Bullet{
	String str();
	double dbl();
}

 class L5p3{
 	@Bullet(str = "camel", dbl = 12.6644008)
 	public static void anyMethod() throws NoSuchMethodException{
		Method mtd = L5p3.class.getMethod("anyMethod");
		Bullet b = mtd.getAnnotation(Bullet.class);
		System.out.println("String-------------"+b.str());
		System.out.println("Double-------------"+b.dbl());
	}
	
	public static void main(String[] args) throws NoSuchMethodException{
		anyMethod();
	}
}
