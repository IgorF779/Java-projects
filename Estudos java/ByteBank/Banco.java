package ByteBank;

public class Banco {
    public static void main(String[] args) {
        Cliente Paulo = new Cliente();

        Paulo.nome = "Paulo silveira";
        Paulo.cpf = "222.222.222-22";
        Paulo.profissao = "programador";

        Conta CDP = new Conta();
        CDP.Deposita(100);

        // associa o cliente paulo a conta CDP

        CDP.titular = Paulo;
        System.out.println(CDP.titular.nome);
        System.out.println(CDP.titular);
        System.out.println(Paulo);
    }
}