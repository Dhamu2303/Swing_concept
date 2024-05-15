package MyFirstProject;
import java.util.Scanner;

public class JavaPro {
	public static void Fun_Name(int age) {
		if(age>=18)
		{
			System.out.println("you are eligible for voting");
		}
		else {
			System.out.println("Your are not eligible");
		}
		return;
	}
    public static void main(String [] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter you age");
    	int i=scan.nextInt();
    	scan.close();
    	Fun_Name(i);
    }
}
