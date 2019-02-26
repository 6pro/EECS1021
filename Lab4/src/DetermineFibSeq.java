import java.util.Scanner;

public class DetermineFibSeq {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int [] list =new int[20];
		list[0]=1;list[1]=1;
		for(int i = 1;i < 20-1; i++){list[i+1]=list[i]+list[i-1];}
		boolean check = true;
		 while (check == true) {
			 int [] user =new int[20];
			 int count=0;
			 boolean verify = true;
			
			 
			 for(int i=0;i<20;i++) {
				 System.out.println("Enter a positive integer value, or -1 to stop:");
				 int n=scan.nextInt();
				 if(n==-1) {break;
				 
				 }
				 count=i;user[i]=n;
				 
			 }
			 
			 for(int i=0;i<=count;i++) {
				 if(list[i]==user[i]) {verify=true;
				 }
				 else {verify=false; break;
				 }
				 }
			 
			 
			 int size = count+1;
			 System.out.print("The sequence you entered  <");
				for(int i=0;i <= count;i++) {
					
					if (i == count) {System.out.print(user[i]);
					
					}
					else {System.out.print(user[i]+" ,");
					}
					}
				System.out.print(">");
				System.out.println();
				
				
			if(verify==true) {System.out.println("is the first "+size+"  numbers in the Fibonacci sequence.");
			}
			else if(verify==false) {System.out.println("is not the first "+size+" numbers in the Fibonacci sequence.");
			}
			System.out.println("Would you like to continue? (Y/N)");
			 scan.nextLine();
			 String s = scan.nextLine();
			 if (!(s.equals("Y")||s.equals("N"))){
				 
				 while (!(s.equals("Y")||s.equals("N"))) { 
					 System.out.println("Error: "+ s +" is not valid" );
					 System.out.println("Would you like to process another sequence? (Y/N)");
				 s=scan.nextLine();  
				 }
				 
			 }
				 
			 
			 if (s.equals("Y")) {check = true;}
				 else if (s.equals("N")) {check = false;
				 }
				}
				 System.out.println("Bye!");
				 }
	}
