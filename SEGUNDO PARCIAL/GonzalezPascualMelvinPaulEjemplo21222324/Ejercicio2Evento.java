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
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Ejercicio2Evento extends javax.swing.JFrame {
    //Se declaran los componentes a utilizar
    JLabel formula1,formula2,espacio,tiempo,etiVelocidad,velocidad,tiempo2,etiEspacio,velocidad2,espacio2;
    JTextField txtEspacio,txtTiempo,txtVelocidad,txtTiempo2;
    /**
     * Creates new form Ejercicio2Evento
     */
    public Ejercicio2Evento() {
        initComponents();
        creacionventana();
    }
    //Metodo para la creacion de la ventana
    public void creacionventana(){
        //Se le asigna el titulo y tamaño al Frame.
        this.setTitle("Veloidad");
        this.setSize(400,300);
        //Se crea la etiqueta con los siguiente valores.
        formula1=new JLabel();
        formula1.setText(" V = S /t");
        formula1.setBounds(10, 10, 50, 26);
        this.getContentPane().add(formula1);
        
        //Se crea la etiqueta con los siguiente valores.
        espacio=new JLabel();
        espacio.setText("Espacio:");
        espacio.setBounds(10, 50, 50, 26);
        this.getContentPane().add(espacio);
        
        //Se crea el cuadro de texto con los siguiente valores.
        txtEspacio=new JTextField();
        txtEspacio.setBounds(80, 50, 70, 25);
        txtEspacio.setText("0");
        this.getContentPane().add(txtEspacio);
        
        //Se crea la etiqueta con los siguiente valores.
        tiempo=new JLabel();
        tiempo.setText("Tiempo:");
        tiempo.setBounds(10, 100, 50, 26);
        this.getContentPane().add(tiempo);
        
        //Se crea el cuadro de texto con los siguiente valores.
        txtTiempo=new JTextField();
        txtTiempo.setBounds(80, 100, 70, 25);
        txtTiempo.setText("0");
        this.getContentPane().add(txtTiempo);
        
        //Se crea la etiqueta con los siguiente valores.
        velocidad=new JLabel();
        velocidad.setText("Velocidad:");
        velocidad.setBounds(10, 140, 60, 26);
        this.getContentPane().add(velocidad);
        
        //Se crea la etiqueta con los siguiente valores.
        etiVelocidad=new JLabel();
        etiVelocidad.setBounds(80, 140, 70, 25);
        etiVelocidad.setText("");
        etiVelocidad.setOpaque(true);
        etiVelocidad.setBackground(Color.yellow);
        this.getContentPane().add(etiVelocidad);
        
        //Se crea la etiqueta con los siguiente valores.
        formula2=new JLabel();
        formula2.setText(" S = V *t");
        formula2.setBounds(200,10, 50, 26);
        this.getContentPane().add(formula2);
        
        //Se crea la etiqueta con los siguiente valores.
        velocidad2=new JLabel();
        velocidad2.setText("Velocidad:");
        velocidad2.setBounds(200, 50, 60, 26);
        this.getContentPane().add(velocidad2);
        
        //Se crea el cuadro de texto con los siguiente valores.
        txtVelocidad=new JTextField();
        txtVelocidad.setBounds(270, 50, 70, 25);
        txtVelocidad.setText("0");
        this.getContentPane().add(txtVelocidad);
        
        //Se crea la etiqueta con los siguiente valores.
        tiempo2=new JLabel();
        tiempo2.setText("Tiempo:");
        tiempo2.setBounds(200, 100, 50, 26);
        this.getContentPane().add(tiempo2);
        
        //Se crea el cuadro de texto con los siguiente valores.
        txtTiempo2=new JTextField();
        txtTiempo2.setBounds(270, 100, 70, 25);
        txtTiempo2.setText("0");
        this.getContentPane().add(txtTiempo2);
        
        //Se crea la etiqueta con los siguiente valores.
        espacio2=new JLabel();
        espacio2.setText("Velocidad:");
        espacio2.setBounds(200, 140, 60, 26);
        this.getContentPane().add(espacio2);
        
        //Se crea la etiqueta con los siguiente valores.
        etiEspacio=new JLabel();
        etiEspacio.setBounds(270, 140, 70, 25);
        etiEspacio.setText("");
        etiEspacio.setOpaque(true);
        etiEspacio.setBackground(Color.red);
        this.getContentPane().add(etiEspacio);
        
        //Se crean los siguientes eventos para calcular
        txtEspacio.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                botonEspacio(evt);
            }     
        });
        txtTiempo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                botonTiempo(evt);
            }
        });
        txtVelocidad.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                botonVelocidad(evt);
            }     
        });
        txtTiempo2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                botonTiempodos(evt);
            }
        });
    }
    //Metodo para calcular la velocidad
    public void botonEspacio(ActionEvent evt){
        int espacio,tiempo,velocidad;
        espacio=Integer.parseInt(txtEspacio.getText());
        tiempo=Integer.parseInt(txtTiempo.getText());
        velocidad=espacio/tiempo;
        etiVelocidad.setText(""+velocidad);
    }
    //Metodo para calcular la velocidad
    public void botonTiempo(ActionEvent evt){
        int espacio,tiempo,velocidad;
        espacio=Integer.parseInt(txtEspacio.getText());
        tiempo=Integer.parseInt(txtTiempo.getText());
        velocidad=espacio/tiempo;
        etiVelocidad.setText(""+velocidad);
    }
    //Metodo para calcular el espacio.
    public void botonVelocidad(ActionEvent evt){
        int velocidad,tiempo,espacio;
        velocidad=Integer.parseInt(txtVelocidad.getText());
        tiempo=Integer.parseInt(txtTiempo2.getText());
        espacio=velocidad*tiempo;
        etiEspacio.setText(""+espacio);
    }
    //Metodo para calcular el espacio.
    public void botonTiempodos(ActionEvent evt){
        int velocidad,tiempo,espacio;
        velocidad=Integer.parseInt(txtVelocidad.getText());
        tiempo=Integer.parseInt(txtTiempo2.getText());
        espacio=velocidad*tiempo;
        etiEspacio.setText(""+espacio);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
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
            java.util.logging.Logger.getLogger(Ejercicio2Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio2Evento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
