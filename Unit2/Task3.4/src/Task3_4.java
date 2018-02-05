import java.util.Random;
import java.util.Scanner;

public class Task3_4 {

	public static void main(String[] args) {
		int[] posl;	
		int[] array;
		int size = vvodCons("¬ведите размер последовательности");
		posl = initMas(size);
		print(posl);
		array=arrayChetn(posl);
		if((array.length==1)&&(array[0]==0)){
			System.out.println("¬ исходной последовательности нет четных чисел!");
		}
		else {
			print(array);
		}
	}

	public static int[] initMas(int size) {
		int[] mas = new int [size];
		Random randomGenerator = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = randomGenerator.nextInt(100);
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
	
	public static int[] arrayChetn(int[] posl) {
		int j=0;
		for (int i = 0; i < posl.length; i++) {
			if (posl[i] % 2==0) {				
				j++;
			}
		}
		int[] arr = new int[j];
		j=0;
		for (int i = 0; i < posl.length; i++) {
			if (posl[i] % 2==0) {
				arr[j]=posl[i];
				j++;
			}
		}
		if(posl.length==0){
			
			arr[0]=0;
			return arr;
		} else {
			return arr;
			
		}	
		
		
	}

}
