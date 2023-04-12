package Java;

// CDP - Conta do paulo
// CDM - Conta da Marcela
public class Método {
    public static void main(String[] args) {
        Conta CDP = new Conta();
        CDP.saldo = 100;
        CDP.Deposita(50);
        System.out.println(CDP.saldo);

        boolean conseguiuRetirar = CDP.saca(20);
        System.out.println(CDP.saldo);
        System.out.println(conseguiuRetirar);

        Conta CDM = new Conta();
        CDM.Deposita(1000);

        if (CDM.transfere(300, CDP)) {
            System.out.println("transferência com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }
        System.out.println(CDM.saldo);
        System.out.println(CDP.saldo);

        CDP.titular = "Paulo Silveira";
        System.out.println(CDP.titular);

    }

}
