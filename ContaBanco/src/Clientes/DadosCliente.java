package Clientes;

public class DadosCliente {
	
	int numero;
	String agencia;
	String primeiroNome;
	String segundoNome;
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public String getPrimeiroNome() {
		return primeiroNome;
	}


	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}


	public String getSegundoNome() {
		return segundoNome;
	}


	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	double saldo;
	

public String juntarNome(String primeiroNome, String segundoNome ) {
	
	String juntarNome = primeiroNome +" " + segundoNome;
	return juntarNome;
	
}

}