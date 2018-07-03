/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class CacaPalavra extends javax.swing.JFrame {

    /**
     * Creates new form CacaPalavra
     */
    public CacaPalavra() {
        initComponents();
        busca.setVisible(false);
        buscar.setVisible(false);
        b.setVisible(false);
        btnDesistir.setVisible(false);
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comeca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        l = new javax.swing.JTextArea();
        busca = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        resul = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        btnDesistir = new javax.swing.JButton();
        lvl = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela De Jogo");

        comeca.setText("Come�ar");
        comeca.setMaximumSize(new java.awt.Dimension(75, 10));
        comeca.setMinimumSize(new java.awt.Dimension(75, 10));
        comeca.setPreferredSize(new java.awt.Dimension(75, 10));
        comeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comecaActionPerformed(evt);
            }
        });

        l.setEditable(false);
        l.setColumns(20);
        l.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        l.setRows(5);
        l.setText("Aguardando ca�a-palavras...");
        jScrollPane1.setViewportView(l);

        busca.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        resul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        b.setFont(new java.awt.Font("Norasi", 0, 14)); // NOI18N
        b.setText("Sua busca:");

        btnDesistir.setText("Desistir");

        lvl.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lvl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F�cil", "M�dio", "Dif�cil" }));
        lvl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDesistir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comeca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resul, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvl, 0, 212, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buscar)
                            .addComponent(btnDesistir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(comeca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lvl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(resul, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    
    private final char[][] m = LeitorMatriz.recuperaMatriz("matriz.txt");
    
    private void imprimeMatriz() {
        l.setText("");
	for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[1].length; j++) {
                    String txtAnt = l.getText();
                    l.setText(txtAnt.concat(" " + Character.toString(m[i][j]) + " "));
                }
                l.setText(l.getText().concat("\n"));
            }
    }
	
    private static String converteLinhaString(char[] linha) {
	String linhaS = "";
		
	for (int i = 0; i < linha.length; i++) {
		linhaS = linhaS.concat(Character.toString(linha[i]));
	}
		
	return linhaS;
    }
     private static String converteColunaString(char[][] m,int coluna){
        String colunaS = "";
        
            for (int i = 0; i < m.length; i++) {
                colunaS = colunaS.concat(Character.toString(m[i][coluna]));     
            }
        return colunaS;
    }
	
    private static String insereSituacao(int lComeco, int cComeco, int lFim, int cFim) {
	StringBuilder sb = new StringBuilder();
		
	sb.append("ACHOU ");
	sb.append(lComeco + " ");
	sb.append(cComeco + " ");
	sb.append(lFim + " ");
	sb.append(cFim);
		
	return sb.toString();
    }
	
    private static String linhaNormal(char[][] m, String palavra) {
	String situacao = "NAO ACHOU";
	for (int i = 0; i < m.length; i++) {
		String palavraStr = converteLinhaString(m[i]);
		if(palavraStr.contains(palavra.toUpperCase())) {
			int cComeco = palavraStr.indexOf(palavra.toUpperCase());
			situacao = insereSituacao(i, cComeco, i, cComeco + palavra.length()-1);
			break;
		}
	}
		
	return situacao;
    }
	
    private static String linhaInvertida(char[][] m, String palavra) {
	StringBuilder sb = new StringBuilder();
	String situacao = "NAO ACHOU";
		
	sb.append(palavra);
	palavra = sb.reverse().toString();
		
	for (int i = 0; i < m.length; i++) {
		String palavraStr = converteLinhaString(m[i]);
		if(palavraStr.contains(palavra.toUpperCase())) {
			int cComeco = palavraStr.indexOf(palavra.toUpperCase());
			situacao = insereSituacao(i, cComeco + palavra.length()-1, i, cComeco); 
			break;
		}
	}
		
	return situacao;
    }
    
    private static String colunaNormal(char[][] m, String palavra){
	String situacao = "NAO ACHOU";
		
		
	for (int i = 0; i < m[i].length; i++) {
		String palavraStr = converteColunaString(m, i);
		if(palavraStr.contains(palavra.toUpperCase())) {
			int cComeco = palavraStr.indexOf(palavra.toUpperCase());
			situacao = insereSituacao(cComeco, i , cComeco + palavra.length()-1, i); 
			break;
		}
            }
		
	return situacao;
    }
    
    private static String colunaInvertida(char[][] m, String palavra){
       StringBuilder sb = new StringBuilder();
	String situacao = "NAO ACHOU";
		
	sb.append(palavra);
	palavra = sb.reverse().toString();
		
	for (int i = 0; i < m[i].length; i++) {
		String palavraStr = converteColunaString(m, i);
		if(palavraStr.contains(palavra.toUpperCase())) {
			int cComeco = palavraStr.indexOf(palavra.toUpperCase());
			situacao = insereSituacao(cComeco + palavra.length()-1, i, cComeco, i); 
			break;
		}
            }
		
	return situacao;
    }
        
    private void comecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comecaActionPerformed
            if("Aguardando ca�a-palavras...".equals(l.getText())){
            imprimeMatriz();
            comeca.setVisible(false);
            lvl.setVisible(false);
            
            busca.setVisible(true);
            buscar.setVisible(true);
            b.setVisible(true);
            btnDesistir.setVisible(true);
            
        }    
    }//GEN-LAST:event_comecaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(linhaNormal(m, busca.getText()).length() > 9)
            resul.setText(linhaNormal(m, busca.getText()));
        else if(linhaInvertida(m, busca.getText()).length() > 9)
            resul.setText(linhaInvertida(m, busca.getText()));
        else if(colunaNormal(m, busca.getText()).length() > 9)
            resul.setText(colunaNormal(m, busca.getText()));
        else if(colunaInvertida(m, busca.getText()).length() > 9)
            resul.setText(colunaInvertida(m, busca.getText()));
        else if (diagonalNormal(m, busca.getText()).length() > 9)
            resul.setText(diagonalNormal(m, busca.getText()));
        else if (diagonalNormal(m, busca.getText()).length() > 9)
            resul.setText(diagonalNormal(m, busca.getText()));
        else
            resul.setText("N�O ACHOU");
        /*String a = "oi";
        String ver = "<html><font color=RED> " + a + " </font></html>";
        resul.setText(ver);*/
    }//GEN-LAST:event_buscarActionPerformed

    private void lvlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lvlActionPerformed
    
    private static void mudaCor(String palavra){
        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CacaPalavra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CacaPalavra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CacaPalavra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CacaPalavra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CacaPalavra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b;
    private javax.swing.JButton btnDesistir;
    private javax.swing.JTextField busca;
    private javax.swing.JButton buscar;
    private javax.swing.JButton comeca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea l;
    private javax.swing.JComboBox<String> lvl;
    private javax.swing.JLabel resul;
    // End of variables declaration//GEN-END:variables
}
