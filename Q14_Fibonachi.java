import java.util.Scanner;

public class Q14_Fibonachi {
	public static void main(String args[]) {
		// Q14-> print fibonachi series of n terms where n is user inputed
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which how many terms you want");
		int n =sc.nextInt();
		
		int a=0;int b=1;
		System.out.print(a+" ");
		if(n>1) {
			for(int i=2;i<=n;i++) { // here i = 2 is because of we already printed 1st digit
				System.out.print(b+" ");
				int temp =b;
				b=a+b;
				a=temp;
					
			}
			System.out.println();
			
		}
		
		
	}
}
