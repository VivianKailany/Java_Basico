public class MeuNome {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "vivian";
        String segundoNome = "kailany";
        String nomeCompleto = nomeCompleto ( primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
