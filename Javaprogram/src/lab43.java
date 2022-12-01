import java.util.*;
public class lab43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		String lowerMessage = message.toLowerCase();
		if(lowerMessage.indexOf("nichi") >=0 ) {
			System.out.println("Nichi is a message");
			
		}
		else {
			System.out.print(message);
		}

	}

}
