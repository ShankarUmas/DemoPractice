import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string to be reversed");
String name=sc.next();
char ch[]=name.toCharArray();
System.out.println("No of characters present in string:-  "+ch.length);
System.out.println("After reverse string:::   ");

for(int i=ch.length-1; i>=0; i--)
{

System.out.print(ch[i]);
//System.out.println("\n");	
}

}}
