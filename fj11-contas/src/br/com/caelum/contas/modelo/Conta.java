package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta> {
	  private String titular;
	  private int numero;
	  private String agencia;
	  protected double saldo;
	  
	public abstract String getTipo();

	public void deposita(double valor){
		if (valor < 0) {
			throw new IllegalArgumentException("Valor inv�lido");
		}else {
		this.saldo += valor;
		}
	}

	public void transfere(double valor, Conta conta) {
		this.saldo -= valor;
		conta.saldo += valor;
	}
	
	public void saca(double valor){
			this.saldo -= valor;
	}
	
	@Override
	public String toString() {
		return "[titular="	+	titular	+	",	numero="	+	numero
				+	",	agencia="	+	agencia	+	"]";
	}
	@Override
	public boolean equals(Object obj) {
		if	(obj	==	null)	{
			return false;
		}
		Conta	outraConta	=	(Conta)	obj;
		return this.numero	==	outraConta.numero	&&	
			this.agencia.equals(outraConta.agencia);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

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

	public double getSaldo() {
		return saldo;
	}
	public	int	compareTo(Conta	outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
}
