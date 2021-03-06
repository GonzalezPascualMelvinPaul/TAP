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
public final class Ejercicio1 extends javax.swing.JFrame {
    //Se declaran los componentes a utilizar
    JLabel espacio;
    JTextField txtEspacio;
    JLabel tiempo;
    JTextField txtTiempo;
    JLabel velocidad;
    JLabel resultado;
    JButton btncalcular;
    JButton btnlimpiar;
    JButton btninfo;
    JToggleButton tgbmetros;
    JSlider slider;

    /**
     * Creates new form Ejercicio1
     */
    public Ejercicio1() {
        initComponents();
        creacionventana();//Se inicializa el metodo.
    }
    //Se crea un metodo donde se hara los componentes.
    public void creacionventana() {
        //Se le asigna el titulo a la ventana
        this.setTitle("Ejercicio 1");
        this.setSize(350, 400);//Tamaño del frame
        this.setLocationRelativeTo(this);//Que se inicalize en el centro
        
        //Se crea la etiqueta
        espacio = new JLabel();
        espacio.setText("Espacio:");//Se le asigna el texto
        espacio.setBounds(10, 35, 100, 30);//Tamaño y posicion
        this.getContentPane().add(espacio);//Se agrega al frame

        txtEspacio = new JTextField();//Se crea un  cuadro de texto
        txtEspacio.setText("0");//Se le asigna el valor
        txtEspacio.setBounds(10, 60, 100, 25);//Tamaño y posicion
        this.getContentPane().add(txtEspacio);//Se agrega al Frame

        tiempo = new JLabel();//Se crea la nueva etiqueta
        tiempo.setText("Tiempo:");//Se le asigna el texto
        tiempo.setBounds(150, 35, 100, 30);//Tamaño y posicion 
        this.getContentPane().add(tiempo);//Se agrega al Frame

        txtTiempo = new JTextField();//Se crea una nueva etiqueta
        txtTiempo.setText("0");//Texto de la etiqueta
        txtTiempo.setBounds(150, 60, 100, 25);//Tamaño y posicion
        this.getContentPane().add(txtTiempo);// Se agrega al Frame

        velocidad = new JLabel();//Nueva etiqueta
        velocidad.setText("Velocidad:");//Texto de la etiqueta
        velocidad.setBounds(10, 100, 100, 18);//Tamaño y posicion
        this.getContentPane().add(velocidad);//Se agrega al Frame

        resultado = new JLabel();//Se declara una nueva etiqueta
        resultado.setText("RESULTADO");//Se le asigna el texto.
        resultado.setBounds(150, 100, 75, 18);//Se le asigna el tamaño y la posicion
        resultado.setOpaque(true);//Se le activa la opacidad para poder rellenar de un color
        resultado.setBackground(Color.GREEN);//Se le agrega el color verde.
        this.getContentPane().add(resultado);//Se agrega al Frame

        btncalcular = new JButton();//Se crea un nuevo boton
        btncalcular.setText("CALCULAR");//Se le agrega el texto al boton.
        btncalcular.setBounds(10, 150, 120, 25);//Se define el tamaño y la posicion
        this.getContentPane().add(btncalcular);//Se agrega al Frame

        btnlimpiar = new JButton();//Se crea un nuevo boton
        btnlimpiar.setText("CALCULAR");//Se le asigna el texto
        btnlimpiar.setBounds(150, 150, 120, 25);//Se le asigna el tamaño y la posicion
        this.getContentPane().add(btnlimpiar);//Se agrega al Frame

        btninfo = new JButton();//Se crea un nuevo boton
        btninfo.setText("?");//Se le asigna el nombre
        btninfo.setBounds(275, 150, 35, 25);//Tamaño y posicion
        this.getContentPane().add(btninfo);//Se agrega al Frame

        tgbmetros = new JToggleButton();//Se agrega un ToggoleButton
        tgbmetros.setText("metros/seg");//Se le asigna el nombre
        tgbmetros.setBounds(10, 200, 130, 25);//Tamaño y posicion
        tgbmetros.setOpaque(true);//Sea activa lo opacidad
        tgbmetros.setBackground(Color.cyan);//Se le da color
        tgbmetros.setSelected(true);//Que inicialize pulsado
        this.getContentPane().add(tgbmetros);//Se agrega al Frame

        slider = new JSlider();//Se crea un Slider
        slider.setBounds(15, 230, 220, 25);//Se le asigna el tamaño y la posicion
        slider.setMinimum(0);//Valor minimo
        slider.setMaximum(100);//Valor maximo
        slider.setValue(20);//Inicializacion
        slider.setPaintTicks(true);//Que se vea las divisiones
        slider.setMinorTickSpacing(5);//De cuanto en cuanto
        this.getContentPane().add(slider);//Se agrega al Frame
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
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
