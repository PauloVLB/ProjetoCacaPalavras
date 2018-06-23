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
	
	static String insereSituacao(String sit, int lComeco, int cComeco, int lFim, int cFim) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("ACHOU ");
		sb.append(lComeco + " ");
		sb.append(cComeco + " ");
		sb.append(lFim + " ");
		sb.append(cFim);
		
		return sb.toString();
	}
	
	static String linhaNormal(char[][] m, String palavra) {
		String situacao = "NAO ACHOU";
		for (int i = 0; i < m.length; i++) {
			String palavraStr = paraString(m[i]);
			if(palavraStr.contains(palavra.toUpperCase())) {
				int cComeco = palavraStr.indexOf(palavra.toUpperCase());
				situacao = insereSituacao(situacao, i, cComeco, i, cComeco + palavra.length()-1);
				break;
			}
		}
		
		return situacao;
	}
	
	static String linhaNormalInvertida(char[][] m, String palavra) {
		StringBuilder sb = new StringBuilder();
		String situacao = "NAO ACHOU";
		
		sb.append(palavra);
		palavra = sb.reverse().toString();
		
		for (int i = 0; i < m.length; i++) {
			String palavraStr = paraString(m[i]);
			if(palavraStr.contains(palavra.toUpperCase())) {
				int cComeco = palavraStr.indexOf(palavra.toUpperCase());
				situacao = insereSituacao(situacao, i, cComeco + palavra.length()-1, i, cComeco);
				break;
			}
		}
		
		return situacao;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[][] matriz = LeitorMatriz.recuperaMatriz("matriz.txt");	
		
		imprimeMatriz(matriz);
		
		System.out.print("\n\nInsira sua busca: ");
		System.out.println(linhaNormalInvertida(matriz, in.next()));
		
	}

}
