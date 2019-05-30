package EX529;


import java.util.Arrays;
import java.util.Scanner;

public class EX5_29_5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int number = 0; 
		int count;
		int[] arr = new int[10]; 
		for (count = 1; count < 11; count++){
			
			 System.out.printf("enter a number %d : ", count);
	            number = input.nextInt();	       
	            arr[count-1] = number;
		}
		System.out.printf("The largest number is: %d\n", getLargestNumber(arr));
	}

	public static int getLargestNumber(int[] arr){
		
		int largest = 0;
		Arrays.sort(arr);
		largest = arr[9];
		return largest;
	}
}
