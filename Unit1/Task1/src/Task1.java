import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int k1, k2;

		k1 = vvodZhach("катита №1");
		k2 = vvodZhach("катита №2");

		System.out.println("Гипотенуза = " + gipotenuza(k1, k2));
		System.out.println("Площадь = " + ploshad(k1, k2));

	}

	public static int vvodZhach(String f) {
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		System.out.println("Введите значение " + f);
		while (!sc.hasNextInt()) { 
			sc.next();
		}
		temp = sc.nextInt();
		return temp;
	}

	public static double gipotenuza(int k1, int k2) {
		double gipot;
		gipot = Math.pow((k1 * k1 + k2 * k2), -2);
		return gipot;
	}

	public static double ploshad(int k1, int k2) {
		double plosh;
		plosh = (k1 * k2) / 2;
		return plosh;
	}

}
