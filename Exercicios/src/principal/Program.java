package principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		/*//Faça um programa que imprima Hello World
		
		*/
		Exercicio2 e2 = new Exercicio2();
		/*e2.Method1();
	
		
		System.out.println("");
		Scanner leia = new Scanner (System.in);
		String resposta =  leia.nextLine();
		
		leia.close();
		*/
		int h = JOptionPane.showConfirmDialog(null ,"Deseja iniciar o Exercicio 1?",
				"Exercicio 1",JOptionPane.YES_NO_OPTION);
				if (h == 0) { 
					e2.Method1();
				} else if (h == 1)System.out.println("Você escolheu terminar aqui");
				
				{if (h ==0) {
		int i = JOptionPane.showConfirmDialog(null ,"Deseja prosseguir para o Exercicio 2?",
				"Exercicio 2",JOptionPane.YES_NO_OPTION);
					if (i == 0) { 
					e2.Method2();
				} else if (i == 1)System.out.println("Você escolheu terminar aqui");
				

					if (i == 0) {
		int j = JOptionPane.showConfirmDialog(null ,"Deseja prosseguir para o Exercicio3 ?",
				"Exercicio 3",JOptionPane.YES_NO_OPTION);
				if (j == 0) { 
					e2.Method3();
				} else if (i == 1)System.out.println("Você escolheu terminar aqui");
					}else {
				if (j == 0) {
		int k = JOptionPane.showConfirmDialog(null ,"Deseja prosseguir para o Exercicio 4?",
				"Exercicio 4",JOptionPane.YES_NO_OPTION);
				if (k == 0) { 
					e2.Method4();
				} else if (k == 1)System.out.println("Você escolheu terminar aqui");
				}
				if (k == 0) {
		int l = JOptionPane.showConfirmDialog(null ,"Deseja prosseguir para o Exercicio 5?",
				"Exercicio 5",JOptionPane.YES_NO_OPTION);
				if (l == 0) { 
					e2.Method5();
				} else if (l == 1)System.out.println("Você escolheu terminar aqui");
				
				if (l == 0) {
		/*int m = JOptionPane.showConfirmDialog(null ,"Deseja prosseguir para o Exercicio 6?",
				"Exercicio 6",JOptionPane.YES_NO_OPTION);
				if (m == 0) { 
					e2.Method6();
				} else if (m == 1)System.out.println("Você escolheu terminar aqui");		
*/}}
}
}
}
}
		
		



	
		
		
	

}
}
