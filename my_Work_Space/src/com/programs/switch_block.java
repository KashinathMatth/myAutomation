package com.programs;

import javax.annotation.processing.SupportedSourceVersion;

public class switch_block {

	public static void main(String[] args) {
		int day=1;
		switch (day)
		{
		case 1:
			System.out.println("monday");
			break;

		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednsady");
			break;
		case 4:
			System.out.println("Thursday");
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		default:
			System.out.println("Sunday");

		}

	}

}
