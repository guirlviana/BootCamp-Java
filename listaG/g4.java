package listaG;

import javax.swing.JOptionPane;

public class g4 {

	public static void main(String[] args) {
		int code;
		float sal, nsal, rej;
		String mensagem;
		sal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salario", "SALARIO", JOptionPane.QUESTION_MESSAGE)); 
		code = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo", "CODIGO", JOptionPane.QUESTION_MESSAGE));	
		
		switch (code) {
		case 1:
			rej = (sal/100) * 5;
			nsal = sal + rej;	
			mensagem = ("Salario antigo: " + sal + "\n" + "Salario atual: " + nsal + "\n" + "Reajuste: " + rej + "\n" + "Cargo: OPERADOR ");
			JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);			
			break;
		case 2:
			rej = (sal/100) * 10;
			nsal = sal + rej;			
			mensagem = ("Salario antigo: " + sal + "\n" + "Salario atual: " + nsal + "\n" + "Reajuste: " + rej + "\n" + "Cargo: PROGRAMADOR ");
			JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);			
			break;
		case 3:
			rej = (sal/100) * 15;
			nsal = sal + rej;			
			mensagem = ("Salario antigo: " + sal + "\n" + "Salario atual: " + nsal + "\n" + "Reajuste: " + rej + "\n" + "Cargo: ANALISTA ");
			JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);			
			break;
		case 4:
			rej = (sal/100) * 25;
			nsal = sal + rej;	
			mensagem = ("Salario antigo: " + sal + "\n" + "Salario atual: " + nsal + "\n" + "Reajuste: " + rej + "\n" + "Cargo: GERENTE ");
			JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);			
			break;

		default:
			JOptionPane.showMessageDialog(null, "Codigo Inválido", "SAÍDA", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}

}
