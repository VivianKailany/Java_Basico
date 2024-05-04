package vivian.primeiroPacote;

public class MeuNome {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "vivian";
        String segundoNome = "kailany";
        String nomeCompleto = juntarNome(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String juntarNome(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
