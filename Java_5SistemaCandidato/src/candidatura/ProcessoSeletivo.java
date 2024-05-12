package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	public static void main(String[] args) {

		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		for (String candidato : candidatos){
			case4(candidato);
		}
		//salario base maior que salario pretendido
		case1(2000.0, 1900.0);
		
		//salario base igual que salario pretendido
		case1(2000.0, 2000.0);
		
		//salario base igual que salario pretendido
		case1(1900.0, 2000.0);

		case2();


	}
	static void case1(double salarioBase, double salarioPretendido) {
		
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}
		else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}
		else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
	static void case2 (){
		double salarioBase = 2000.0;
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		
		int totalSelecionados = 0;
		int proximoCandidato = 0;
		while(totalSelecionados < 5 && proximoCandidato < candidatos.length ){
			String candidato = candidatos[proximoCandidato++];
			double valorPretendido = valorPretendido();
			System.out.println ("O candidato " + candidato + " pediu o valor " + valorPretendido);
			if(valorPretendido > salarioBase) {
				System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");
				
			}else {
				System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
				totalSelecionados++;
				
			}
		}
	}
	static void case4(String candidato){
		int tentativasRealizadas = 1;
		boolean atendeu = false;
		boolean continuaLigando = true;
		do{
			atendeu = atender();
			continuaLigando  = !atendeu;
			if (continuaLigando){
				tentativasRealizadas++;
			}else{
				System.out.println("Contato realizado");
			}
		if (atendeu){
			System.out.println(" O candidato " + candidato + " atendeu na tentativa " + tentativasRealizadas);

		}else{
			System.out.println("Candidato " + candidato + " Perdeu a vaga");
		}

		}while(continuaLigando && tentativasRealizadas < 3);
		
		
	}


	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }
   //método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
}
