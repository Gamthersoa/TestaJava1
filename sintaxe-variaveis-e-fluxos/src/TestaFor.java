import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestaFor {
	
	public static void main(String[] args) {
		
		
		
		// dentro de for
		// existe dois pontos e virugla
		// no primeiro campo é o contador que apresenta somenta uma vez
		// no segundo contador ele é executado todas as vezes que é a condição booleana
		// no terceiro o que deve ser executado no final de cada operação
		
		
		for( int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}
		 
		//fora da declaração no for não funciona  
		
		//System.out.println(contador);
		
	}

}
