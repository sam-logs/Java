package interestCalculator;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
		double PAmount, ROI, TimePeriod, simpleInterset, age, choice, compoundInterest;
		String gender;
		
		System.out.print(" Please Enter the Principal Amount : ");
		PAmount = sc.nextDouble();
		
		System.out.print(" Please Enter the Rate Of Interest : ");
		ROI = sc.nextDouble();
		
		System.out.print(" Please Enter the Time Period in Years : ");
		TimePeriod = sc.nextDouble();
		
		System.out.print(" Please Enter the choice \n1.simpleInterset \n2.CompoundInterest : ");
		choice = sc.nextDouble();
		
		System.out.println("Enter Gender : ");
		gender = sc.next();
		
		System.out.println("Enter Age :");
		age = sc.nextDouble();

		if (choice == 1){
		if(age > 60) {
			simpleInterset = (PAmount * ROI+1 * TimePeriod) / 100;
			System.out.println("The intrest Incurred is: "+simpleInterset);
			System.out.println("The Total Amount is: "+(PAmount+simpleInterset));
		}else if(TimePeriod == 1) {
			simpleInterset = (PAmount * ROI * TimePeriod) / 100;
			System.out.println("The intrest Incurred is: "+simpleInterset);
			System.out.println("The Total Amount is: "+(PAmount+simpleInterset));
		}else if(TimePeriod > 1 && TimePeriod <= 3) {
			simpleInterset = (PAmount * ROI+0.5 * TimePeriod) / 100;
			System.out.println("The intrest Incurred is: "+simpleInterset);
			System.out.println("The Total Amount is: "+(PAmount+simpleInterset));
		}else if(TimePeriod > 3 && TimePeriod <= 5) {
			simpleInterset = (PAmount * ROI+1 * TimePeriod) / 100;
			System.out.println("The intrest Incurred is: "+simpleInterset);
			System.out.println("The Total Amount is: "+(PAmount+simpleInterset));
		}else if(TimePeriod > 5) {
			simpleInterset = (PAmount * ROI+1.5 * TimePeriod) / 100;
			System.out.println("The intrest Incurred is: "+simpleInterset);
			System.out.println("The Total Amount is: "+(PAmount+simpleInterset));
		}else if(gender == "female") {
			simpleInterset = (PAmount * ROI+0.5 * TimePeriod) / 100;
			System.out.println("The intrest Incurred is: "+simpleInterset);
			System.out.println("The Total Amount is: "+(PAmount+simpleInterset));
		}else {
			simpleInterset = (PAmount * ROI * TimePeriod) / 100;
			System.out.println("The intrest Incurred is: "+simpleInterset);
			System.out.println("The Total Amount is: "+(PAmount+simpleInterset));
		}
		}else {
		
		 compoundInterest = PAmount *
                (Math.pow((1 + ROI / 100), TimePeriod));
      
         System.out.println("Compound Interest is: "+ compoundInterest);
	}
	}

}

