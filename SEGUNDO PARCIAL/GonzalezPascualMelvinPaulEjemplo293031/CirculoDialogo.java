/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Melvin
 */
public final class CirculoDialogo extends javax.swing.JFrame {
    //Se declaran las siguientes componentes.
    JLabel etiRadio;
    JLabel etiResultado;
    JTextField txtRadio;
    JButton btnArea;
    JButton btnPerimetro;
    JButton btnLimpiar;
    //Se crea el nuevo objeto de tipo dialogo
    DialogoPresentacion diag;
    /**
     * Creates new form Ejercicio1Evento
     */
    public CirculoDialogo() {
        initComponents();
        creacionventana();
        dialogoPre();
    }
    public void dialogoPre(){
        //Se declara el nuevo dialogo
        diag=new DialogoPresentacion(null, true);
        diag.setNombrePrograma("Cálculo del Área del Círculo");//Se le asigna el nombre del programa
        diag.setVersion("v 1.0");//Se le asigna la version
        diag.setNombreProgramador("Melvin Paul Gonzalez Pascual");//Se le asigna el nombre del programador.
        //diag.setLocationRelativeTo(diag);
    }
    public void creacionventana() {
        //Se le asigna tamaño y titulo al frame.
        this.setTitle("Círculo");
        this.setSize(350, 200);
        this.setLocationRelativeTo(this);
        //Se crea etiqueta con texto,tamaño y posicion, se agrega al Frame
        etiRadio = new JLabel();
        etiRadio.setText("Radio:");
        etiRadio.setBounds(10, 10, 40, 20);
        this.getContentPane().add(etiRadio);

        //Se crea cuadro de texto con texto,tamaño y posicion, se agrega al Frame
        txtRadio = new JTextField();
        txtRadio.setBounds(55, 10, 75, 23);
        txtRadio.setText("");
        this.getContentPane().add(txtRadio);

        //Se crea boton con texto, tamaño y posicion.
        btnArea = new JButton();
        btnArea.setText("Area");
        btnArea.setBounds(10, 50, 60, 25);
        this.getContentPane().add(btnArea);

        //Se crea boton con texto, tamaño y posicion.    
        btnPerimetro = new JButton();
        btnPerimetro.setText("Perímetro");
        btnPerimetro.setBounds(80, 50, 85, 25);
        this.getContentPane().add(btnPerimetro);

        //Se crea boton con texto, tamaño y posicion.
        btnLimpiar = new JButton();
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBounds(175, 50, 85, 25);
        this.getContentPane().add(btnLimpiar);

        //Se crea etiqueta con texto,tamaño, posicion y color, se agrega al Frame
        etiResultado = new JLabel();
        etiResultado.setText("");
        etiResultado.setBounds(10, 80, 250, 25);
        etiResultado.setOpaque(true);
        etiResultado.setBackground(Color.red);
        this.getContentPane().add(etiResultado);

        //Se crean los metodos con los eventos para los botones.
        btnArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonArea(evt);
            }
        });
        btnPerimetro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonPerimetro(evt);
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BotonLimpiar(evt);
            }
        });
    }

    //Metodo para calcular el area del circulo.
    public void BotonArea(ActionEvent evt) {
        int radio;
        double area;
        radio = Integer.parseInt(txtRadio.getText());
        area = Math.PI * Math.pow(radio, 2);
        etiResultado.setText("" + area);
    }

    //Metodo para calcular el perimetro del circulo.
    public void BotonPerimetro(ActionEvent evt) {
        int radio;
        double perimetro;
        radio = Integer.parseInt(txtRadio.getText());
        perimetro = 2 * Math.PI * radio;
        etiResultado.setText("" + perimetro);
    }
    //Metodo para limpiar los campos de texto.
    public void BotonLimpiar(ActionEvent evt) {
        etiResultado.setText("");
        txtRadio.setText("0");
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
    //Metodo para abrir la ventana de presentacion
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       int x=(int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2 -  diag.getWidth()/2);
       int y=(int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2 -  diag.getHeight()/2);
       diag.setLocation(x,y);
       diag.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(CirculoDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CirculoDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CirculoDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CirculoDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CirculoDialogo().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
