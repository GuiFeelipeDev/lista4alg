import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		int posi = 0;
		int A[] = new int[30];
		int B[] = new int[30];
		
		for(int i = 0; i < 30; i++) {
			A[i] = random.nextInt(500);
			B[i] = random.nextInt(500);
		}
		
		for(int i = 0; i < 30; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
		for(int i = 0; i < 30; i++) {
			System.out.print(B[i]+" ");
		}
		//Coloquei para printar antes na tela para algum número poder ser selecionado.
		int X = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor de X: "));
		

		
		for(int i = 0; i < 30; i++) {
			if(X == A[i]) {
				posi = i;
			}
		}

		
		System.out.println();
		System.out.println(B[posi]);
	}

}
