import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int x;
		x=vvodZhach("X");
		System.out.println("F(x) = "+vichislZnach(x));
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
	
	public static double vichislZnach(int x){
		double temp;
		if (x<=-3){
			temp=9;
		}else{
			temp=1/ (Math.pow(x, 2)+1);			
		}
		return temp;
	}

}
