package Java;

public class CriarConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;

        System.out.println("primeiraConta tem " + primeiraConta.saldo);
        System.out.println("segundaConta tem " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }

    
}