import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] nums = {1, 2, 3, 4, 5, 6, 7};
		int maiorSeq = 0, atualSeq = 0;
		int i = 0;

		for(int num: nums) {
			i++;
			if(i > nums.length) {
				i--;
			}
			if(num < nums[i]) {
				atualSeq = 0;
			}
			if(num > nums[i]) {
				atualSeq++;
			}
			if(atualSeq > maiorSeq) {
				maiorSeq = atualSeq;
			}

		}
		System.out.println(maiorSeq);

//		for(int i=0; i < tamArray ;i++) {
//			if(nums[i++] < nums[++i]) {
//				atualSeq = 0;
//			}
//			if(nums[i++] > nums[++i]) {
//				atualSeq++;
//				if(atualSeq > maiorSeq) {
//					maiorSeq = atualSeq;
//				}
//			}
//		}

		input.close();
	}
}
