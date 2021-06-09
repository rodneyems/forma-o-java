class Conta{
  // caracteristicas/variaveis/atributos/campos
  // essas são variáveis de instancias
  String titular;
  int numero;
  String agencia;
  double saldo;
  String dataAbertura;

  void deposita(double valor){
    this.saldo += valor;
  }

  void saca(double valor){
    this.saldo -= valor;
  }

  double extrato(){
    return this.saldo;
  }

  double calculaRendimento(){
    return saldo * 0.1;
  }

  void transferecia(double valor, Conta contaDestino){
    this.saldo -= valor;
    contaDestino.saldo += valor;
  }

  String recuperaDadosParaImpressao(){
    return "titular: " + this.titular + "AG e Conta: " + this.agencia + "/" + this.numero + "saldo: " + this.saldo;
  }
}
