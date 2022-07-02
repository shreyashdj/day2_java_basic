import java.util.Scanner;

public class Operators_ArithmeticOperations {

	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number a");
		double a = sc.nextDouble();
		
		System.out.println("Enter number b");
		double b = sc.nextDouble();
		
		System.out.println("Enter number c");
		double c = sc.nextDouble();

		double	expr1 = a+b*c;
		double	expr2 = c+a/b;
		double	expr3 = a%b+c;
		double	expr4 = a*b+c;
		
		System.out.println("\n expr1 = " +expr1);	
		System.out.println(" expr2 = " +expr2);
		System.out.println(" expr3 = " +expr3);
		System.out.println(" expr4 = " +expr4 +"\n");
		
		if ((expr1 > expr2) && (expr1 > expr3) && (expr1 > expr4)) {
			System.out.println("Maximum = " +expr1);
			
		} else if (expr2 > expr3 && expr2 > expr4) {
			System.out.println("Maximum = " +expr2);
		
		} else if (expr3 > expr4) {
			System.out.println("Maximum = " +expr3);
		
		} else {
			System.out.println("Maximum = " +expr4);}
		
		if ((expr1 < expr2) && (expr1 < expr3) && (expr1 < expr4)) {
			System.out.println("Minimum = " +expr1);
			
		} else if (expr2 < expr3 && expr2 < expr4) {
			System.out.println("Minimum = " +expr2);
		
		} else if (expr3 < expr4) {
			System.out.println("Minimum = " +expr3);
		} else
			System.out.println("Minimum = " +expr4);

		// TODO Auto-generated method stub
sc.close();
	}

}
