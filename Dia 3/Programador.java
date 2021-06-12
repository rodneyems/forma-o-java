public class Programador extends Funcionario{
  private String linguagem;

  Programador(String nome){
    super(nome);
  }

  public void setLinguagem(String linguagem){
    this.linguagem = linguagem;
  }

    public String getLinguagem(){
      return this.linguagem;
  }

}