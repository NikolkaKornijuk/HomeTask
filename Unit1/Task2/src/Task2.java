import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int a,b,c; 
		a=vvodZhach("A");
		b=vvodZhach("B");
		c=vvodZhach("C");
		System.out.println("Значение выражения = "+vichZnach(a, b, c));


	}
	public static int vvodZhach(String f){
		Scanner sc = new Scanner(System.in);
		int temp;
		System.out.println("Введите значение "+f);
		while (!sc.hasNextInt()) { 
			sc.next();
		}
		temp = sc.nextInt();
		return temp;
	}
	
	public static double vichZnach(int a, int b, int c){
		double znac;
		znac=Math.pow(a, 2)-Math.pow((b-c), 2)+Math.log(Math.pow(b, 2)+1);
		return znac;
	}

}
