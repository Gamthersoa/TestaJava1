import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestaFor {
	
	public static void main(String[] args) {
		
		
		
		// dentro de for
		// existe dois pontos e virugla
		// no primeiro campo � o contador que apresenta somenta uma vez
		// no segundo contador ele � executado todas as vezes que � a condi��o booleana
		// no terceiro o que deve ser executado no final de cada opera��o
		
		
		for( int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}
		 
		//fora da declara��o no for n�o funciona  
		
		//System.out.println(contador);
		
	}

}
