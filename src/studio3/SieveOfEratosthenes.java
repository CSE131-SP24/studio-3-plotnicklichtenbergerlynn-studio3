package studio3;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What number would you like to check up to?");
		int topNum = in.nextInt();
		
		int[] nums = new  int[topNum];
		for (int i = 0; i < topNum; i++) {
			nums[i] = i+1;
		}

		for (int i = 1; i < nums.length-1; i++) {
			if (nums[i] != 0) {
				for (int mult = nums[i]*2; mult < topNum; mult = mult + nums[i]) {
					if (mult <= nums.length-1) {
						nums[mult-1] = 0;
					}
				}
			}
		}
		nums[0] = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] != 0) {
				System.out.println(nums[i]);
			}
		}
		
		in.close();
	}

}
