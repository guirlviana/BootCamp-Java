package listaG;

import javax.swing.JOptionPane;

public class g2 {

	public static void main(String[] args) {
		int code;
		
		code = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo", "CODIGO", JOptionPane.QUESTION_MESSAGE));
		
		switch (code) {
		case 10:
			JOptionPane.showMessageDialog(null, "Departamento Expedi��o", "DEPARTAMENTO", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 50:
			JOptionPane.showMessageDialog(null, "Departamento Pessoal", "DEPARTAMENTO", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 20:
			JOptionPane.showMessageDialog(null, "Departamento Recursos Humanos", "DEPARTAMENTO", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 30:
			JOptionPane.showMessageDialog(null, "Departamento Log�stica", "DEPARTAMENTO", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 40:
			JOptionPane.showMessageDialog(null, "Departamento Contabilidade", "DEPARTAMENTO", JOptionPane.INFORMATION_MESSAGE);
			break;			
		case 60:
			JOptionPane.showMessageDialog(null, "Departamento Inform�tica", "DEPARTAMENTO", JOptionPane.INFORMATION_MESSAGE);
			break;	
		default:
			JOptionPane.showMessageDialog(null, "Codigo Inv�lido", "SA�DA", JOptionPane.INFORMATION_MESSAGE);
			break;
		}


	}

}
