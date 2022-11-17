import java.text.*;
import javax.swing.*;
public class MusicWorldApp {

	public static void main(String[] args) {
		String cdld;
		String cdTitle;
		int cdQuantity;
		double cdPrice;
		double cdSubTotal;
		double cdTotal;
		final double TAX_RATE=6.25;
		cdld =   JOptionPane.showInputDialog("This progeam calculates the total cost of a CD order "
				+ "\nPlease enter the ID of the CD");
		cdTitle = JOptionPane.showInputDialog("Please enter the title  of the CD");
		cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
		cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		cdSubTotal = cdPrice * cdQuantity;
		cdTotal = cdSubTotal * (1+TAX_RATE/100);
		JOptionPane.showMessageDialog(null, 
				"Summary of the transaction:"
				+"\nCD ID:"+cdld+"\nCD Title:"+cdTitle+"\nCD Uite Price: $"+cdPrice+
				"\nCD Quantity:"+cdQuantity+"\n\nSubtotal: $"+cdSubTotal+"\nTax rate:"+TAX_RATE+"%"+
				"\nTotal:"+cdTotal+"\n\nEnd of Program");
		
		
		
		
		
		
		
		
		
		

	}

}
