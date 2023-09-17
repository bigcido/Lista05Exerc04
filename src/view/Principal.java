package view;
import NPRController.controller;
import model.PilhaInt;
import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		controller cont = new controller();
		PilhaInt pi = new PilhaInt();
		
		int valor, resultado;
		String temporario;
		
		do {
			System.out.println("Informe o valor desejado [Digite s para sair]: ");
			temporario= scan.nextLine();
		
			try{
				valor = Integer.parseInt(temporario);
				cont.insereValor(pi, valor);
				
			} catch (Exception errPilha) {
				if (!temporario.equals("s"));
				resultado = cont.NPR(pi, temporario);
				System.out.println("Resultado: " +resultado);
			}
		
		
	} while(!temporario.equals("s"));
	scan.close();
	}
}
