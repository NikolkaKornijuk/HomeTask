import java.util.Random;
import java.util.Scanner;

public class Task3_2 {

	public static void main(String[] args) {
		int[] posl;
		int[] masNull;
		int size = vvodCons("¬ведите размер последовательности");
		posl = initMas(size);
		print(posl);
		masNull = masNull(posl);
		print(masNull);

	}

	public static int[] initMas(int size) {
		int[] mas = new int[size];
		Random randomGenerator = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = randomGenerator.nextInt(10);
		}
		return mas;
	}

	public static int vvodCons(String msg) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		temp = sc.nextInt();

		return temp;
	}

	public static void print(int[] arr){
		System.out.println("--------------------------------");
		for(int i=0; i<arr.length; i++){
			int x=arr[i];
			System.out.print("["+x+"]");
		}
		System.out.println("");
		System.out.println("--------------------------------");
	}

	public static int[] masNull(int[] posl) {
		int j = 0;
		for (int i = 0; i < posl.length; i++) {
			if (posl[i] == 0) {				
				j++;
			}
		}
				
		int[] temp=new int[j];
		j=0;
		for (int i = 0; i < posl.length; i++) {
			if (posl[i] == 0) {
				temp[j] = i;
				j++;
			}
		}
		return temp;
	}

}
