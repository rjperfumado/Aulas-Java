import javax.swing.JOptionPane;

public class Addition {
	public static void main(String args[])
	
	{
		String firstNumber, secondNumber;
		int number1;
		int number2;
		int sum;
		
		firstNumber = JOptionPane.showInputDialog("Informe Primeiro Número");
		
		secondNumber = JOptionPane.showInputDialog("Informe o Segundo Número");
		
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		
		sum = number1 + number2;
		
		JOptionPane.showMessageDialog(
				null, "A soma é " + sum, "Results", JOptionPane.PLAIN_MESSAGE);

		
		
		
		System.exit(0);
	}
}
