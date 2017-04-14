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
public class Banco {
    
    private String codigo;
    private ArrayList<Cuenta>cuentas;
    private ArrayList<Tipo>Tipos;
    private ArrayList<Movimiento>Movimientos;
    public Banco(String c){
        
        this.codigo = c;
        this.cuentas = new ArrayList<>();
        this.Tipos = new ArrayList<>();
        this.Movimientos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    public void setTipos(ArrayList<Tipo> Tipos) {
        this.Tipos = Tipos;
    }
    public ArrayList<Tipo> ListarTipos() {
        return this.Tipos;
    }
    public ArrayList<Movimiento> ListarMov(){
        return this.Movimientos;
    }
    public ArrayList<Cuenta> ListarCuenta(){
        return this.cuentas;
    }
    public void Agregartipos(Tipo t){
        this.Tipos.add(t);
    }
    public void AgregarMov(Movimiento m){
        this.Movimientos.add(m);
    }
    public void Agregarcuenta(Cuenta c){
        this.cuentas.add(c);
    }
    
}
