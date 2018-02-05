import java.util.Random;
import java.util.Scanner;

public class Task3_3 {

	public static void main(String[] args) {
		int[] posl;		
		int size = vvodCons("¬ведите размер последовательности");
		posl = initMas(size);
		print(posl);
		vozrArr(posl);
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
	
	public static void vozrArr(int[] posl) {
		int j=0;
		for (int i = 1; i < posl.length; i++) {
			if (posl[i] > posl[i-1]) {
				j++;
			}
		}
		if(j==posl.length){
			System.out.println("ѕоследовательность возрастающа€");
		} else {
			System.out.println("ѕоследовательность не возрастающа€");
		}	
		
	}
}
