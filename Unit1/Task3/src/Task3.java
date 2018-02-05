
public class Task3 {
	
	public static void main(String[] args) {
		int a=6, b=8;
		int rez;
		if (a>b){
			int c=9;
			rez=c+b;
			System.out.println(rez);
		}
		else if (a==b){
			System.out.println("Конец");
		}
		else if (a<b){
			int c=7;
			rez=a+b+c;
			System.out.println(rez+" Новый год!");
		}

	}

}
