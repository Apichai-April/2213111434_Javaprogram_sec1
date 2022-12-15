import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] numberofInteger = {78, 36, 58, 41, 25, 92, 75 };
		
		System.out.print("Input index of array : ");
		int indexOfArray = scan.nextInt();
		
		while(indexOfArray<0 || indexOfArray >(numberofInteger.length - 1)) {
			System.out.print("Input index of array, again : ");
			 indexOfArray = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is "+(numberofInteger[indexOfArray]));
		System.out.println("Value in current index is "+(numberofInteger[indexOfArray  + 1 ]));
		if(indexOfArray==6) {
			System.out.print("Sorry, "+ indexOfArray + "is the last index in aray.");
			
		}
		else {
			System.out.println("value in next index is " +(numberofInteger[indexOfArray + 1 ]));
		}

	}

}
