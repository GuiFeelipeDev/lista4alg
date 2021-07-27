
public class Main {

	public static void main(String[] args) {
		int imp = 1;
		int vet[] = new int[101];
		
		for(int i = 0; i <= 100; i++) {
			vet[i] = imp;
			imp = imp + 2;
		}
		for(int c = 0; c <= 100; c++) {
			System.out.print(vet[c]+" ");
		}
	}

}
