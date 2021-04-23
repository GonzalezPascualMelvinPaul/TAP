/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melvin
 */
public class Pedidos {
    //Se declaras los paremetros a utilizar
    String Articulo;
    int Unidades;
    double Precio;
    double GastoEnvio;
    double Descuento;
    
    //Se inicializan en el constructor
    public Pedidos(String Articulo, int Unidades, double Precio, double GastoEnvio, double Descuento) {
        Articulo = "";
        Unidades = 1;
        Precio = 0;
        GastoEnvio = 3;
        Descuento = 0;
    }

    //Se crea los set de cada parametro
    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setGastoEnvio(double GastoEnvio) {
        this.GastoEnvio = GastoEnvio;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }
    //Se crean los get de cada paremetro
    public String getArticulo() {
        return Articulo;
    }

    public int getUnidades() {
        return Unidades;
    }

    public double getPrecio() {
        return Precio;
    }

    public double getGastoEnvio() {
        return GastoEnvio;
    }

    public double getDescuento() {
        return Descuento;
    }
    
    //Se crean nuevos metodos para utilizar.
    public double getTotalSinIva(){
    double TotalSinIva;
    TotalSinIva=(Unidades*Precio)+GastoEnvio;
    return TotalSinIva;
    }
    
    public double getIva(){
        double Iva;
        Iva=getTotalSinIva()*0.16;
        return Iva;
    }
    public double getTotalMasIva(){
        double TotalMasIva;
        TotalMasIva=getTotalSinIva()+getIva();
        return TotalMasIva;
    }
    
    public double getTotalDescuento(){
        double TotalDescuento;
        TotalDescuento=getTotalMasIva()*Descuento/100;
        return TotalDescuento;
    }
    
    public double getTotalPedido(){
        double TotalPedido;
        TotalPedido=getTotalMasIva()-getTotalDescuento();
        return TotalPedido;
    }
}
