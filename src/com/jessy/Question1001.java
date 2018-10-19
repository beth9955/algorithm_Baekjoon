package com.jessy;

import java.util.Scanner;

public class Question1001 {
	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 0;
		Scanner input = new Scanner(System.in);
		
		boolean keepGoing=true;
		while(keepGoing) {
			firstNum = input.nextInt();
			secondNum = input.nextInt();
			if(!(0 < firstNum && secondNum < 10)) {
				continue;
			}
			
			keepGoing=false;
			System.out.println(firstNum-secondNum);
			input.close();
		}
		
		input.close();
	}
}
