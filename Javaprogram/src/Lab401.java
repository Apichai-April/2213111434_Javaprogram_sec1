import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fullName ="", FirstName = "", LastName="";
		System.out.print("Full Name");
		fullName = scan.nextLine();
		int spacebar=fullName.indexOf(" ");
		if(spacebar==-1) {
			System.out.print("Incorrect Name");
		}
		else {
	    FirstName=fullName.substring(0,spacebar);
	    LastName=fullName.substring(spacebar+1);
	    System.out.print("First Name: "+FirstName.+"\nLastName:"+LastName);

	}

}
}
