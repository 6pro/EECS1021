import java.util.Scanner;

public class GenerateFibSeq {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String Choice = "Y";
		
		
		while (Choice.equals("Y")) {//1while open
        System.out.println("Enter the size of Fibonacci Sequence: ");
        int size = input.nextInt();
	    input.nextLine();
	    int[]fibo = new int[size];
	    
	    
	    if(size <=0 ) {
	    	System.out.println("Error:  Fibonacci Sequence must have size >= 1.");
	    	System.out.println("Would you like to continue? (Y/N) "); 
	        input.nextLine();
	    }
	    	
	    else if(size == 1) {
	    	fibo[0]=1;
	    	System.out.println("Fibonacci Sequence of size: " );
	    	System.out.println("<1>");
	    	
	    }
	    
	    
	    else if(size == 2) {
	    	fibo[0]=1;
	    	fibo[1]=1;
	    	System.out.println("Fibonacci Sequence of size: " + size  );
	    	System.out.println("<1 ,1>");
	    }
	    
	    
	    
	    else {
	    	fibo[0]=1;
	    	fibo[1]=1;
	    	
	    	for(int i = 2; i< fibo.length; i++) {
	    	fibo[i] = fibo[i-2]+fibo[i-1];
	    	}
	             System.out.print("<");
	        for(int i = 0; i< fibo.length; i++) {
	        	 System.out.print(fibo[i] + ",");
	           }
	    
	             System.out.print(fibo[fibo.length - 1]);
       	         System.out.print(">");
	    
	    
	    }
	    System.out.println("Would you like to continue? (Y/N)");
	    Choice = input.nextLine();
	    
	    		}
		
		
		
		
		
		
		
		
		 
		input.close();	
	}

}
