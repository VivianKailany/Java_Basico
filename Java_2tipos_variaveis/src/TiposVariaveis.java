/**
 * Este programa demonstra o uso de diferentes tipos de variáveis e constantes em Java.
 * Ele exibe informações sobre variáveis de diferentes tipos, incluindo uma constante.
 */
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Declaração e inicialização das variáveis
        double salario = 1412.00;  // Exemplo de salário
        char inicial = 'V';    // Exemplo de inicial de nome
        short ano = 2024;      // Exemplo de ano
        byte anos = 21;                 // Exemplo de idade
        double valor = 252177458.5874;  // Exemplo de valor monetário
        final float PI = 3.14f;          // Valor aproximado de PI (constante)
        long numero = 945742584236985324L; // Exemplo de número grande
        boolean verdade = true;     // Exemplo de variável booleana
        
        // Exibição das informações
        System.out.println("Este programa demonstra o uso de diferentes tipos de variáveis e constantes em Java.");
        System.out.println("Ele exibe informações sobre variáveis de diferentes tipos, incluindo uma constante.");
        System.out.println();
        System.out.println("=== Informações ===");
        System.out.println("Salário: R$" + salario);
        System.out.println("Inicial do nome: " + inicial);
        System.out.println("Ano: " + ano);
        System.out.println("Idade: " + anos + " anos");
        System.out.println("Valor: R$" + valor);
        System.out.println("Número: " + numero);
        System.out.println("Valor de PI (constante): " + PI);
        System.out.println("A afirmação é verdadeira? " + verdade);
    }
}
