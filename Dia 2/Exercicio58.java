class Exercicio58{
  public static void main (String args[]){
    Conta conta1 = new Conta("Rodney");
    conta1.setCadastro("Rodney", 5555, "AG7588", 15000, "10/10/10");
    System.out.println(conta1.getRecuperaDadosParaImpressao());
    System.out.println(conta1.getCalculoRendimento());
  }

}
