
import java.util.Scanner;


public class calculadora {

    public static void main(String[] args) 
    
    {
       
    	int n1;
    	int n2;
    	int soma;
    	int adicao;
    	int opcao;
    	    	
    	// LImpando a tela
    	System.out.print("\033[H\033[2J");  
        System.out.flush();
        
        // Inicio do Código
        
    	System.out.println(" \n\nCalculadora em Java: \n");
    	
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.println("Funções:");
    	System.out.println("Adição => 1");
    	System.out.println("Multiplicação => 2");
    	System.out.println("Divisão => 3");
        
        System.out.print("\nDigite a operação desejada: ");
        
        opcao = entrada.nextInt();
           	    	    
    	    
    	 //Bloco de Adição
    	
   	if (opcao == 1 ){
    		
   		System.out.print("\nDigite o primeiro numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("\nDigite o segundo numero: ");
        n2 = entrada.nextInt();
            
    	    soma = n1 + n2 ;
    	
    	System.out.println("A soma dos dois numeros é: " + soma );
    	} 
   	
   	
	// Bloco de multiplicação
   	
   	if (opcao == 2 ){ 
    		
   		System.out.print("\nDigite o primeiro numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = entrada.nextInt();
            
    	    soma = n1 * n2 ;
    	
    	System.out.println("\nA Multiplicação dos dois numeros é: " + soma );
    	} 
    	   	
   	// Bloco de Divisão
   	
   	if (opcao == 3 ){
		
   		System.out.print("\nDigite o primeiro numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = entrada.nextInt();
            
    	    soma = n1 / n2 ;
    	
    	System.out.println("\nA Divisão dos dois numeros é: " + soma );
    	} 
   	
    }
}

    		
  