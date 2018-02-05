import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int chetn = 0;
		int sum = 0;
		int sum2 = 0;

		System.out.println("Введите размер масива");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();
		int[] ar = new int[n];

		for (int j = 0; j < ar.length; j++) {
			int y = j + 1;
			System.out.println("Введите число №" + y);
			while (!sc.hasNextInt()) {
				sc.next();
			}
			ar[j] = sc.nextInt();

		}
		for (int j = 0; j < ar.length; j++) {
			if (ar[j] % 2 == 0) {
				chetn++;
			}
			if (ar[j] % 3 == 0) {
				sum = sum + ar[j];
			}

			if (Math.abs(ar[j]) < 3) {
				sum2++;
			}
		}

		System.out.println("Количество четных = " + chetn);
		System.out.println("Сумма кратных 3-м = " + sum);
		System.out.println("Количество чисел, модуль которых <3 = " + sum2);

	}

}
