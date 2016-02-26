import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class gravaTexto {

  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    
    int i, n;
    
 // LImpando a tela
	System.out.print("\033[H\033[2J");  
    System.out.flush();

    System.out.printf("\n+=== Informe o número para a tabuada ===+: ");
    n = ler.nextInt();

    FileWriter arq = new FileWriter("tabuada.txt",true);
    PrintWriter gravarArq = new PrintWriter(arq);

    gravarArq.printf("\n+--Resultado--da Tabuada de %2d +%n",n);
    for (i=1; i<=10; i++) {
      gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
    }
    gravarArq.printf("+-------------+%n");

    arq.close();

    System.out.printf("\nTabuada do número %d foi gravada com sucesso em \"tabuada.txt\".\n", n);
  }

}

