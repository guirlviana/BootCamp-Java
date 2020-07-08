package listaG;
import javax.swing.JOptionPane;
public class g1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int code;
		
		code = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo", "CODIGO", JOptionPane.QUESTION_MESSAGE));
		
		switch (code) {
		case 1:
			JOptionPane.showMessageDialog(null, "Identificador Inválido!", "SAÍDA", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Memória Insuficiente!", "SAÍDA", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Esperando Número Inteiro!", "SAÍDA", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3 :
			JOptionPane.showMessageDialog(null, "Tipo de Dado Indefinido!", "SAÍDA", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Parâmetro Incorreto!", "SAÍDA", JOptionPane.INFORMATION_MESSAGE);
			break;			

		default:
			JOptionPane.showMessageDialog(null, "Bem vindo!", "SAÍDA", JOptionPane.INFORMATION_MESSAGE);
			break;
		}

	}

}
