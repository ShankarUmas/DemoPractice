import java.util.Scanner;

public class ArethematicRelational {

	public static void main(String[] args) {

int a;
int b;

System.out.println("Enter two Number");
Scanner sc =new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
for(int i=0;i<=7;i++)
{
	
	System.out.print(i);
	System.out.println("\t");
}
System.out.println("true/false.. "+(a<b));
System.out.println("true/false.. "+(a>b));
System.out.println("true/false.. "+(a<=b));
System.out.println("true/false.. "+(a>=b));
System.out.println("true/false.. "+(a==b));
System.out.println("true/false.. "+(a!=b));
	}

}
