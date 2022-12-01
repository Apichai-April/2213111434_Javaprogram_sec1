import java.util.*;

public class Example401 {

	public static void main(String[] args) {
		Scanner BB = new Scanner(System.in);
		String inputText="";
		String wordtoDisplay="";
		while(true) {
			System.out.print("Enter word");
			inputText = BB.next();
			if(inputText.equalsIgnoreCase("Stop")) {
				break;
			}
			wordtoDisplay = wordtoDisplay+inputText+" ";
		}
		System.out.println(wordtoDisplay.toUpperCase());

	}

}
