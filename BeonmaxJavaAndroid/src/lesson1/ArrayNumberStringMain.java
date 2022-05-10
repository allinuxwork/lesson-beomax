package lesson1;

public class ArrayNumberStringMain {
	public static void main(String[] args) {
		int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i : daysOfMonth)
			System.out.print(i + " ");

		System.out.println("\n----------------------");
		String name = "Иван";
		int age = 33;
		String result = "Привет, \"" + name + "\"!\nТебе " + age + " года.";
		System.out.println(result);

		String[] daysOfMonthStr = {"январь", "ферваль", "март", "апрель", "май", "июнь", "июль",
				"август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
		String resultStr ="";
		for(int i=0; i<daysOfMonthStr.length; i++) {
			resultStr += daysOfMonthStr[i];
			if(i==daysOfMonth.length-1) {
				resultStr +=".";
			} else {
				resultStr +=", ";
			}
		}
		System.out.println(resultStr);	
	}
}
