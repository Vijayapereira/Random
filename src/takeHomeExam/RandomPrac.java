package takeHomeExam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomPrac {

	public static void main(String[] args) {
		//Generate 500 random numbers and print the nth smallest number in a programming language of your choice. 
		//(Ask user for the Nth smallest number
		
		Scanner ui = new Scanner(System.in);
		System.out.println("Please provide a smallest number!");
		int Nth = ui.nextInt();
		
		int num[] = new int [500];
		 Random rn = new Random();
		 
		 for(int i = 0; i < 500; i++) {
			 num[i] = rn.nextInt(500);
			 System.out.print(num[i]+",");
			 
		 }
		 
		 Arrays.sort(num);
		 System.out.println();
		 
		 for(int i = 0; i< num.length; i++) {
			 System.out.print(num[i]+",");
			 
		 }
		 System.out.println();
		 System.out.print("Nth Smallest number is: " + num[Nth-1]);
		
	}
}
