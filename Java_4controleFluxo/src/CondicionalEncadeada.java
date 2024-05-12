public class CondicionalEncadeada {
    public static void main(String[] args) {
        int nota = 8;
        
        if (nota > 5 && nota <= 7 ){
            System.out.println("recuperação");
        }else if(nota > 7){
            System.out.println("aprovado");

        }else{
            System.out.println("reprovado");
        }
    }
}
