import java.util.Scanner;

public class ForLoop_Sum {

	public static void main(String[] args) {
		
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of terms");
		int	num = sc.nextInt();
		
		for(int i=0; i<=num; i++) {			
			sum+=i;
		}
		System.out.println("The Sum of first "+num +" Natural Numbers is "+sum);
		
		// TODO Auto-generated method stub
sc.close();
	}

}
