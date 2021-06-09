class UsaConta{
  public static void main (String args[]){
    // Conta c = new Conta ();
    // c.titular = "Rodney";
    // c.numero = 1234;
    // c.agencia = "ag12";
    // c.saldo = 2000;


    // Conta c1 = new Conta ();
    // c1.titular = "Jose";
    // c1.numero = 5678;
    // c1.agencia = "ag50";
    // c1.saldo = 5000;

    // System.out.println("ANTES Rodney: " + c.saldo);
    // System.out.println("ANTES Jose: " + c1.saldo);

    // c1.transferecia(2000, c);

    // System.out.println("DEPOIS Rodney: " + c.saldo);
    // System.out.println("DEPOIS Jose: " + c1.saldo);

    Conta c = new Conta ();
    c.titular = "Rodney";
    c.numero = 1234;
    c.agencia = "ag12";
    c.saldo = 2000;

    Conta c1 = new Conta ();
    c.titular = "Rodney";
    c.numero = 1234;
    c.agencia = "ag12";
    c.saldo = 2000;

    if(c1 == c){
      System.out.println("CONTAS IGUAIS");
    } else {
      System.out.println("CONTAS DIFERENTES");
    }
    c1 = c;
      if(c1 == c){
        System.out.println("CONTAS IGUAIS");
    } else {
      System.out.println("CONTAS DIFERENTES");
    }
  }

}
