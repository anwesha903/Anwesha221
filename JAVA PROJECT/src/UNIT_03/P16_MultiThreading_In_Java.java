package UNIT_03;

public class P16_MultiThreading_In_Java {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub  
		
		/*Main thread will execute C1.show method
		 * and the C2.show method in sequence!
		 */
		
	//	C1 obj1 = new C1();
	//	obj1.show();
		
	//	int a = sc.nextInt();
	//	System.out.println("\n");
		
	//	C2 obj2 = new C2();
	//	obj2.show2(); 
		
		Thread t1 = new Thread(new T1(),"T1");
		Thread t2 = new Thread(new T2(),"T2");
		
		t1.start();
		t2.start(); 
		
	    }
	   
    }
		
     class C1 {
    	 void show1() {
    		 
    		 for (int i = 0; i<10; i++) {
    			 System.out.println(i + "- Hey_1!");
    		 }
    	 }
     } 
     
     class C2 {
    	 void show2() {
    		 for(int i = 0; i<10; i++) { 
    			 System.out.println(i + "- Hey_2!");
    			 
    		 }
    	 }
     } 
     class  T1 extends Thread {
    	 @Override 
    	 public void run() {
    		  try {
    			  Thread.sleep(50000);
    			  System.out.println("T1 is Done by Now");
    		  } catch (InterruptedException e) {
    			  e.printStackTrace();
    		  }
    	 }
     } 
     
     //class T1 implements Runnable {
     // @Override
    // public void run() {
    //	 for (int i = 0; i < 10; i++) {
    	//	 System.out.println(i + "- Hey_1!"); 
    //	 }
   //  }

	//} 
     
     class T2 implements Runnable {
    	 
    	 @Override 
    	 public void run() {
    		 for (int i = 0; i<10; i++) {
    			 System.out.println(i + "- Hey_2!");
    		 }
    	 }
    	 
     }

         
     
