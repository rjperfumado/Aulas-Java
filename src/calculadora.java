
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.management.StringValueExp;
import javax.print.DocFlavor.STRING;


public class calculadora {

    public static void main(String[] args) throws IOException 
    
    {
       
    	int n1;
    	int n2;
    	int soma,adicao,subtracao,multiplicacao,divisao;
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
    	System.out.println("Subtraçao => 4");
        
        System.out.print("\nDigite a operação desejada: ");
        
        opcao = entrada.nextInt();
           	    	    
    	//Grava em arquivo
        FileWriter arq = new FileWriter("calculo.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        
    	 //Bloco de Adição
    	
   	if (opcao == 1 ){
    		
   		System.out.print("\nDigite o primeiro numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("\nDigite o segundo numero: ");
        n2 = entrada.nextInt();
            
    	    soma = n1 + n2 ;
    	    gravarArq.printf("O Resultado da operação é: %2d\n",soma);
    	System.out.println("A soma dos dois numeros é: " + soma );
    	  arq.close();
    	  
    	} 
   	
   	
	// Bloco de multiplicação
   	
   	if (opcao == 2 ){ 
    		
   		System.out.print("\nDigite o primeiro numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = entrada.nextInt();
            
    	    multiplicacao = n1 * n2 ;
    	    gravarArq.printf("O Resultado da operação é: %2d\n",multiplicacao);
    	System.out.println("\nA Multiplicação dos dois numeros é: " + multiplicacao );
    	arq.close();
    	} 
    	   	
   	// Bloco de Divisão
   	
   	if (opcao == 3 ){
		
   		System.out.print("\nDigite o primeiro numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = entrada.nextInt();
            
    	    divisao = n1 / n2 ;
    	    gravarArq.printf("O Resultado da operação é: %2d\n",divisao);
    	System.out.println("\nA Divisão dos dois numeros é: " + divisao );
    	arq.close();
    	} 
   	
   	// Bloco Subtraçao
   	
	if (opcao == 4 ){
		
   		System.out.print("\nDigite o primeiro numero: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = entrada.nextInt();
            
    	    subtracao = n1 - n2 ;
    	    gravarArq.printf("O Resultado da operação é: %2d\n",subtracao);
    	System.out.println("\nA Subtração dos dois numeros é: " + subtracao );
    	arq.close();
    	} 
   	
    }
}

    		
  