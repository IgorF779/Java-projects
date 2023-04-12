package ByteBank;

public class ValoresNegativos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.Deposita(100);
        System.out.println(conta.saca(101));

        conta.saca(101);

        System.out.println(conta.getSaldo());

        conta.numero = -1377;
    }
}