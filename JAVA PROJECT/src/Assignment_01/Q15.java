/*package Assignment_01;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/

/* Q15. Can we create a constructor in an interface ?
  
  No, you cannot have a constructor within an interface in Java.

You can have only public, static, final variables and, public, abstract,
 methods as of Java7.

From Java8 onwards interfaces allow default methods and static methods.

From Java9 onwards interfaces allow private and private static methods.

Moreover, all the methods you define (except above mentioned) in an 
interface should be implemented by another class (overridden). But,
 you cannot override constructors in Java.

Still if you try to define constructors in an interface it
 generates a compile time error.*/  

/*
In the following Java program, we are trying to define a constructor within an interface.*/

/*public interface Q15{
*   public abstract Q15();
   {
      System.out.println("This is the constructor of the interface");
   }*/
  // public static final int num = 10;
  // public abstract void demo();
//}
