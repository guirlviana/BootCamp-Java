package listaG;
import javax.swing.JOptionPane;
public class g1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int code;
		
		code = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo", "CODIGO", JOptionPane.QUESTION_MESSAGE));
		
		switch (code) {
		case 1:
			JOptionPane.showMessageDialog(null, "Identificador Inv�lido!", "SA�DA", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Mem�ria Insuficiente!", "SA�DA", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Esperando N�mero Inteiro!", "SA�DA", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3 :
			JOptionPane.showMessageDialog(null, "Tipo de Dado Indefinido!", "SA�DA", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Par�metro Incorreto!", "SA�DA", JOptionPane.INFORMATION_MESSAGE);
			break;			

		default:
			JOptionPane.showMessageDialog(null, "Bem vindo!", "SA�DA", JOptionPane.INFORMATION_MESSAGE);
			break;
		}

	}

}
