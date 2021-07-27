import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		double x = Double.valueOf(JOptionPane.showInputDialog("Insira o valor de x:"));
		double y = x;
		double calc = 0, fat = 1, pi = 3.1415926;
		int ex = 1, cont = 0, cont2 = 0;
		double vet[] = new double[15];
		
		x = x * (pi/180);
		System.out.println(x);
		for(int c = 0; c < 15;c++) {
			fat = 1;
			while(cont2 > 1) {
				fat = fat * cont2;
				cont2--;
			}			
			if(cont == 0) {
				calc = calc +(Math.pow(x, ex)/(fat));
				cont++;
			}else {
				calc = calc -(Math.pow(x, ex)/(fat));
				cont--;
			}
			ex = ex + 2;
			cont2 = ex;
			vet[c] = calc;
		}
		for(int i = 0; i < 15; i++) {
			System.out.print(vet[i]+" ");
		}
		System.out.println();
		System.out.println("O seno de ("+y+"): "+vet[14]);
	}

}
