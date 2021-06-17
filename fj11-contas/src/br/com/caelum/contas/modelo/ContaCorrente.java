package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	public	String	getTipo() {
		return "Conta	Corrente";
	}
	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor inv�lido");
		}else if (valor > getSaldo()) {
			throw new SaldoInsuficienteException("Saldo n�o dispon�vel");
		}else {
			this.saldo -= valor + 0.10;
		}
	}
	public double getValorImposto() {
		return this.saldo * 0.01;
	}
}
