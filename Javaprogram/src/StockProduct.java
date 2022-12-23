import java.util.*;
import java.text.*;

public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] stproduct = new Product[4];
		DecimalFormat frm = new DecimalFormat("#,###.00");

		for (int i = 0; i < stproduct.length; i++) {
			stproduct[i] = new Product();
			System.out.print("Input product Id : ");
			stproduct[i].setId(scan.next());
			while(stproduct[i].getUnit() <= 0) {
				System.out.print("Input product Unit : ");
				stproduct[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price : ");
			stproduct[i].setPrice(scan.nextDouble());
			while(stproduct[i].getPrice() < 0) {
				System.out.print("Input product Price, again : ");
				stproduct[i].setPrice(scan.nextDouble());
			}
			System.out.println();
											
		}
		System.out.print("-------------------------------------------------------");
		
		double sum = 0;
		for(Product product : stproduct) {
			System.out.println("Product ID : " + product.getId() + ", Total price = "
					+ frm.format(product.calculate())  + " baht.");
			sum += product.calculate();
		}
		System.out.print("-------------------------------------------------------");
		System.out.println("Tota; price of all product is" +frm.format(sum)+" baht.");

	}

}
