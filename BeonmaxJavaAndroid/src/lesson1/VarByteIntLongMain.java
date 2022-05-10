package lesson1;

public class VarByteIntLongMain {

	public static void main(String[] args) {

		int days = 1000;
		int speed = 300000;
		long seconds = days * 24 * 60 * 60;
		long distance = speed * seconds;
		byte a = -128;
		byte b = a;
		b -= 1;
		int c1 = 15;
		byte c2 = (byte) c1;
		System.out.println(distance);
		System.out.println(a + "<->" + b
				+ " при привышение или принижение диапазона переменая идет по следующиму второму кругу");
		System.out.println("если long distance a speed и seconds int  - выражение будет int "
				+ distance);
		System.out.println("если long distance a speed или seconds long  - выражение будет long "
				+ distance);
		System.out.println(
				"(byte)c1 - от большого к меньшему только ручное приведение типов - на оборот автоматически -"
						+ "если большей тип пременной указан");

	}

}
