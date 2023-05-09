package principal;

import java.util.Scanner;

public class Exercicio2 {
	
	public void Method1(){ //Imprime "Olá mundo"

		System.out.println("Hello world");
			
			
}	public void Method2(){ //Recebe um número e imprime 
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Entre com um número:");
		int numeroValor =  leia.nextInt();
		System.out.println("O número informado foi: "+numeroValor);
		leia.close(); 

		
}	public void Method3(){ //Recebe dois numeros e imprime a soma
		Scanner leia = new Scanner (System.in);	
		System.out.println("Entre com o primeiro número:");
		int N1 =  leia.nextInt();
		
		System.out.println("Entre com o segundo número:");
		int N2 =  leia.nextInt();
		
		int result = (N1+N2);
		System.out.println("o resultado é: " +result);		
		leia.close();
}	public void Method4() {//Recebe 4 valores e imprime a média bimestral destes.
		double nota1, nota2, nota3, nota4;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a Primeira nota bimestral:");
		nota1 =  leia.nextInt();
		
		System.out.println("Entre com a Segunda nota bimestral:");
		nota2 =  leia.nextInt();
		
		System.out.println("Entre com a Terceira nota bimestral:");
		nota3 =  leia.nextInt();
		
		System.out.println("Entre com a Quarta nota bimestral:");
		nota4 =  leia.nextInt();
		
		
		double resultado = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("O resultado da média bimestral é: "+resultado);
		leia.close();
	

	
}	public void Method5() {
	
}
		

}
