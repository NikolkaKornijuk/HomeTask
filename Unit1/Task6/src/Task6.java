import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int sum = 0;
		
		System.out.println("Введите размер масива");
		while (!sc.hasNextInt()) { // ввод размера массива
			sc.next();
		}
		n=sc.nextInt();
		double[] ar = new double[n];
		
		for(int j=0;j<ar.length; j++){ // заполнение массива
			int y = j + 1;
			System.out.println("Введите число №" + y);
			while (!sc.hasNextInt()){
				sc.next();
			}
			ar[j]=sc.nextInt();
															
		}
		for(int j=0;j<ar.length; j++){  //выполнение вычислений с элементами массива			
			if((ar[j]%2==0)&&(ar[j]<15)){
				sum++;
			}
			
		}
		System.out.println("Ответ - "+sum);

	}

}
