/*package Assignment_01;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/

/* Q20. What happens if we add final keyword with a class,
  method and a variable in java. explain it through a suitable code. 
 
 
 Java final keyword is a non-access specifier that is used to
  restrict a class, variable, and method. If we initialize a 
  variable with the final keyword, then we cannot modify its value.

If we declare a method as final, then it cannot be overridden by any subclasses. And, if we declare a class as final, we restrict the other classes to inherit or extend it.

In other words, the final classes can not be inherited by other classes. 

EXAMPLE

class Bike9{  
 final int speedlimit=90;//final variable  
 void run(){  
  speedlimit=400;  
 }  
 public static void main(String args[]){  
 Bike9 obj=new  Bike9();  
 obj.run();  
 }  
}*/