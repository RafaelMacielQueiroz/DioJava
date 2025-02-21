package desafiocontrolefluxo;

import java.util.Scanner;

import exception.ParametrosInvalidoException;

public class Contador {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scanner.close();
	}

	
	
	private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidoException {
		
		if(parametroUm > parametroDois) {
			 throw new ParametrosInvalidoException("O segundo parâmetro deve ser maior que o primeiro");
		}
		int diferenca = parametroDois - parametroUm;
		for(int i=1; i <= diferenca; i++) {
			System.out.println("Imprimindo número " + i);
		}

	}

}
