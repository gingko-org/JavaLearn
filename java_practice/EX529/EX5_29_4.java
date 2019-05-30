package EX529;

import java.util.Scanner;

public class EX5_29_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x,y;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		for(int i=1; i<4; i++){
            System.out.printf("Employee %d weekly hours: ", i);
            x = input.nextDouble();

            System.out.printf("Employee %d hourly pay: ", i);
            y = input.nextDouble();

            System.out.printf("Employee %d all pay: %.2f\n", i, salary(x,y));
        }
	}
	
	public static double salary(double hours,double pay){
		
		final double BASE_HOURS = 40.0;
		final double RATE = 1.5;
		
		return hours > 40 ?(pay * BASE_HOURS) + ((pay * RATE) * (hours - BASE_HOURS)) : hours * pay;
	}

}
