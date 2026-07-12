
public class Main {
	public static void main(String[] args) {
		int count = 0;
		while(count < 100) {
			System.out.println(++count);
			if(count == 25) {
				System.out.println("Chegou ao limite!");
				break;
			}
		}
	}
}
