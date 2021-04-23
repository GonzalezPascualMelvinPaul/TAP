/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melvin
 */
//Se crea un objeto de tipo Rectangulo para ocuparlo a continuacion.
public class Rectangulo {
    //Se declara los parametros
    double Base;
    double Altura;
    
    //Se le asigna los valores en el constructor
    public Rectangulo() {
      Base = 100.00;
      Altura = 50.00;
    }
    //Metedos set para cada parametro
    public void setBase(double Base) {
        this.Base = Base;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    //Metodo get Para los paremetros
    public double getBase() {
        return Base;
    }

    public double getAltura() {
        return Altura;
    }
    //Se crean nuevos metodos para calcular area y perimetro.
    public double getArea(){
    double area;
    area=Base*Altura;
    return area;
    }
    
    public double getPerimetro(){
    double perimetro;
    perimetro=(2*Altura)+(2*Base);
    return perimetro;
    }
    //Metodo para cuadrar
    public void cuadrar(){
    Altura=Base;
    }
}
