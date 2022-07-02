import java.util.Scanner;

public class Switch_Vowel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter alphabet");
		String alphabet = sc.nextLine();
		
		switch (alphabet) {
		case "a":	case "A":
		case "e":	case "E":
		case "i":	case "I":
		case "o":	case "O":
		case "u":	case "U":		
			System.out.println(alphabet +" is vowel");
		break;
		default :
			System.out.println(alphabet +" is consonant");
		}
		
		// TODO Auto-generated method stub
sc.close();
	}

}
