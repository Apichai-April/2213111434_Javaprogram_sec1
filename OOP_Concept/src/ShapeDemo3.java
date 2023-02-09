import javax.swing.*;

public class ShapeDemo3 {

	public static void main(String[] args) {
		
		int SizeArrays = 5;
		int j;
		
		double[] radius = new double[SizeArrays];
		double[] height = new double[SizeArrays];
		double[] volume = new double[SizeArrays];
		
		for(int i = 0; i<SizeArrays;i++) {
			 String data = JOptionPane.showInputDialog("Input radius and height cylinder "+(i +1 )+": ");
			radius[i] = Double.parseDouble(data.split("  ")[0]);
			height[i] = Double.parseDouble(data.split("  ")[1]);
	
	 }
		
		for(int J = 0;J<SizeArrays;J++) {
			Cylinder cylinder = new Cylinder(radius[J],height[J]);
			
			volume[J] = cylinder.getVolume();
			
			JOptionPane.showMessageDialog(null, "Cylinder 1 ,"+volume[0]);
			
		}
 
    }	
 }

