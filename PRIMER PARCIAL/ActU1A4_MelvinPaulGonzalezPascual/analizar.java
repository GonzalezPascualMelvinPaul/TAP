/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguaje345;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Melvin
 */
public class analizar extends javax.swing.JFrame {

    /**
     * Creates new form analizar
     */
    public analizar() {
        initComponents();
    }
    //Metodo para calcular las operaciones requeridas.
    public void contador(){
        //Condicion que si el cuadro de texto esta vacio, nos regresa un mensaje
    if(txtFrase.getText().length()==0){
         JOptionPane.showMessageDialog(rootPane, "Ingrense Datos");
        }
        else{   
        String cad1=txtFrase.getText();
        int m=0;//Se creo dos contadores
        int n=0;
        etiNdCF.setText("Total de letras: "+cad1.length());//Tamaño de la cadena
        for(int x = 0;x<cad1.length();x++){//Ciclo para recorrer todas las palabras
            //Condicion para las palabras Mayusculas
            if(Character.isUpperCase(cad1.charAt(x))){
            m ++;
            etiMayusculas.setText("Total de letras con mayusculas: "+m);
            }
            //Condicion para las palabras minusculas
            if(Character.isLowerCase(cad1.charAt(x))){
            n ++;
            etiMinisculas.setText("Total de letras con minisculas: "+n);
            }
             }
            cad1=cad1.replaceAll(" ","");//Se eliminan los espacios
            etiNdCFE.setText("Total de letras sin espacio: "+cad1.length());//El tamaño sin espacios
 }}
    //Metodo para validar
 public void verif(KeyEvent evt){
    char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras");
        }
}
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFrase = new javax.swing.JTextField();
        etiMayusculas = new javax.swing.JLabel();
        etiMinisculas = new javax.swing.JLabel();
        etiNdCF = new javax.swing.JLabel();
        etiNdCFE = new javax.swing.JLabel();
        btnAnalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtFrase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFraseKeyTyped(evt);
            }
        });

        etiMayusculas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiMinisculas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiNdCF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiNdCFE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese su texto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiNdCFE, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiNdCF, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiMinisculas, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFrase, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(etiMayusculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiMayusculas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(etiMinisculas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiNdCF, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiNdCFE, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Evento para hacer el conteo
    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
     contador();    
    }//GEN-LAST:event_btnAnalizarActionPerformed
//Metodo para validar.
    private void txtFraseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFraseKeyTyped
        verif(evt);
    }//GEN-LAST:event_txtFraseKeyTyped

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
            java.util.logging.Logger.getLogger(analizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(analizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(analizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(analizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new analizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JLabel etiMayusculas;
    private javax.swing.JLabel etiMinisculas;
    private javax.swing.JLabel etiNdCF;
    private javax.swing.JLabel etiNdCFE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtFrase;
    // End of variables declaration//GEN-END:variables

}