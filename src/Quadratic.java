import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of a :");
		int a = sc.nextInt();
		
		System.out.print("Enter value of b :");
		int b = sc.nextInt();
		
		System.out.print("Enter value of c :");
		int c = sc.nextInt();

		int delta = (b * b) - (4 * a * c);
		int root1 = (-b + sqrt(delta))/(2*a);
		int root2 = (-b - sqrt(delta))/(2*a);
		
		System.out.println("Root 1 of X " + root1);
		System.out.println("Root 2 of X " + root2);
		
		// TODO Auto-generated method stub
sc.close();
	}

	private static int sqrt(int delta) {
		// TODO Auto-generated method stub
		return 0;
	}

}
