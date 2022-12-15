import java.util.*;
public class Lab601 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] number = new int[7];
		//int countofOdd=0;
		for(int i=0; i<number.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			number[i] = scan.nextInt();
			/*if(number[i]%2 !=0) {
				countofOdd++;
			}*/
			countofOdd = countOfOddNumber(number);
			
		}
		System.out.println();
		System.out.println("There are "+ countofOdd +"of odd number");
		for(int _posnumber : number) {
			if(_posnumber %2 !=0) {
				System.out.print(_posnumber+" " );
			}
		}
		

	}
	public static int countOfOddNumber(int[] num) {
		for(int i =0;i<num.length;i++) {
			if (num[i] %2 !=0) {
				countofOdd++;
			}
		}
		return countofOdd;
	}

}
