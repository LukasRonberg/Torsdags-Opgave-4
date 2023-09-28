import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
System.out.println("Please type your name");
Scanner scan = new Scanner(System.in);
String name = scan.nextLine();
System.out.println("Hello, " + name + ". Nice name!\nPlease type your age");
		int age = scan.nextInt();
		System.out.println(age);

		int retirementAge = 67 - age;
		System.out.println("You can retire in " + retirementAge + " years");// - age);
	}

}