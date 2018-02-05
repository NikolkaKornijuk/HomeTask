import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		int a,b,c,d;
		double znach;
		a=vvodZhach("A");
		b=vvodZhach("B");
		c=vvodZhach("C");
		d=vvodZhach("D");
		
		if ((c!=0)&&(d!=0)){
			znach=(a/c)*(b/d)-(a*b-c)/(c*d);
			System.out.println(znach);
		}else{
			System.out.println("Значения c и d не могут равняться нулю!");
		}
		

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

}
