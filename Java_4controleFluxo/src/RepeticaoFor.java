/* Escada
    #
   ##
  ###
 ####
##### */
public class RepeticaoFor {
    public static void main(String[] args) {
        int altura = 5; // Altura da escada
        
        for (int linha = 1; linha <= altura; linha++) {
            // Imprime espaços em branco à esquerda da escada
            for (int espacos = 1; espacos <= altura - linha; espacos++) {
                System.out.print(" ");
            }
            
            // Imprime caracteres '#' da escada
            for (int escada = 1; escada <= linha; escada++) {
                System.out.print("#");
            }
            
            
            // Quebra de linha para começar a próxima linha da escada
            System.out.println();
        }
    }
}
