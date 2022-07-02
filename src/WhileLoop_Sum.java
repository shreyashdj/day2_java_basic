import java.util.Scanner;

public class WhileLoop_Sum {

	public static void main(String[] args) {
		
		
		int i = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of terms");
		int	num = sc.nextInt();
		
		while(i<=num) {			
			sum+=i;
			i++;
		}
		System.out.println("The Sum of first "+num +" Natural Numbers is "+sum);
		
		// TODO Auto-generated method stub
sc.close();
	}

}
