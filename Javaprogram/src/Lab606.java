import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		int nums[] = {25, 78, 41, 22, 36, 85, 37 };
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while(checkIndex(nums,index)) {
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again:"));
		}
		String prevData =  (nextData(nums,index)!=-1) 
				? "previous data,nums["+ (index-1)+"] is " + nextDatsa(nums,index)
				: "No previous data";
				
		String nextData = (nextData(nums,index)!=-1)
				? "previous data,nums["+ (index+1)+"]is" + nextData(nums,index)
				:"No previous data";
				
				JOptionPane.showMessageDialog(null, "current data,nums["+(index+1)+"]is" + nextData(nums,index)+
				"\n"+prevData+
				"\n"+nextData);
				

	}
	public static boolean checkIndex(int nums[],int index) {
		return index < 0|| index >(nums.length-1);
		
	}
	public static  int currentData(int nums[],int index) {
		return nums[index];
	}
	public static int nextDatsa(int nums[],int index) {
		return index == 0 ? -1 : nums[index - 1];
	}
		
	public static int nextData(int nums[],int index) {
		return index == nums.length -1 ? -1 : nums[index+1];
	}

}
