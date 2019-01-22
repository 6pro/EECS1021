import java.util.Scanner;

public class ComputerTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		System.out.println(name+", enter your filing status (1 - Single Filing; 2 - Married Filing):");
		String filingStatus = input.nextLine();
		
		
		if(filingStatus.equals("1")) {
			System.out.println(name+", enter your taxable income:");
			int taxableIncome = input.nextInt();
			
			if(taxableIncome>=0 && 8350>=taxableIncome) {
				double Part1= (taxableIncome-0)*0.1;
				System.out.println(name+", you should pay $"+Part1);
				System.out.println("Calculation is based on the scheme of Single Filing:");
				System.out.println("Part I $: "+Part1);
			}
				else if(taxableIncome>=8351 && 33950>=taxableIncome) {
					double Part1= (8350-0)*0.1;
					double Part2= (taxableIncome-8350)*0.15;
					System.out.println(name+", you should pay $"+(Part1+Part2));
					System.out.println("Calculation is based on the scheme of Single Filing:");
					System.out.println("Part I $: "+Part1);
					System.out.println("Part II $: "+Part2);
			}
				else if(taxableIncome>=33950){
					double Part1= (8350-0)*0.1;
					double Part2= (33950-8350)*0.15;
					double Part3= (taxableIncome-33950)*0.25;
					System.out.println(name+", you should pay $"+(Part1+Part2+Part3));
					System.out.println("Calculation is based on the scheme of Single Filing:");
					System.out.println("Part I $: "+Part1);
					System.out.println("Part II $: "+Part2);
					System.out.println("Part III $: "+Part3);
				}
			}
		else if(filingStatus.equals("2")) {
			System.out.println(name+", enter your taxable income:");
			int taxableIncome = input.nextInt();
			
			if(taxableIncome>=0 && 16700>=taxableIncome) {
				double Part1= (taxableIncome-0)*0.1;
				System.out.println(name+", you should pay $"+ Part1);
				System.out.println(" calculation is based on the scheme of married Filing:");
				System.out.println(" part I $: "+ Part1);
			}
				else if(taxableIncome>=16701 && 67900>=taxableIncome) {
					double Part1= (16700-0)*0.1;
					double Part2= (taxableIncome-16700)*0.15;
					System.out.println(name+", you should pay $"+( Part1 + Part2 ));
					System.out.println(" palculation is based on the scheme of married Filing:");
					System.out.println(" part I $: "+ Part1);
					System.out.println(" part II $: "+ Part2);
			}
				else if(taxableIncome>=16700) {
					double Part1= (16700-0)*0.1;
					double Part2= (67900-16700)*0.15;
					double Part3= (taxableIncome-67900)*0.25;
					System.out.println(name+",you should pay $"+( Part1 + Part2 + Part3 ));
					System.out.println(" calculation is based on the scheme of married Filing:");
					System.out.println(" part I $: "+ Part1);
					System.out.println(" part II $: "+ Part2);
					System.out.println(" part III $: "+ Part3);
				}
			}
		else {
			System.out.println("Illegal status: "+filingStatus);
		}
		
		input.close();

	}

}