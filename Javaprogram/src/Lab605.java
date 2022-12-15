import javax.swing.*;
public class Lab605 {

	public static void main(String[] args) {
		
		
		int[] number = new int[5];
		for(int i=0; i<number.length;i++) {
		 number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+":"));
			
		}
		showEven(number);
		showOdd(number);
		
	}
	private static void showEven(int[] list) {
		String evenMs = "";
		for(int even : list)
			if(even % 2 ==0)
				evenMs = evenMs+ even +" ";
		JOptionPane.showMessageDialog(null, "List of even number: \n"+ evenMs,"Message",
				JOptionPane.INFORMATION_MESSAGE);
	}
		
    private static void showOdd(int[] list) {
    	String oddMs = "";
    	for(int odd : list)
    		if(odd % 2 !=0)
    			oddMs = oddMs+ odd +" ";
    	JOptionPane.showMessageDialog(null, "List of odd number: \n"+oddMs,"Message",
    			JOptionPane.INFORMATION_MESSAGE);
    	
	
    }

}