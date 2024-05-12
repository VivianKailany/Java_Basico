public class Operadores {
    public static void main(String[] args) {
        // Exercícios de concatenação
        String concatenacao = ""; 

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println("Concatenação 1: " + concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println("Concatenação 2: " + concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println("Concatenação 3: " + concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println("Concatenação 4: " + concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println("Concatenação 5: " + concatenacao);

        // Exercício de operador ternário
        byte a = 1;
        byte b = 2;

        String resultado = (a == b) ? "Verdadeiro" : "Falso";
        System.out.println("Operador Ternário: " + resultado); 
        
        // Exercício de operadores aritméticos
        a = 3;
        b = 4;
        int c = 7;
        
        System.out.println("Operadores Aritméticos: " + (a + b) / c);

        // Exercício de operadores de atribuição
        int x = 10;
        x += 5; // x = x + 5
        System.out.println("Operadores de Atribuição  (+=): " + x);
        x -= 3; // x = x - 3
        System.out.println("Operadores de Atribuição (-=): " + x);
        x *= 2; // x = x * 2
        System.out.println("Operadores de Atribuição (*=): " + x);
        x /= 4; // x = x / 4
        System.out.println("Operadores de Atribuição (/=): " + x);
        x %= 2; // x = x % 2
        System.out.println("Operadores de Atribuição (%=): " + x);

        // Exercício de operadores de comparação
        int numero1 = 10;
        int numero2 = 5;
        System.out.println("O número " + numero1 + " é igual ao número " + numero2 + "? " + (numero1 == numero2));
        System.out.println("O número " + numero1 + " é diferente do número " + numero2 + "? " + (numero1 != numero2));
        System.out.println("O número " + numero1 + " é maior que o número " + numero2 + "? " + (numero1 > numero2));
        System.out.println("O número " + numero1 + " é menor que o número " + numero2 + "? " + (numero1 < numero2));
        System.out.println("O número " + numero1 + " é maior ou igual ao número " + numero2 + "? " + (numero1 >= numero2));
        System.out.println("O número " + numero1 + " é menor ou igual ao número " + numero2 + "? " + (numero1 <= numero2));
        // Exercício de operadores lógicos
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println("Operadores Lógicos (AND): " + (verdadeiro && falso));
        System.out.println("Operadores Lógicos (OR): " + (verdadeiro || falso));
        System.out.println("Operadores Lógicos (NOT): " + (!verdadeiro));

        // Exercício de operador de incremento e decremento
        int contador = 0;
        System.out.println("Valor do contador antes do incremento: " + contador);
        contador++;
        System.out.println("Valor do contador após o incremento: " + contador);
        contador--;
        System.out.println("Valor do contador após o decremento: " + contador);
        int novoContador = ++contador;
        System.out.println("Valor do contador após o pré-incremento: " + contador + ", Valor de novoContador: " + novoContador);
        novoContador = contador++;
        System.out.println("Valor do contador após o pós-incremento: " + contador + ", Valor de novoContador: " + novoContador);
    }
}
