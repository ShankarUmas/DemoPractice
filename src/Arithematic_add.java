import java.util.Scanner;

public class Arithematic_add {

	public static void main(String[] args) {

int a;
int b;

System.out.println("Enter two Number...");
Scanner sc = new Scanner(System.in);

a=sc.nextInt();
b=sc.nextInt();
System.out.println("Addition" + (a+b));
System.out.println("Subtraction"+ (a-b));
System.out.println("Multiplication"+ (a*b));
System.out.println("Division"+ (a/b));
System.out.println("Remainder"+(a%b));
	}
}

