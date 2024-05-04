public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 1412.00;
        char nome = 'V';
        short data = 2024;
        byte idade = 21;
        double valor = 252177458.5874;
        final float PI = 3.14f;
        long numeroGrande = 945742584236985324L;
        boolean verdadeiro = true;
        
        System.out.printf("%s, o salário mínimo em %d é de R$ %.2f%n", nome, data, salarioMinimo);
        System.out.printf("%s tem %d anos.%n", nome, idade);
        System.out.printf("Valor: %.2f, Número grande: %d, PI: %.2f, Verdadeiro: %b%n", valor, numeroGrande, PI, verdadeiro);
    }
}
