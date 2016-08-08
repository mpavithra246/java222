import java.util.Scanner;


public class revnum {

	
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		while(n!=0)
		{
			int lastdigit=n%10;
			n/=10;
			sum=sum*10+lastdigit;
		}
System.out.println(sum);
	}

}

