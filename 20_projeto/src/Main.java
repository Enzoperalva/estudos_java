
public class Main {
	public static void main(String[] args) {
		int[][] matriz = {{1, 1, 2, 3}, {1, 2, 2, 3}, {4, 4, 2, 5}, {4, 4, 5, 5}};
		int tamMaior = 0; int tamAtual = 0;
		int tamMatriz = matriz.length;
		System.out.println();

		for(int i = 0; i < tamMatriz - 1; i++) {
			for(int j = 0; j < tamMatriz - 1; j++) {
				if(i == 0 && j == 0) {
					if(matriz[i][j] == matriz[i][j-1]) {
						tamAtual++;
					}
					if(matriz[i-1][j] == matriz[i][j]) {
						tamAtual++;
					}

				}else if(i == tamMatriz - 1 && j == tamMatriz -1){
					if(matriz[i][j] == matriz[i][j+1]) {
						tamAtual++;
					}

					if(matriz[i+1][j] == matriz[i][j]) {
						tamAtual++;
					}
				}else {

					if(matriz[i][j] == matriz[i][j-1]) {
						tamAtual++;
					}
					if(matriz[i][j] == matriz[i][j+1]) {
						tamAtual++;
					}
					if(matriz[i+1][j] == matriz[i][j]) {
						tamAtual++;
					}
					if(matriz[i-1][j] == matriz[i][j]) {
						tamAtual++;
					}
					if(tamAtual > tamMaior) {
						tamMaior = tamAtual;
					}
				}
			}
			if(tamAtual > tamMaior) {
				tamMaior = tamAtual;
			}
		}
		System.out.println(tamMaior);
	}
}
