
import java.util.Scanner;

public class somador {

    public static void main(String[] args) 
    
    {
       
    	int n1,n2,total;
    	
    	//Runtime.getRuntime().exec("clear");
    	
    	System.out.print("\033[H\033[2J");  
        System.out.flush();  
    	
    	Scanner entrada = new Scanner(System.in);
        
    	System.out.print("\nDigite o primeiro numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = entrada.nextInt();
        
        total = n1 + n2 ;
     
        System.out.println("\n\nA soma dos dois numeros é: " + total );
       
    }
}