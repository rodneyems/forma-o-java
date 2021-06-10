class Exercicio58{
  public static void main (String args[]){
    Conta conta1 = new Conta();
    Conta conta2 = new Conta();
    Conta conta3 = new Conta();
    conta1.setCadastro("Rodney", 5555, "AG7588", 15000, "10/10/10");
    conta2.setCadastro("Paulo", 5555, "AG7588", 15000, "10/10/10");
    conta3.setCadastro("Marcos", 5555, "AG7588", 15000, "10/10/10");
    // System.out.println(conta1.getRecuperaDadosParaImpressao());
    // System.out.println(conta1.getCalculoRendimento());
    System.out.println(conta1.getRecuperaDadosParaImpressao());
    System.out.println(conta2.getRecuperaDadosParaImpressao());
    System.out.println(conta3.getRecuperaDadosParaImpressao());

  }

}
