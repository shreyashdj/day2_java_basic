import java.util.Scanner;

public class ForLoop_Palindrome {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = sc.nextInt();
		int original = num;
		int reverse = 0;
		
		for (int i=0; i<num;)
		{  
		int remainder = num % 10; 
		reverse = reverse * 10 + remainder;  
		num = num/10;  
		}  	
		System.out.println(original==reverse ? original +" is Palindrome number" : original +" is not Palindrome number");
		
		// TODO Auto-generated method stub
sc.close();
	}

}
