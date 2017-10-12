import java.util.Scanner;

public class MultiplesLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x=sc.nextInt();
		for (int i=1; i<=10; i++ ){
			int n;
			n= x*i;
			System.out.println(x + " x " + i +" = "+n);
		}

	}

}
