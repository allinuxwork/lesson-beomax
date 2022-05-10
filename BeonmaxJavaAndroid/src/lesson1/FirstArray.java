package lesson1;

import java.util.Iterator;

public class FirstArray {

	public static void main(String[] args) {
		int[] daysInMonth = new int[12];
		daysInMonth[0] = 31;
		daysInMonth[1] = 28;
		daysInMonth[2] = 31;
		daysInMonth[3] = 30;
		daysInMonth[4] = 31;
		daysInMonth[5] = 30;
		daysInMonth[6] = 31;
		daysInMonth[7] = 31;
		daysInMonth[8] = 30;
		daysInMonth[9] = 31;
		daysInMonth[10] = 30;
		daysInMonth[11] = 31;

		int march = daysInMonth[2];
		System.out.println("Месяц март " + march);

		for (int i = 0; i < daysInMonth.length; i++) {
			System.out.print(daysInMonth[i] + " ");
		}

		System.out.println("\n-----------------------------");
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i * 10;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}

		System.out.println("\nЦикл for each\n");
		for (int i : nums) {
			System.out.print(i);
		}

		System.out.println("\n-------------------------");
		System.out.println("Массив пустых символов\n");
		char[] chars = new char[12];
		for (char ch : chars) {
			System.out.print(ch);
		}

		System.out.println("\n---------------------");
		System.out.println("Заполнение обратного массива с помощью for each\n");
		int[] first = new int[900];
		for(int i=0; i<first.length; i++) {
			first[i] = i+100;
		}
		int[] second = new int[first.length];
		for(int i=0, j=first.length-1; i<first.length; i++, j--) {
			second[j] = first[i];
		}
		for(int i : second) {
			System.out.print(i+" ");
		}
	}

}
