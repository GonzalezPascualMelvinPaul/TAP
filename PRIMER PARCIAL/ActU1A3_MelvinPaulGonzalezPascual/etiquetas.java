/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajejava;

/**
 *
 * @author Melvin
 */
public class etiquetas extends javax.swing.JFrame {

    /**
     * Creates new form etiquetas
     */
    public etiquetas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiUna = new javax.swing.JLabel();
        etiCinco = new javax.swing.JLabel();
        etiDiez = new javax.swing.JLabel();
        etiDos = new javax.swing.JLabel();
        etiSeis = new javax.swing.JLabel();
        etiSiete = new javax.swing.JLabel();
        etiTres = new javax.swing.JLabel();
        etiOcho = new javax.swing.JLabel();
        etiNueve = new javax.swing.JLabel();
        etiCuatro = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiUna.setText("0");
        etiUna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiUnaMouseEntered(evt);
            }
        });

        etiCinco.setText("4");
        etiCinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiCincoMouseEntered(evt);
            }
        });

        etiDiez.setText("9");
        etiDiez.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiDiezMouseEntered(evt);
            }
        });

        etiDos.setText("1");
        etiDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiDosMouseEntered(evt);
            }
        });

        etiSeis.setText("5");
        etiSeis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiSeisMouseEntered(evt);
            }
        });

        etiSiete.setText("6");
        etiSiete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiSieteMouseEntered(evt);
            }
        });

        etiTres.setText("2");
        etiTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiTresMouseEntered(evt);
            }
        });

        etiOcho.setText("7");
        etiOcho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiOchoMouseEntered(evt);
            }
        });

        etiNueve.setText("8");
        etiNueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiNueveMouseEntered(evt);
            }
        });

        etiCuatro.setText("3");
        etiCuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiCuatroMouseEntered(evt);
            }
        });

        txtNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtNumeroMouseReleased(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNumero)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiUna, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(etiDos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(etiTres, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiDiez, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiDos)
                    .addComponent(etiUna)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiTres)
                        .addComponent(etiCuatro)
                        .addComponent(etiCinco)
                        .addComponent(etiSeis)
                        .addComponent(etiSiete)
                        .addComponent(etiOcho)
                        .addComponent(etiNueve)
                        .addComponent(etiDiez)))
                .addGap(18, 18, 18)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroMouseReleased
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroMouseReleased
    //Metodos para agregar los numeros a la etiqueta.
    private void etiUnaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiUnaMouseEntered
        txtNumero.setText(txtNumero.getText()+etiUna.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_etiUnaMouseEntered

    private void etiDosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiDosMouseEntered
       txtNumero.setText(txtNumero.getText()+etiDos.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_etiDosMouseEntered

    private void etiTresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiTresMouseEntered
        txtNumero.setText(txtNumero.getText()+etiTres.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_etiTresMouseEntered

    private void etiCuatroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiCuatroMouseEntered
        txtNumero.setText(txtNumero.getText()+etiCuatro.getText());
    }//GEN-LAST:event_etiCuatroMouseEntered

    private void etiCincoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiCincoMouseEntered
        txtNumero.setText(txtNumero.getText()+etiCinco.getText());
    }//GEN-LAST:event_etiCincoMouseEntered

    private void etiSeisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiSeisMouseEntered
        txtNumero.setText(txtNumero.getText()+etiSeis.getText());
    }//GEN-LAST:event_etiSeisMouseEntered

    private void etiSieteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiSieteMouseEntered
        txtNumero.setText(txtNumero.getText()+etiSiete.getText());
    }//GEN-LAST:event_etiSieteMouseEntered

    private void etiOchoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiOchoMouseEntered
        txtNumero.setText(txtNumero.getText()+etiOcho.getText());
    }//GEN-LAST:event_etiOchoMouseEntered

    private void etiNueveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiNueveMouseEntered
        txtNumero.setText(txtNumero.getText()+etiNueve.getText());
    }//GEN-LAST:event_etiNueveMouseEntered

    private void etiDiezMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiDiezMouseEntered
        txtNumero.setText(txtNumero.getText()+etiDiez.getText());
    }//GEN-LAST:event_etiDiezMouseEntered
//Evento el cual borra el contenido del campo de texto.
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
       txtNumero.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(etiquetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(etiquetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(etiquetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(etiquetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new etiquetas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JLabel etiCinco;
    private javax.swing.JLabel etiCuatro;
    private javax.swing.JLabel etiDiez;
    private javax.swing.JLabel etiDos;
    private javax.swing.JLabel etiNueve;
    private javax.swing.JLabel etiOcho;
    private javax.swing.JLabel etiSeis;
    private javax.swing.JLabel etiSiete;
    private javax.swing.JLabel etiTres;
    private javax.swing.JLabel etiUna;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}