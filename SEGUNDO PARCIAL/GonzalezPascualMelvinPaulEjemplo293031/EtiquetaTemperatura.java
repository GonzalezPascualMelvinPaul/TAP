/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melvin
 */
import java.awt.Color;
import javax.swing.*;
//Se crea una nueva clase con herencia de los JLabel
public class EtiquetaTemperatura extends JLabel{
    //Se declara el parametro a utilizar.
    double Temperatura;
    
    //Se crea el constructor inicalizado
    public EtiquetaTemperatura() {
       Temperatura=0;
    }
    //Set y get del Parametro.
    public void setTemperatura(double tem) {
        Temperatura=tem;
        setText(Temperatura+" °C");
    }
    public double getTemperatura(){
        return Temperatura;
    }
    
    //Metodo que nos cambiara el color dependiento el numero que se tenga
    public void mostrarRangoColor(){
        
        setOpaque(true);
        double temp;
        temp=getTemperatura();
        if(temp<0){
            setBackground(Color.blue);
        }else if(temp>=0 && temp<10 ){
            setBackground(Color.cyan);
        }else if(temp>=10 && temp<25){
            setBackground(Color.magenta);
        }else if (temp>=25 && temp<35){
            setBackground(Color.orange);
        }else if(temp>=35){
            setBackground(Color.red);
        }
        
    }
    //Metodo para cambiar la temperatura.
    public void cambiarTemperatura(double temp){
        if(Temperatura<0){
            Temperatura=Temperatura-temp;
        }
        else if(Temperatura>0){
            Temperatura=Temperatura+temp;
        }
    }
}
