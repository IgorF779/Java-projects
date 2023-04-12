
public class controlefluxo {
    public static void main(String[] args) {

        int idade = 18;
        int quantidadePessoa = 2;

        if (idade >= 18) {
            System.out.println("você tem mais de 18 anos");
            System.out.println("seja bem vindo");
        } else {
            if (quantidadePessoa >= 2) {
                System.out.println("Voce não tem 18, mas esta acompanhado, pode entrar");
            }
            System.out.println("infelizmente voce nao pode entrar");
        }
    }
}
