
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class sozinho {

	public static void main(String[] args) throws IOException{
		
		
		int x = 100;
		
		// Gravando em Arquivo
		FileWriter arq = new FileWriter("loop.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		 			
		
		while ( x < 10 )
		
		{
			x = x - 1;
			
			System.out.println("Valor %2d:" +x);
			//gravaArq.printf("Valores do Loop é : %2d \n",x);
			arq.close ();
			
}
	
	}
}

