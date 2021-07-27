import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		double x, cubo = 0;
		double vet[] = new double[10];
		for(int i = 0;i < 10; i++) {
			x = Integer.valueOf(JOptionPane.showInputDialog("Insira um número que deseja"
					+ " saber o cubo"));
			cubo = Math.pow(x, 3);
			vet[i] = cubo;
		}
		System.out.println("Cubos gerados:");
		for(int c = 0; c < 10; c++) {
			System.out.println((c+1)+"º = "+vet[c]);
		}
	}

}
