
import java.util.Scanner;


public class calculadora {

    public static void main(String[] args) 
    
    {
       
    	int n1,n2;
    	int soma;
    	int adicao;
    	int opcao;
    	    	
    	
    	//System.out.print("\033[H\033[2J");  
        //System.out.flush();
    	
    	Scanner entrada = new Scanner(System.in);
    	
    	 //n1 = entrada.nextInt();
    	 //n2 = entrada.nextInt();
    	 opcao = entrada.nextInt();
    	 adicao = entrada.nextInt();
    	     	
    	 System.out.print("\nInforme a operação desejada: ");
    	
    	if (opcao == adicao){
    		
    		System.out.print("\nDigite o primeiro numero: ");
            n1 = entrada.nextInt();
            
            System.out.print("\nDigite o segundo numero: ");
            n2 = entrada.nextInt();
            
    	    soma = n1 + n2 ;
    	
    	System.out.println("A soma dos dois numeros é: " + soma );
    	}   	
    	   	
    }
}

    		
  