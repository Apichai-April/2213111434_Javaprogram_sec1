import java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int SizeArrays = 5;
		double[] radius = new double[SizeArrays];
		double[] height = new double[SizeArrays];
		
		for(int i = 0; i<SizeArrays;i++) {
			System.out.print("Input radius and height : ");
			radius[i] = scan.nextDouble();
			height[i] = scan.nextDouble();
		}
		System.out.println();
		
		for(int r = 0;r<SizeArrays;r++) {
			Cylinder cylinder = new Cylinder(radius[r],height[r]);			
			System.out.println("Cylinder"+(r+1)+",volume = "+cylinder.getVolume());
			
		}

	}

}
