package com.jessy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Question11718 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		 while(input.hasNextLine()) {
			 String text =input.nextLine();
			 if(text==null || text.length()==0 || text.length()>100) {
				 continue;
			 }

			 System.out.println(text);

		 }

	}
}
