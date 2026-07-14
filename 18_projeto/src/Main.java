import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] nums = {4, 5, 6, 7, 7, 9, 10};
		int maiorSeq = 0, atualSeq = 1;

		for (int i = 0; i < nums.length - 1; i++) {
			if(nums[i] < nums[i+1]) {
				atualSeq++;
			}else if(nums[i] >= nums[i+1]) {
				atualSeq = 1;
			}
			if(atualSeq > maiorSeq) {;
				maiorSeq = atualSeq;
			}
		}
		System.out.println(maiorSeq);

		input.close();
	}
}
