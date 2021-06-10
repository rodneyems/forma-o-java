class Conta{
  // caracteristicas/variaveis/atributos/campos
  // essas são variáveis de instancias
  private String titular;
  private int numero;
  private String agencia;
  private double saldo;
  private String dataAbertura;
  Conta(String titular){
    this.titular = titular;
  }

  void setCadastro(String titular, int numero, String agencia, double saldo, String dataAbertura){
    this.titular = titular;
    this.numero = numero;
    this.agencia = agencia;
    this.saldo = saldo;
    this.dataAbertura = dataAbertura;
  }

  void setDeposito(double valor){
    this.saldo += valor;
  }

  void setSaca(double valor){
    this.saldo -= valor;
  }

  double getExtrato(){
    return this.saldo;
  }

  double getCalculoRendimento(){
    return saldo * 0.1;
  }

  void setTransferecia(double valor, Conta contaDestino){
    this.saldo -= valor;
    contaDestino.saldo += valor;
  }

  String getRecuperaDadosParaImpressao(){
    return "Titular: " + this.titular + " AG e Conta: " + this.agencia + "/" + this.numero + " Saldo: " + this.saldo;
  }

}
