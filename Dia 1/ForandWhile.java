class ForandWhile{

    public static void main(String args[]){
        // for (declaraçao e atribuiçao; condiçao; repetiçao){
        //     Oq vai acontecer
        // }

        // normal
        for(int i = 0; i <= 10; i++ ){
            System.out.println(i);
        }

        // variavel p usar fora
        int i = 0;
        for(; i <= 10; i++ ){
            System.out.println(i)
        }

        // pares
        for(int i = 0; i <= 10; i += 2){

            if (i == 9){
                break // pass = continue
            }
            System.out.println(i);
        }
        //while
        int i = 0
        while(i <= 10){
            System.out.println(i);
            i++
        }
    }

}