import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date");
		int d = sc.nextInt();
		
		System.out.println("Enter Month");
		int m =sc.nextInt();

		if	((m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30)
				|| (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20)) {
			System.out.println("date " + d + " & month " + m + " is True");
		
		} else
		        System.out.println("False! Check the Date");
		
		// TODO Auto-generated method stub
sc.close();
	}

}
