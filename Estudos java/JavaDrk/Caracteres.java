public class Caracteres {

    public static void main(String[] args) {
        char letra = 'a'; // sempre usar as '' simples as duplas não podem
        System.out.println(letra);

        char valor = 66;
        System.out.println(valor);

        valor = (char) (valor + 1);
        System.out.println(valor);// possivel somar letras

        String palavra = "alura curso online de tecnologia";
        System.out.println(palavra);

        palavra = palavra + 2020;
        System.out.println(palavra);

    }
    
}
