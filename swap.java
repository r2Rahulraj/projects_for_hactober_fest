package javaAssignment;
//Question 6
//To swap value using third variable
import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner z=new Scanner (System.in);
		int a,b,c;
		System.out.println("Enter value for a");
		a=z.nextInt();
		System.out.println("Enter value for b");
		b=z.nextInt();
		c=b;
		b=a;
		a=c;
		System.out.println("current value of a = "+ a);
		System.out.println("current value of b = "+ b);

	}

}
