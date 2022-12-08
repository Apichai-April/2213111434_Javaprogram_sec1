import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space. \n :");
		String fullName = scan.nextLine();
		System.out.println(abbreviatName(fullName) + fullName.substring(0,fullName.indexOf(" ")));
		
 
	}
	public static String abbreviatName(String fullName) {
		String[] space = fullName.split(" ");
		return space[1].substring(0,1).toUpperCase()+"."+space[2].substring(0,1).toUpperCase()
				+"."+space[0].substring(0,1).toUpperCase()+space[0].substring(1);
		}
		
	}


