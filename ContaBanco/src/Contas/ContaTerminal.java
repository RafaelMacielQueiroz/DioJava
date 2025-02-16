package Contas;
import java.util.Locale;
import java.util.Scanner;
import Clientes.DadosCliente;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		int numero;
		String agencia;
		String primeiroNome;
		String segundoNome;
		double saldo;
		
		DadosCliente cliente = new DadosCliente();
		
		System.out.println("Por favor, insira 4 dígitos");
		numero = scanner.nextInt();
		System.out.println("Agora informe outros 4 dígitos, separando o último dígito por um - ");
		agencia = scanner.next();
		System.out.println("Informe seu primeiro nome");
		primeiroNome = scanner.next();
		System.out.println("Informe seu segundo nome");
		segundoNome = scanner.next();
		System.out.println("Senhor " + primeiroNome +", informe o valor de seu saldo");
		saldo = scanner.nextDouble();
		
		cliente.setNumero(numero);
		cliente.setAgencia(agencia);
		cliente.setPrimeiroNome(primeiroNome);
		cliente.setSegundoNome(segundoNome);
		cliente.setSaldo(saldo);
		
		String nomeCliente = cliente.juntarNome(primeiroNome, segundoNome);
		
		System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. \n Agência: "+ agencia + "\n Conta " + numero + "\n Saldo R$ " + saldo + "\n disponível para saque");
		

	
	}
	

}
