import java.util.Scanner;


public class factorial {

	
	public static void main(String[] args) {
		System.out.println("enter the number");
		int a;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("factorial of"+a+ "is"+fact);
	}

}

