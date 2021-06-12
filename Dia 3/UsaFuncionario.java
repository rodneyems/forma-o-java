class UsaFuncionario{
  public static void main (String args[]){
    Programador rodney = new Programador("Rodney");
    rodney.setLinguagem("JAVA");
    System.out.println(rodney.getLinguagem() + " " + rodney.getNome());
  }

}