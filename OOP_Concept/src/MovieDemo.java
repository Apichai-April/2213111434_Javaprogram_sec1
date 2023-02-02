import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Theater tt = new Theater();
		
		System.out.print("Input movie id : ");
		String id = scan.nextLine();
		System.out.print("Input movie name : ");
		String name = scan.nextLine();
		System.out.println();
		
		System.out.print("Input director name");
		String directorName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String directorMail = scan.nextLine();
		System.out.print("Input director gender : ");
		String directorGen = scan.nextLine();
		
		while(directorGen.equalsIgnoreCase("m") || directorGen.equalsIgnoreCase("f")) {
			System.out.print("Inpur director gender, again ");
			directorGen = scan.nextLine();
		}
		
		System.out.println();
		
		
		System.out.print("Input movie theater no : ");
		int movieNum = scan.nextInt();
		
		while(movieNum < 1 || movieNum > 16) {
			System.out.print("please input 1 - 15 only : ");
			movieNum = scan.nextInt();
		}
		
		
		
		
		
	}
	
	
	

}
