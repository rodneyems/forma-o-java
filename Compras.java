class Compras{

    public static void main(String args[]){
        double valorCompra = 2000;
        double valorAPagar = valorCompra;
        int quantidade = 4;

        if (valorCompra > 1000 && quantidade > 3){
            valorAPagar = valorCompra * 0.9;
        }else if (valorCompra > 500){
            valorAPagar = valorCompra * 0.95
        }
    }

}

// Operadores
// 1. Aritméticos: + - * / %
// 2. Concatenação: +
// 3. Comparação: > >= < <= == !=
// && = AND
// || = OR
// Teste de mesa = ao teste de lógica da sua regra de negocio
// ++ incrementa
// -- decrementa
