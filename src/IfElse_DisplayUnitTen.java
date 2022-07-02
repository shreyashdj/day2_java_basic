import java.util.Scanner;

public class IfElse_DisplayUnitTen {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1/10/100/1000");
		
		int	num = sc.nextInt();
	
		if (num==1) {
			System.out.println("Unit");
		}
		else if (num==10) {
			System.out.println("Ten");
		}
		else if (num==100) {
			System.out.println("Hundred");
		}
		else if (num==1000) {
			System.out.println("Thousand");
		}
		else
			System.out.println("enter number 1/10/100/1000");
		
		// TODO Auto-generated method stub
sc.close();
	}

}
