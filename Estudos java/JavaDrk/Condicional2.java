public class Condicional2 {

    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 18;
        int quantidadePessoa = 3;
        boolean acompanhado = quantidadePessoa >= 2;

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
