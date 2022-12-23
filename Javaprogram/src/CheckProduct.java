import java.util.*;
public class CheckProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int size = scan.nextInt();
		
		Product[] stockproduct = new Product[size];
		for(int i = 0;i<stockproduct.length;i++) {
			stockproduct[i] = new Product();
			
		}
		

	}

}
