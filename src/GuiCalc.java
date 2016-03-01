import javax.swing.JOptionPane;

public class GuiCalc {
	
	public static void main(String args[])
	
	{
		String firstNumber, secondNumber;
		int number1;
		int number2;
		int adicao,subtracao,divisao,multiplicacao;
		String opcao;
	
			
		opcao = JOptionPane.showInputDialog("Informe a operação:");
		
		if (opcao.equalsIgnoreCase("adicao")) {
			
			firstNumber = JOptionPane.showInputDialog("Informe Primeiro Número");
			secondNumber = JOptionPane.showInputDialog("Informe o Segundo Número");
			
			number1 = Integer.parseInt(firstNumber);
			number2 = Integer.parseInt(secondNumber);
			
			adicao = number1 + number2;
			
			JOptionPane.showMessageDialog(
					null, "A soma é " + adicao, "Resultado", JOptionPane.PLAIN_MESSAGE);
			
		}
		
		if (opcao.equalsIgnoreCase("subtracao")) {
			
			firstNumber = JOptionPane.showInputDialog("Informe Primeiro Número");
			secondNumber = JOptionPane.showInputDialog("Informe o Segundo Número");
			
			number1 = Integer.parseInt(firstNumber);
			number2 = Integer.parseInt(secondNumber);
			
			subtracao = number1 - number2;
			
			JOptionPane.showMessageDialog(
					null, "A subtracao é " + subtracao, "Resultado", JOptionPane.PLAIN_MESSAGE);
			
		}
		
		if (opcao.equalsIgnoreCase("divisao")) {
			
			firstNumber = JOptionPane.showInputDialog("Informe Primeiro Número");
			secondNumber = JOptionPane.showInputDialog("Informe o Segundo Número");
			
			number1 = Integer.parseInt(firstNumber);
			number2 = Integer.parseInt(secondNumber);
			
			divisao = number1 / number2;
			
			JOptionPane.showMessageDialog(
					null, "A divisao é " + divisao, "Resultado", JOptionPane.PLAIN_MESSAGE);
			
		}
		
		if (opcao.equalsIgnoreCase("multiplicacao")) {
			
			firstNumber = JOptionPane.showInputDialog("Informe Primeiro Número");
			secondNumber = JOptionPane.showInputDialog("Informe o Segundo Número");
			
			number1 = Integer.parseInt(firstNumber);
			number2 = Integer.parseInt(secondNumber);
			
			multiplicacao = number1 * number2;
			
			JOptionPane.showMessageDialog(
					null, "A multiplicação é " + multiplicacao, "Resultado", JOptionPane.PLAIN_MESSAGE);
			
		}
		
			System.exit(0);
	}
}
