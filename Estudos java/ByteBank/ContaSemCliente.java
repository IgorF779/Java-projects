package ByteBank;

public class ContaSemCliente {
    public static void main(String[] args) {
        Conta CDM = new Conta();
        System.out.println(CDM.getSaldo());

        CDM.titular = new Cliente();
        CDM.titular.nome = "Marcela";
        System.out.println(CDM.titular.nome);
    }

}