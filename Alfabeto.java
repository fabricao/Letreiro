package desafios.banks.desafio02;

public enum Alfabeto {

	A(1,'A'), B(2, 'B'), C(3, 'C'), D(4, 'D'), E(5, 'E'), F(6, 'F'), G(7, 'G'), H(8, 'H'), I(9, 'I'), J(10, 'J'), 
	K(11, 'K'), L(12, 'L'), M(13, 'M'), N(14, 'N'), O(15, 'O'), P(16, 'P'), Q(17, 'Q'), R(18, 'R'), S(19, 'S'), T(20, 'T'), 
	U(21,'U'), V(22, 'V'), W(23, 'W'), X(24, 'X'), Y(25, 'Y'), Z(26, 'Z'); 
	
	private int indice;
	private char chr;
	
	
	private Alfabeto(int indice, char chr) {
		this.indice = indice;
		this.chr = chr;
	}

	public int getindice() {
		return indice;
	}
	
	public char getChar() {
		return chr;
	}
	
//METODO QUE COMPARA A LETRA(PARAMETRO) COM OS VALORES DE TODOS AS CONSTANTES DO ALFABETO
	public static Alfabeto getAlfabetoByChar(char chr) {
		
		Alfabeto alfabet = null;
		
		for(Alfabeto alfabeto: Alfabeto.values()) {
			 if(String.valueOf(chr).equals(String.valueOf(alfabeto.getChar()).toLowerCase())) {
				 alfabet = alfabeto;
			 }
		}
		
		return alfabet;
	} 
	
	
}
