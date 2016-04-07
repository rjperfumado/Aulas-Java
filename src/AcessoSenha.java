package ProgramAcesso;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AcessoSenha {

	public static void main(String[] args) throws IOException {

		String cadastroSenha;
		String confirmaSenha;
		double a;
		double b;
		

		FileWriter arq = new FileWriter("resultado.txt");
		PrintWriter gravarArq = new PrintWriter(arq);

		cadastroSenha = JOptionPane.showInputDialog(null, "Senha", "", JOptionPane.QUESTION_MESSAGE);
		gravarArq.printf("+--Senha--+%n", cadastroSenha);

		a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número", "", JOptionPane.QUESTION_MESSAGE));
		
		gravarArq.printf("\n+--Primeiro Numero %.0f --+%n", a);

		b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo", "", JOptionPane.QUESTION_MESSAGE));
		gravarArq.printf("+--Primeiro Numero %.0f --+%n", b);

		confirmaSenha = JOptionPane.showInputDialog(null, "Digite sua senha", "", JOptionPane.QUESTION_MESSAGE);

		if (confirmaSenha.equals(cadastroSenha)) {
			System.out.println(a / b);
		} else {
			System.out.println("Senha informada incorreta");
		}

		arq.close();

		// System.exit(0);

	}

}
