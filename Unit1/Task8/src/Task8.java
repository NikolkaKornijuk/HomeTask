import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		double znach;
		
		
		int[] mas = new int[3];
		for(int i=0; i<3; i++){
			int y=i+1;
			mas[i]=vvodZhach(y);
			
		}
		for(int i=0; i<3; i++){
			if(mas[i]>0){
				
				znach=Math.pow(mas[i], 2);
				System.out.println(znach);
			}
			else if(mas[i]<0){
				znach=Math.pow(mas[i], 4);
				System.out.println(znach);
			}
			else{
				System.out.println(0);
			}
		}

	}
	public static int vvodZhach(int f){
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
