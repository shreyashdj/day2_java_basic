import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
	        System.out.println("Enter value of x");
	        int x = sc.nextInt();
	        
	        System.out.println("Enter value of y ");
	        int y = sc.nextInt();
	        
	        double distance =  Math.pow((x * x + y * y), 2);
	        
	        System.out.println("Euclidean distance is " +distance);
		
		// TODO Auto-generated method stub
sc.close();
	}

}
