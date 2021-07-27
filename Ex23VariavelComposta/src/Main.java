import javax.swing.JOptionPane;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int aux, x = 1;
		int n = Integer.valueOf(JOptionPane.showInputDialog("Insira o N de 0 a 1000: "));
		int vet[] = new int[n];
		int vet_2[] =  new int[n];
		int vet_rep[] = new int[n];
		int cont[] = new int[n];
		Random random = new Random();
		
		System.out.println("Lista ordenada dos n�meros: ");
		for(int c = 0; c < n; c++) {
			vet[c]= random.nextInt(1000);
		}
		for(int i = 0; i < (n-1); i++) {
			for(int i2 = i+1; i2 < n; i2++) {
				if(vet[i2]<vet[i]) {
					aux = vet[i];
					vet[i] = vet[i2];
					vet[i2] = aux;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(vet[i]+" ");
		}
		System.out.println();
		System.out.println("Lista sem repeti��o: ");
		vet_2[0] = vet[0];
		for(int i = 0; i < n; i++) {
			for(int c = i+1;c < n; c++) {
				if(vet[c-1] != vet[c]) {
					vet_2[c] = vet[c];
				}else {
					vet_rep[c] = vet[c];
				}
			}
		}
		if(vet[0] == 0) {
			System.out.print(vet_2[0]+" ");
		}
		for(int i = 0; i < n; i++) {
			if(vet_2[i] != 0) {
				
				System.out.print(vet_2[i]+" ");
			}
		}
		System.out.println();
		System.out.println("N�meros que se repetem: ");
		for(int i = 0; i < n; i++) {
			if(vet_rep[i] != 0) {
				if(vet_rep[i] != vet_rep[i+1]) {	
					System.out.print(vet_rep[i]+" ");
				}
			}
		}
		for(int i = 0; i < n - 1; i++) {
			x = 1;
			if(vet_rep[i] != 0) {
				for(int c = i+1; c < n; c++) {
					if(vet_rep[i] == vet_rep[c]) {
						x++;
					}
					cont[i] = x;
					
				}
			}
		}
		System.out.println();
		System.out.println("Quantas vezes cada um se repete: ");
		for(int i = 0; i < n; i++) {
			if(vet_rep[i] != 0) {
				if(vet_rep[i] != vet_rep[i-1]) {	
					System.out.println(vet_rep[i]+" = "+cont[i]);
				}
			}
		}
	}

}
