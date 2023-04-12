public class While {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10) { // necessário declarar e ter um numero de gasto
            System.out.println(contador);
            // contador = contador + 1; (mesma coisa que esta em baixo, só de outra maneira)
            // linha 7
            // contador += 1; não é comum de se usar
            contador++; // ou ++contador;
        }
        System.out.println(contador);
    }

}
