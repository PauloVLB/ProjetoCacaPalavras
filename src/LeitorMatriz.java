import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeitorMatriz {
	
	public static char[][] recuperaMatriz (final String nomeArquivo) {

		BufferedReader br = null;
		final String DELIMITADOR = " ";
		
		char[][] matriz = new char[25][14];

		try {

			String linha;
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream(nomeArquivo)));

			int linhaMatriz = 0;
			
			while ((linha = br.readLine()) != null)
			{
				String[] r = linha.split(DELIMITADOR);
				
				for (int j = 0; j < r.length; j++) {
					matriz[linhaMatriz][j] = r[j].charAt(0);
				}
				
				linhaMatriz++;
			}
		}
		catch (FileNotFoundException ex2) {
			System.out.println(ex2.getMessage());
		} catch (IOException ex3) {
			System.out.println(ex3.getMessage());
		}
		finally {
			if (br != null) {
				try {
					br.close(); //tenta fechar o arquivo
				} catch (IOException e) {
					System.out.println("Erro ao tentar fechar o arquivo. Motivo: " + e.getMessage());
				}
			}
		}
		return matriz;
	}

}
