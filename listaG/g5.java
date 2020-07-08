
package listaG;

import javax.swing.JOptionPane;

public class g5 {

	public static void main(String[] args) {
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade da criança", "Escolinha FUT", JOptionPane.QUESTION_MESSAGE));
		
			//Professor não consegui fazer com switch case, achei mais simples fazer com if/else
		
			if (idade >= 6 && idade <= 8) {
			JOptionPane.showMessageDialog(null, "Dente de Leite", "Categoria", JOptionPane.INFORMATION_MESSAGE);
			}
	
			if (idade >= 9 && idade <= 11) {
				JOptionPane.showMessageDialog(null, "Pré-Mirim", "Categoria", JOptionPane.INFORMATION_MESSAGE);
			}
	
			if (idade >= 12 && idade <=13) {
				JOptionPane.showMessageDialog(null, "Mirim", "Categoria", JOptionPane.INFORMATION_MESSAGE);
			}
			
	
			if (idade >= 14 && idade <= 15) {
				JOptionPane.showMessageDialog(null, "Infantil", "Categoria", JOptionPane.INFORMATION_MESSAGE);
			}
			
		
			if (idade >= 16 && idade <= 17) {
				JOptionPane.showMessageDialog(null, "Juvenil", "Categoria", JOptionPane.INFORMATION_MESSAGE);
				
			}
	
			if (idade >= 18 && idade <= 20) {
				JOptionPane.showMessageDialog(null, "Juniores", "Categoria", JOptionPane.INFORMATION_MESSAGE);
			}
			if (idade < 6 || idade >= 21) {
				JOptionPane.showMessageDialog(null, "Categoria indisponivel", "Categoria", JOptionPane.INFORMATION_MESSAGE);
			}


	}

}
