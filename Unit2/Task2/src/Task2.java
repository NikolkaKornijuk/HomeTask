import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		double[] array;
		int size = vvodCons();
		array = initMas(size);
		System.out.println("Наибольший элемент массива - " + max(array));
		System.out.println("Наименьший элемент массива - " + min(array)
				+ ". Его индекс - " + minIndex(array));
		print(array);
		sort(array);
		print(array);

	}

	public static double[] initMas(int size) {
		double[] mas = new double[size];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.println("Введите элемент массива");
			while (!sc.hasNextDouble()) {
				sc.next();
			}
			mas[i] = sc.nextDouble();
		}
		return mas;
	}

	public static int vvodCons() {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер массива");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		temp = sc.nextInt();

		return temp;
	}

	public static double max(double[] masT) {
		double temp = masT[0];

		for (int i = 0; i < masT.length; i++) {
			if (temp < masT[i]) {
				temp = masT[i];
			}
		}
		return temp;
	}

	public static double min(double[] masT) {
		double temp = masT[0];

		for (int i = 0; i < masT.length; i++) {
			if (temp > masT[i]) {
				temp = masT[i];
			}
		}
		return temp;
	}

	public static int minIndex(double[] masT) {
		double temp = masT[0];
		int index = 0;

		for (int i = 0; i < masT.length; i++) {
			if (temp > masT[i]) {
				index = i;
			}
		}
		return index;
	}

	public static void sort(double[] arr) {
		for (int min = 0; min < arr.length - 1; min++) {
			int least = min;
			for (int j = min + 1; j < arr.length; j++) {
				if (arr[j] < arr[least]) {
					least = j;
				}
			}
			double tmp = arr[min];
			arr[min] = arr[least];
			arr[least] = tmp;
		}

	}

	public static void print(double[] arr){
		System.out.println("--------------------------------");
		for(int i=0; i<arr.length; i++){
			double x=arr[i];
			System.out.print("["+x+"]");
		}
		System.out.println("--------------------------------");
	}
}

