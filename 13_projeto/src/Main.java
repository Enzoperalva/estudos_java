
public class Main {
	public static void main(String[] args) {
		int count = 0;
		while(count < 100) {
			if(count % 2 == 0) {
				System.out.println(count);
			}
			count++;
		}

		for(int i=0; i<100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}
