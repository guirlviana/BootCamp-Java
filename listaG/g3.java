package listaG;

import javax.swing.JOptionPane;

public class g3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int code;
		float sal, nsal, rej;
		String mensagem;
		sal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salario", "SALARIO", JOptionPane.QUESTION_MESSAGE)); 
		code = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo", "CODIGO", JOptionPane.QUESTION_MESSAGE));
		
		switch (code) {
		case 5:
			rej = (sal/100) * 5;
			nsal = sal + rej;
			mensagem = ("Salario antigo: " + sal + "\n" + "Salario atual: " + nsal + "\n" + "Reajuste: " + rej);
			JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 15:
			rej = (sal/100) * 10;
			nsal = sal + rej;	
			mensagem = ("Salario antigo: " + sal + "\n" + "Salario atual: " + nsal + "\n" + "Reajuste: " + rej);
			JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);			
			break;
		case 20:
			rej = (sal/100) * 15;
			nsal = sal + rej;			
			mensagem = ("Salario antigo: " + sal + "\n" + "Salario atual: " + nsal + "\n" + "Reajuste: " + rej);
			JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);			
			break;
		case 25:
			rej = (sal/100) * 20;
			nsal = sal + rej;			
			mensagem = ("Salario antigo: " + sal + "\n" + "Salario atual: " + nsal + "\n" + "Reajuste: " + rej);
			JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);			
			break;
		case 30:
			rej = (sal/100) * 25;
			nsal = sal + rej;	
			mensagem = ("Salario antigo: " + sal + "\n" + "Salario atual: " + nsal + "\n" + "Reajuste: " + rej);
			JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);			
			break;
		case 35:
			rej = (sal/100) * 30;
			nsal = sal + rej;			
			mensagem = ("Salario antigo: " + sal + "\n" + "Salario atual: " + nsal + "\n" + "Reajuste: " + rej);
			JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);			
			break;
		default:
			JOptionPane.showMessageDialog(null, "Codigo Inválido", "SAÍDA", JOptionPane.INFORMATION_MESSAGE);
			break;
		}

	}

}
