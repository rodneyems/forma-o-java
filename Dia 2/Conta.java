class Conta{
  // caracteristicas/variaveis/atributos/campos
  // essas são variáveis de instancias
  String titular;
  int numero;
  String agencia;
  double saldo;

  void deposita(double valor){
    this.saldo += valor;
  }
  double extrato(){
    return this.saldo;
  }
  void transferecia(double valor, Conta contaDestino){
    this.saldo -= valor;
    contaDestino.saldo += valor;
  }
}
