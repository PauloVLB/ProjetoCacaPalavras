/*
	SUGESTÕES E LEMBRETES: 
	* Para retornar as posições das palavras, usar indexOf() e length();
	* Fazer função paraString para linha;
	* Retornar uma String para ser analizada posteriormente (ACHOU, indexOf(), length());
	* Matar Douglas;

*/
import java.util.Scanner;

public class ProgramaCacaPalavra {

	static void imprimeMatriz(char[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.format(" %s ", m[i][j]);
			}
			System.out.println();
		}
	}
	
	static String paraString(char[] linha) {
		String linhaS = "";
		
		for (int i = 0; i < linha.length; i++) {
			linhaS = linhaS.concat(Character.toString(linha[i]));
		}
		
		return linhaS;
	}
	
	static boolean linhaNormal(char[][] m, String palavra) {
		for (int i = 0; i < m.length; i++) {
			if(paraString(m[i]).contains(palavra.toUpperCase())) return true;
		}
		
		return false;
	}
	
	static boolean linhaNormalInvertida(char[][] m, String palavra) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(palavra);
		palavra = sb.reverse().toString();
		
		for (int i = 0; i < m.length; i++) {
			if(paraString(m[i]).contains(palavra.toUpperCase())) return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[][] matriz = LeitorMatriz.recuperaMatriz("matriz.txt");	
		
		imprimeMatriz(matriz);
		
		System.out.print("\n\nInsira sua busca: ");
		
		System.out.println(linhaNormalInvertida(matriz, in.next()));
		
	}

}
