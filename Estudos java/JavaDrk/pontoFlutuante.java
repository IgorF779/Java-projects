public class pontoFlutuante {
    public static void main(String[] args) {
        double salario;
        salario = 2962.50;
        System.out.println("Meu salario é " + salario);

        double idade = 37;
        System.out.println(idade);

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        int outraDivisao = 5 / 2;
        System.out.println(outraDivisao); //Usando o int o valor sai aproximado doque deveria ser 

        double novaTentativa = 5.0 / 2; // usando double ele sai aproximado mas ainda sim com .0 
        // já usando o 5.0 ou qualquer numero com .0 ficaria o resultado sem aproximar
        
        System.out.println(novaTentativa);

        System.out.println(idade + novaTentativa);
    }

}
