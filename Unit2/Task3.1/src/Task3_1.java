
import java.util.Random;
import java.util.Scanner;

public class Task3_1 {

	public static void main(String[] args) {
		int[] a;
		int n = vvodCons("¬ведите размер массива");
		int k = vvodCons("¬ведите K");
		a=initMas(n);
		print(a);
		System.out.println("—умма элементов, кратных K - "+sumElem(a, k));
		
		

	}

	public static int[] initMas(int size) {
		int[] mas = new int[size];
		Random randomGenerator = new Random();		
		for (int i = 0; i < mas.length; i++) {
			mas[i]=randomGenerator.nextInt(100);
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
	
	public static int sumElem(int[] arr,int n){
		int sum=0;
		for (int i=0; i<arr.length;i++){
			if(arr[i]%n==0){
				sum=sum+arr[i];
			}
		}
		return sum;
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

}
