package lesson1;

public class LoopMain {

	public static void main(String[] args) {
		int i = 0;
		while (i < 21) {
			System.out.print(i);
			i++;
			if (i == 11)
				break;
		}
		System.out.println();
		int num = 100;
		while (num > 0) {
			if (num % 2 == 0) {
				System.out.print(num);
			}
			num--;
		}
		System.out.println("\nСреднее арифметическое от одного до четырёх");
		int sum = 0;
		int count = 1;
		while (count <= 4) {
			sum += count;
			count++;
		}
		float result = sum / (float) (count - 1);
		System.out.println(result);

		System.out.println("\nЧислиа от 100 до 1000 которые делятся на пять");
		for (i = 100; i <= 1000; i++) {
			if (i % 5 == 0)
				System.out.print(i);
			if (i % 100 == 0)
				System.out.println();
		}

		int o = 4;
		do {
			System.out.print(
					"Цикл который выполняется хотя бы одни раз вне зависимости от условия\n");
			System.out.print(o);
			o++;
		} while (o > 5);
	}

}
