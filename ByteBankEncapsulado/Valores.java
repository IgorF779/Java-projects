package ByteBankEncapsulado;

public class Valores {

    public static void main(String[] args) {

        Conta conta = new Conta(1337, 24226);

        System.out.println(conta.getAgencia());

        // Conta conta2 = new Conta(1337, 823782);
        // Conta conta4 = new Conta(1337, 32423);

        System.out.println(Conta.getTotal());

    }
}
