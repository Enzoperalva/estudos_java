
public class Main {
	public static void main(String[] args) {
		int[] nums = {4, 2, 7, 2, 9, 5, 5, 8};
		int indicePrimeiro = 0, indiceUltimo = 0;
		boolean temPrimeiro = false, naoQuebrou;


		for(int i = 0; i < nums.length -1; i++) {
			naoQuebrou = true;
			for(int e = 0; e < nums.length - 1; e++) {
				if(nums[i] == nums[e+1]) {
					indiceUltimo = i-2;
					naoQuebrou = false;
					continue;
				}
			}
			if(naoQuebrou) {
				if(!temPrimeiro) {
					indicePrimeiro = i;
					temPrimeiro = true;
				}
			}
		}
		if(!temPrimeiro) {
			System.out.println("Nenhum segmento encontrado");
		}else {
			System.out.println("Inicio: "+indicePrimeiro);
			System.out.println("Fim: "+indiceUltimo);
		}
	}
}
