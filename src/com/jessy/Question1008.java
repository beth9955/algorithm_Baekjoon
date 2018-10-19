package com.jessy;

import java.util.Scanner;

public class Question1008 {
	public static void main(String[] args) {
		double firstNum = 0;
		double secondNum = 0;
		Scanner input = new Scanner(System.in);
		
		boolean keepGoing=true;
		while(keepGoing) {
			firstNum = input.nextDouble();
			secondNum = input.nextDouble();
			if(!(0 < firstNum && secondNum < 10)) {
				continue;
			}
			
			keepGoing=false;
			double result = firstNum/secondNum;
			System.out.printf( "%.18f\n",result);
			input.close();
		}
	
		input.close();
	}
}
