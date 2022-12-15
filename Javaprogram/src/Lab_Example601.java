
public class Lab_Example601 {

	public static void main(String[] args) {
		int nums[] = {12, 50, 93, 45, 75, 52, 80};
		/*for(int  = 0; i < nums.lenght;i++)
			System.out.print("nums["+i+"] = "+ nums[i]);**/
		int i = 1;
		for(int _nums:nums) {
			System.out.print("nums[" + i + ") = " + _nums);
			i++;
		}

	}

}
