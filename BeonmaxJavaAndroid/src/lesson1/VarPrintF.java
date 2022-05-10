package lesson1;

public class VarPrintF {

	public static void main(String[] args) {

		byte byte_min = -128;
		byte byte_max = 127;

		short short_min = -32768;
		short short_max = 32767;

		int int_min = -2147483648;
		int int_max = 2147483647;

		long long_min = -9223372036854775808l;
		long long_max = 9223372036854775807l;

		System.out.println("byte  1 байт мин.число - макс. число: " + byte_min + " <--> " + byte_max);
		System.out.println("short  2 байта мин.число - макс. число: " + short_min + " <--> " + short_max);
		System.out.println("int  4 байта мин.число - макс. число: " + int_min + " <--> " + int_max);
		System.out.println("long  8 байт мин.число - макс. число: " + long_min + " <--> " + long_max);

		System.out.printf("%-12s%-11s%-25s%-11s%n", "Переменная", "Размер", "Минимальное число",
				"Максимальное число");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%-12s%-11s%-25d%-11d%n", "byte", "1 байт", -128, 127);
		System.out.printf("%-12s%-11s%-25d%-11d%n", "short", "2 байта", -32768, 32767);
		System.out.printf("%-12s%-11s%-25s%-11d%n", "int", "4 байта", -2147483648, 2147483647);
		System.out.printf("%-12s%-11s%-25s%-11d%n", "long", "8 байт", -9223372036854775808l,
				9223372036854775807l);
	}

}
