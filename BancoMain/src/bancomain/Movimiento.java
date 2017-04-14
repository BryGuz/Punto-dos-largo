/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancomain;

/**
 *
 * @author Bryan M
 */
public class Movimiento {
    
    private Date date;
    private double Sprecedente;
    private double cantidad;      // Tipo tipo = new tipo();
    private Tipo tipo;
   
    public Movimiento(Date d,double Sp, double c,Tipo t){
        
        this.date = d;
        this.Sprecedente = Sp;
        this.cantidad = c;
        this.tipo = t;     
    }
    public void Consignar(double d){
        cantidad = cantidad + d;
        System.out.println("La cantidad en su cuenta es: " + cantidad);
    }
    public void retirar(double r){
        cantidad = cantidad - r;
        System.out.println("La cantidad en su cuenta es: " + cantidad);
    }
    public void PagarCompra(double cp){
        cantidad = cantidad - cp;
        System.out.println("La cantidad en su cuenta es: " + cantidad);
    }
    public void RTransferencia(String name,double su){
        cantidad = cantidad + su;
        System.out.println(" Se ha recibido "+ su +" Por parte de "+ name +" la cantidad de su cuenta es :"+ cantidad);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSprecedente() {
        return Sprecedente;
    }

    public void setSprecedente(double Sprecedente) {
        this.Sprecedente = Sprecedente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
}
