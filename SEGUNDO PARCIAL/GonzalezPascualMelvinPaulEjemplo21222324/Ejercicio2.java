/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajejava;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Melvin
 */
public class Ejercicio2 extends javax.swing.JFrame {
    //Se declaran los componentes a utilizar.
    JLabel provincias;
    JLabel articulos;
    JList provi;
    JComboBox combo;
    JButton calculo;
    JLabel eti;
    /**
     * Creates new form Ejercicio2
     */
    public Ejercicio2() {
        initComponents();
        creacionventana();//Se crea el metodo
        //JList provincias;
    }
    
    public void creacionventana(){
        //Se centra, asigna el titulo y tamaño al Frame.
        this.setTitle("Ejercicio 2");
        this.setSize(300,300);
        this.setLocationRelativeTo(this);
        
        //Se crea la etiqueta con los siguiente parametros.
        provincias= new JLabel();
        provincias.setText("PROVINCIAS");
        provincias.setBounds(10,5, 100, 30);
        this.getContentPane().add(provincias);
        
        //Se crea la etiqueta con los siguiente parametros.
        articulos= new JLabel();
        articulos.setText("TIPO DE ARTÍCULOS");
        articulos.setBounds(130,5, 120, 30);
        this.getContentPane().add(articulos);
        
        //Se crea un arreglo con los datos que se utlizaran.
        String [] prov={"HUELVA","SEVILLA","CADIZ","MALAGA","CORDOBA","JAEN","GRANADA","ALMERIA"};
        //Se creaun JList con los datos del arreglo y ademas de tamaño y posicion.
        provi=new JList(prov);
        provi.setBounds(10,35,100,160);
        this.getContentPane().add(provi);
        
        //Se crea un arreglo con los datos que se utlizaran.
        String [] c={"LÍQUIDOS","MAQUINARIA","PELIGROSIDAD 1","PELIGROSDAD 2","PIEZAS"};
        //Se crea un combox con los datos y ademas de tamaño y posicion
        combo= new JComboBox(c);
        combo.setBounds(130,35,120,30);
        this.getContentPane().add(combo);
        
        //Se crea un nuevo boton con los siguientes parametros.
        calculo=new JButton();
        calculo.setBounds(10,210,110,25);
        calculo.setText("Cálculo Precio");
        this.getContentPane().add(calculo);
        
        //Se crea un etiqueta que tendra color.
        eti=new JLabel();
        eti.setText("");
        eti.setBounds(130,210,120,25);
        eti.setOpaque(true);
        eti.setBackground(Color.cyan);
        this.getContentPane().add(eti);
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("uncheckexd")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
