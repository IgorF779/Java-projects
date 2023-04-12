public class escopo {

    public static void main(String[] args) {
        
        int idade = 18;
        int quantidadePessoa = 3;
        //boolean acompanhado = quantidadePessoa >= 2;
        
        boolean acompanhado;

        
        if(quantidadePessoa >= 2){
            //aqui não existe a variavel boolean ainda
            // nem aqui 
             acompanhado = true;
            //aqui ela ja existe 

        } else {
            //existe acompanhado?
            acompanhado = false;
        }

        System.out.println("valor de acompanhado = " + acompanhado);
        if (idade >= 18 && acompanhado) {
            // Condicional de ou Pipe pipe (||) é usado para falar ou
            // condicional de (&&) para falar é usando como e
            // boolean usado só para saber se ele é true e false

            System.out.println("seja bem vindo");
        }else {
            System.out.println("infelizmente você não pode entrar");
            }
        }
    }
