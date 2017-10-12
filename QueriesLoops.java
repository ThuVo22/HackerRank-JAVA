import java.util.Scanner;

public class QueriesLoops {

	public static void main(String[] args) {
		int count=0;
		Scanner sc= new Scanner (System.in);
		    int i= sc.nextInt();
			for(count=0; count<i; count++) {
			int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int res=a;
            	for (int exp =0; exp<n; exp++) {
            res += (int)(Math.pow(2, exp)*b);
        		System.out.print(Integer.toString(res)+ " ");
            	
            		}		
			System.out.print('\n');
			}
	sc.close();
	}
	}
	



