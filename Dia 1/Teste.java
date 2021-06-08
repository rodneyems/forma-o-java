class Teste{

    public static void main(String args[]){
        int x = 10, y = 20; //Não é um boa prática
        int z = 30;
        int i

        i = 40;
        
        String s = "10";

        char c = 'S'; //Aspas simples
        char dd = '9'; //Aspas simples

        boolean resposta = false;

        float altura = 1.55f; //24 digitos
        double altura2 = 1.60; //53 digitos

        byte idadeAluno = 3
        short idade = idadeAluno // Casting automatico pois o byte esta abrangido dentro do short, o contrário não seria possivel

        byte idadeAluno = (byte) idade // Casting por coerção
        
        System.out.println(x);
        System.out.println("O valor de I é:" + i);

    }

}

// byte -> -128 até 127
// short (2 bytes) -> -32.768 até 32.767