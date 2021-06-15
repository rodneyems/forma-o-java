package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;

public class TestaConta2 {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.setTitular("Rodney");
		System.out.println(c.getTitular());
	}

}
