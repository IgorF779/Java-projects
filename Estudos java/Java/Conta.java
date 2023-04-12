package Java;

public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;
    String cpf;
    String profissao;

    public void Deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.Deposita(valor);
            return true;
        }
        return false; // pode se usar sem o else pelo fato de que se ele não for true ele
                      // automaticamente vai ir para o else imaginário
    }
}