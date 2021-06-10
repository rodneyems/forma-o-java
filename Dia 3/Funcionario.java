class Funcionario{
  private String nome;
  private double salario;
  private double comissao; // Variavel de isntancia (do obj)
  static private double premio // Static siginifica que a variavel eh para a classe e nao soh pela instancia
  
  // Exige que o nome seja fornecido
  Funcionario (String nome){
    this.nome = nome;
  }
  // Exige que o nome e salario seja fornecido
  Funcionario(String nome, double salario){
    this.nome = nome;
    setSalario(salario);
  }
  // Não exige nada (esse é add automaticamente se nenhum outro construtor for declarado)
  Funcionario(){}
  
  // Getter e setter comissao
  void setComissao(double comissao){
    this.comissao = comissao
  }
  double getComissao(){
    return this.comissao
  }
  
  // Getter e setter premio
  static void setPremio(double premio){
    Funcionario.premio = premio // Nao podemos colocar this pois nao eh da instancia e sim da classe
  }
  static double getpremio(){
    return Funcionario.premio
  }


  // Garantir que o salario sempre sera maior que 1k
  void setSalario(double salario){
    if (salario < 1000){
      salario = 1000;
    }
    this.salario = salario;
  }


}