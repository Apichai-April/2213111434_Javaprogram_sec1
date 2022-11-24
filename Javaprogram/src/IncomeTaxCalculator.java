import java.util.*;
import java.text.*;
public class IncomeTaxCalculator {
	

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("0.00");
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the taxable income:");
		int taxableIncome = scan.nextInt();
		double taxPayable = 0;	
		
		if (taxableIncome <= 20000) { 
			taxPayable = 0;
			} else if (taxableIncome <= 40000) { 
			taxPayable = (taxableIncome-20000) * TAX_RATE_ABOVE_20K;
			} else if (taxableIncome <= 60000) { 
			taxPayable = (20000 * TAX_RATE_ABOVE_20K)+(20000*TAX_RATE_ABOVE_20K)+(taxableIncome-40000) * TAX_RATE_ABOVE_40K;
			} else { 
			taxPayable = (20000 * TAX_RATE_ABOVE_20K)+(20000*TAX_RATE_ABOVE_40K)+(taxableIncome-60000)*TAX_RATE_ABOVE_60K;
			}
			
		System.out.print("The income tax payable is: "+frm.format(taxPayable));

	}

}
