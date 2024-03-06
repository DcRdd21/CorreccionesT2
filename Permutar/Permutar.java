/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Permutar;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author matmense
 */
public class Permutar extends javax.swing.JFrame {

    /**
     * Creates new form Permutar
     */
    public Permutar() {
        initComponents();
        this.jTextField1.setToolTipText("Primera posicion la 0.");
        this.jTextField2.setToolTipText("Primera posicion la 0.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Permutar filas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Permutar Columnas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Origen:");

        jLabel2.setText("Destino:");
        jLabel2.setToolTipText("");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setText("Llenar Matriz");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jTextField2)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Permutar Filas
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(matriz==null){
            JOptionPane.showMessageDialog(this, "Debes crear primero la matriz.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(this.jTextField1.getText().isEmpty() || this.jTextField2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduce origen y destino.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int origen=Integer.parseInt(this.jTextField1.getText());
        int destino=Integer.parseInt(this.jTextField2.getText());
        
        if ((origen < 0 || origen > matriz.length) || (destino < 0 || destino > matriz.length)) {
            JOptionPane.showMessageDialog(this, "Origen o Destino fuera de rango.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        this.jTextArea1.append("Matriz Permutada." + "\n");
        this.jTextArea1.append("*********************");
        permutarFilas(origen, destino);
        imprimirMatriz();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    //Metodo para permutar filas
    private void permutarFilas(int origen, int destino){
   /*     for (int j = 0; j < matriz[0].length; j++) {
            int aux=matriz[destino][j];
            matriz[destino][j]=matriz[origen][j];
            matriz[origen][j]=aux;
    */   // }
        int numColumnas=matriz[0].length;
        int[]aux=Arrays.copyOf(matriz[destino],numColumnas);
        matriz[destino]=Arrays.copyOf(matriz[origen],numColumnas);
        matriz[origen]=Arrays.copyOf(aux,numColumnas);

    }
    
    private void permutarColumnas(int origen, int destino){
        for (int i = 0; i < matriz.length; i++) {
            int aux=matriz[i][destino];
            matriz[i][destino]=matriz[i][origen];
            matriz[i][origen]=aux;
        }
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //limpiamos el area de texto
        this.jTextArea1.setText("");
        //generamos dimension aleatoria entre 1 y 9
        Random r=new Random();
        int filas=r.nextInt(1,10);
        int col=r.nextInt(1,10);
        //creamos matriz de esa dimension
        matriz = new int [filas][col];
        //llenamos la matriz aleatoriamente con valores de 1 a 100
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j]=r.nextInt(1,101);
                
            }
            
        }
        //mostramos la matriz
        JOptionPane.showMessageDialog(this, "Matriz" + filas + "X" + col);
        imprimirMatriz();
    }//GEN-LAST:event_jButton3ActionPerformed

    //Permutar Columnas
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(matriz==null){
            JOptionPane.showMessageDialog(this, "Debes crear primero la matriz.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(this.jTextField1.getText().isEmpty() || this.jTextField2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Introduce origen y destino.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int origen=Integer.parseInt(this.jTextField1.getText());
        int destino=Integer.parseInt(this.jTextField2.getText());
        
        if ((origen < 0 || origen > matriz[0].length) || (destino < 0 || destino > matriz[0].length)) {
            JOptionPane.showMessageDialog(this, "Origen o Destino fuera de rango.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        this.jTextArea1.append("Matriz Permutada." + "\n");
        this.jTextArea1.append("*********************");
        permutarColumnas(origen, destino);
        imprimirMatriz();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void imprimirMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                this.jTextArea1.append(matriz[i][j] + " ");
                
            }
            this.jTextArea1.append("\n");
        }
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Permutar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Permutar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Permutar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Permutar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Permutar().setVisible(true);
            }
        });
    }

    int matriz[][];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
