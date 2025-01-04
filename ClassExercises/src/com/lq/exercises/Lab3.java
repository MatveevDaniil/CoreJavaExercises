/**
 * 
 */
package com.lq.exercises;

/**
 * @author developer
 *
 */
public class Lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Exercise 1
		System.out.println("Exercise 1");
		String[] daysOfWeek = {
				"Sunday",
				"Monday",
				"Tuesday",
				"Wednesday",
				"Thursday",
				"Friday",
				"Saturday"
		};
		
		for (int i = 0; i < 7; i++)
			System.out.println(daysOfWeek[i]);
		
		for (String day : daysOfWeek)
			System.out.println(day);
		
		for (int i = 1; i <= 7; i++) {
			int weekLength = daysOfWeek.length;
			System.out.println(daysOfWeek[weekLength - i]);
		}
		System.out.println("==============================");
		
		// Exercise 2
		System.out.println("Exercise 2");
		int i = 1;
		while (i <= 20) {
			if (i % 2 == 1) {
				i += 1;
				continue;
			}
			System.out.println(i);
			i += 1;
		}
		System.out.println("==============================");
		
		// Exercise 3
		System.out.println("Exercise 3");
		for (i = 0; i < 100; i++) {
			if (50 <= i && i <= 60)
				continue;
			System.out.print(i + " ");
		}
		System.out.println("==============================");
		
		// Exercise 4
		System.out.println("Exercise 4");
		i = 0;
		while (i < 12) {
			switch (i) {
			case 0:
			case 2:
			case 4:
			case 6:
			case 7:
			case 9:
			case 11:
				System.out.println(31);
				break;
			case 1:
				System.out.println(28);
				break;
			case 3:
			case 5:
			case 8:
			case 10:
				System.out.println(30);
				break;
			default:
				throw new IllegalArgumentException("month should be an int from 1 to 12");
			}
			i += 1;
		}
		System.out.println("==============================");
		
		// Exercise 5
		System.out.println("Exercise 5");
		for (String weekDay : daysOfWeek) {
			System.out.print(weekDay.substring(0, 3) + ' ');
		}
		System.out.println();
		for (i = 0; i < 20; i++) 
			System.out.print(' ');
		int weekDayIdx = 5;
		for (i = 1; i <= 31; i ++) {
			System.out.print(i);
			if (i < 10)
				System.out.print("   ");
			else
				System.out.print("  ");
			if (weekDayIdx == 6)
				System.out.println();
			weekDayIdx = (weekDayIdx + 1) % 7;
		}
		System.out.println();
		System.out.println("==============================");
	}

}
