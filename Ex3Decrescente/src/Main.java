
public class Main {

	public static void main(String[] args) {
		int x = 0;
		int vet[] = new int[101];
		for(int i = 100; i >= 0; i--) {
			vet[x] = i;
			x++;
		}
		for(int c = 0; c <= 100; c++) {
			System.out.print(vet[c]+" ");
		}
	}

}
