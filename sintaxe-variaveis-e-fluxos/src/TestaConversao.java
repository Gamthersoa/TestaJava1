
public class TestaConversao {

	public static void main(String[] args) { 
	
		double salario = 1270.50;
		int valor = (int) salario;
		
		System.out.println(valor);
		
		
		//int -  guarda até 2 milhões;
		//long - numeroGrande = 32343543453453321243;
		//short - numeroPequeno = valores numericos pequenos;
		//byte - numeroMenosAinda = vai até o número 127;
		//float pontoFlutuante = numero flutuante;
		
		
		float salarioPrimeiroMes = (float)1270.50;
		int Mes = (int)12;
		double total = salarioPrimeiroMes / Mes;
		
		System.out.println(total);
		
		//byte	----	Impl.	(char)	Impl.	Impl.	Impl.	Impl.
		//short	(byte)	----	(char)	Impl.	Impl.	Impl.	Impl.
		//char	(byte)	(short)	----	Impl.	Impl.	Impl.	Impl.
		//int	(byte)	(short)	(char)	----	Impl.	Impl.	Impl.
		//long	(byte)	(short)	(char)	(int)	----	Impl.	Impl.
		//float	(byte)	(short)	(char)	(int)	(long)	----	Impl.
		//double	(byte)	(short)	(char)	(int)	(long)	(float)	----
		
		
		//boolean	1 bit
		//byte	1 byte
		//short	2 bytes
		//char	2 bytes
		//int	4 bytes
		//float	4 bytes
		//long	8 bytes
		//double	8 bytes
		
	}
}
