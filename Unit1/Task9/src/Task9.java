import java.util.Scanner;

public class Task9 {


	public static void main(String[] args) {
		int a,b,k;
		
		a=vvodZhach("A");
		b=vvodZhach("B");
		k=vvodZhach("K");
				
		if(a>b){
			System.out.println("1");
			for(int i=b; a>=i;i=i-k){
				System.out.println(i+"  |  "+znacFun(i));
			}
		}
		else if(a<b){
			System.out.println("2");
			for(int i=a; b>=i;i=i+k){
				System.out.println(i+"  |  "+znacFun(i));
			}
		}
		else {
			System.out.println("3");
			System.out.println(a+"  |  "+znacFun(a));
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
	
	public static double znacFun(int x){
		double temp=2*Math.atan2(x, 2)+1;		
		return temp;
	}

}
