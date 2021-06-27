package cwa;
import java.util.Scanner;
public class brothersage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the age of Rahul");
int a=sc.nextInt();
System.out.println("Enter the age of Ayush");
int b=sc.nextInt();
System.out.println("Enter the age of Ajay");
int c=sc.nextInt();
if(a>b && a>c)
	System.out.println("Rahul is elder");
else if(b>a && b>c)
	System.out.println("Ayush is elder");
else if(c>a && c>b)
	System.out.println("Ajay is elder");

	}

}
