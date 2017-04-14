/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancomain;

import java.util.ArrayList;

/**
 *
 * @author Bryan M
 */
public class Cuenta {
    
    private int Ncuenta;
    private double saldoC;
    private Date Dcreation;
    private String name;
     private ArrayList<Movimiento> movimientos;
    
    public Cuenta(int nc,double sc,Date dc,String name){
        this.Ncuenta=nc;
        this.saldoC=sc;
        this.Dcreation  =dc;
        this.name= name;
        this.movimientos = new ArrayList<>();
        
        
    }

    public int getNcuenta() {
        return Ncuenta;
    }

    public void setNcuenta(int Ncuenta) {
        this.Ncuenta = Ncuenta;
    }

    public double getSaldoC() {
        return saldoC;
    }

    public void setSaldoC(double saldoC) {
        this.saldoC = saldoC;
    }

    public Date getDcreation() {
        
        return Dcreation;
    }

    public void setDcreation(Date Dcreation) {
        this.Dcreation = Dcreation;
        
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    public void AgregarMovimientos(Movimiento m){
        this.movimientos.add(m);
    }
     public ArrayList<Movimiento> ListarMov(){
        return this.movimientos;
    }
    
}
