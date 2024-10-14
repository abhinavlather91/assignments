import java.util.*;
public class Calculator {
	public static double Add(double a , double b){
		return a+b;
	}

	public static double Subtraction(double a, double b){
		return a-b;
	}
	public static double Multiplication(double a, double b){
		return a*b;
	}
	public static double division(double a, double b){
		return a/b;
	}


	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double a = sc.nextInt();
	double b = sc.nextInt();
	
	String op = sc.next();
	char operator = op.charAt(0);

		switch(operator) {
			case '+':
				System.out.println(Add(a,b));
				break;
			case '-':
				System.out.println(Subtraction(a,b));
				break;
			case '*':
				System.out.println(Multiplication(a,b));
				break;
			case '/':
				System.out.println(division(a,b));
				break;
			default:
				System.out.println("wrong input");
				break;
		}
	}
}
	

