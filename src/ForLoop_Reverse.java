import java.util.Scanner;

public class ForLoop_Reverse {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		int reverse = 0;
		
		for (int i=0; i<=num; i++)
		{  
		int remainder = num % 10; 
		reverse = reverse * 10 + remainder;  
		num = num/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse); 
		
		// TODO Auto-generated method stub
sc.close();
	}

}
