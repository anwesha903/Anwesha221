package UNIT_03;

/* error kabhi catch nahi hoti hai
  sirf exception hoti hai 
  throw - code 
  throws - function 
  */

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		try {
			//sensitive code
			int b = 0;
			int a = 100/b;
			System.out.println(a);
			}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} 
		 catch (Exception e) {
			 System.out.println(e.getMessage()); 
		 }
		
		System.out.println("Done");
		}	
	
        
	}
