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
public class Tipo {
    
    private String codigo;
    private String tr;
    private String tm;
    public Tipo(String c,String tr,String tm){
        this.codigo= c;
        this.tr = tr;
        this.tm = tm;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTr() {
        return tr;
    }

    public void setTr(String tr) {
        this.tr = tr;
    }
    public String imprimir(){
         return("Codigo: " + codigo + " / Tipo de Tranferencia: " + tr + " / Tipo de movimiento: " + tm);
    }

}
