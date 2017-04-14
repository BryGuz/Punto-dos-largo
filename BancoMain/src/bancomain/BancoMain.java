/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancomain;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bryan M
 */
public class BancoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del banco");
        String c = sc.next();
       Banco banco = new Banco(c);
       
      boolean ejec = true;
        while(ejec) {
            System.out.println("1. Crear cuenta");
            System.out.println("2. Listar Cuentas ");
            System.out.println("3. Listar Movimientos de las cuentas");
            System.out.println("4. salir");
            int o = sc.nextInt();
            switch (o) {
                case 1:
                System.out.println("Numero de la cuenta");
                int nc = sc.nextInt();
                System.out.println("Saldo de la cuenta");
                double sac = sc.nextDouble();
                System.out.println("Fecha cuenta de creacion dd mm aa");
                int dd = sc.nextInt();
                int mm = sc.nextInt();
                int aa = sc.nextInt();
                 
                Date date = new Date (dd,mm,aa); 
                
                System.out.println("Nombre del propietario de la cuenta");
                String name = sc.next();
                System.out.println("Codigo de la transaccion");
                String cd = sc.next();
                System.out.println("Que tipo de transaccion desea hacer: ");
                
                System.out.println("5. Debito");
                System.out.println("6. Credito");
                
                
               
                int tt = sc.nextInt();
                String A1;
                String A2;
                if ( tt == 5){
                    
                    System.out.println("Para hacer un movimiento rellene los datos");
                    System.out.println("Fecha actual dd mm aa");
                     
                    int d = sc.nextInt();
                    int m = sc.nextInt();
                    int a = sc.nextInt();
                    Date dateM = new Date (d,m,a); 
                    
                    System.out.println("Saldo precedente ");
                    
                    double saldo = sc.nextDouble();
                    
                    System.out.println("Cantidad");
                    
                    double cantidad = sc.nextDouble();
                    
                    Cuenta cuenta = new Cuenta(nc,sac,date,name);
                    banco.Agregarcuenta(cuenta);
                    
                    
                    System.out.println("Que tipo de movimiento desea hacer");
                    System.out.println("1. Pagar servicios");
                    System.out.println("2. Retirar dinero");
                    int tm = sc.nextInt();
                    if( tm == 1){
                        A1 = Integer.toString(tt);
                        A1 = "Debito";
                        A2 = Integer.toString(tm);
                        A2 = "Pagó Servicios";
                        Tipo tipo = new Tipo(cd,A1,A2);
                       banco.Agregartipos(tipo);
                       Movimiento mov = new Movimiento(dateM,saldo,cantidad,tipo);
                    banco.AgregarMov(mov);
                        System.out.println("Cuanto desea pagar");
                        double pa = sc.nextDouble();
                        mov.PagarCompra(pa);
                    }
                    else if ( tm ==2){
                        A1 = Integer.toString(tt);
                        A1 = "Debito";
                        A2 = Integer.toString(tm);
                        A2 = "Retiró dinero";
                        Tipo tipo = new Tipo(cd,A1,A2);
                       banco.Agregartipos(tipo);
                       Movimiento mov = new Movimiento(dateM,saldo,cantidad,tipo);
                    banco.AgregarMov(mov);
                        System.out.println("cuanto desea retirar");
                        double re = sc.nextDouble();
                        mov.retirar(re);
                    }
                }
                
                    else if (tt == 6){
                    
                    System.out.println("Para hacer un movimiento rellene los datos");
                    System.out.println("Fecha actual dd mm aa");
                     
                    int dia = sc.nextInt();
                    int mes = sc.nextInt();
                    int año = sc.nextInt();
                    Date dateM2 = new Date (dia,mes,año); 
                    
                    System.out.println("Saldo precedente ");
                    
                    double saldo2 = sc.nextDouble();
                    
                    System.out.println("Cantidad");
                    
                    double cantidad2 = sc.nextDouble();
                    
                    Cuenta cuenta = new Cuenta(nc,sac,date,name);
                    banco.Agregarcuenta(cuenta);
                    
                    
                    System.out.println("Que tipo de movimiento desea hacer");
                    System.out.println("1. Consignar dinero");
                    System.out.println("2. Recibir Transferencia");
                    int tm2 = sc.nextInt();
                    if( tm2 == 1){
                        A1 = Integer.toString(tt);
                        A1 = "Credito";
                        A2 = Integer.toString(tm2);
                        A2 = "Consignó Dinero";
                        Tipo tipo2 = new Tipo(cd,A1,A2);
                       banco.Agregartipos(tipo2);
                       Movimiento mov2 = new Movimiento(dateM2,saldo2,cantidad2,tipo2);
                    banco.AgregarMov(mov2);
                        System.out.println("Cuanto desea consignar");
                        double pa = sc.nextDouble();
                        mov2.Consignar(pa);
                    }
                    else if ( tm2 ==2){
                         A1 = Integer.toString(tt);
                        A1 = "Credito";
                        A2 = Integer.toString(tm2);
                        A2 = "Recibio Transferencia";
                        Tipo tipo2 = new Tipo(cd,A1,A2);
                       banco.Agregartipos(tipo2);
                       Movimiento mov2 = new Movimiento(dateM2,saldo2,cantidad2,tipo2);
                    banco.AgregarMov(mov2);
                        System.out.println("De parte de quien es la transferencia");
                        String name2 = sc.next();
                        System.out.println("Monto de la tranferencia");
                        double re = sc.nextDouble();
                        mov2.RTransferencia(name2, re);
                    }
                    
                    }
                break;
                
                case 2: 
                     ArrayList<Cuenta> cuentas = banco.ListarCuenta();
                    
                     
                     for(int i=0; i<cuentas.size();i++){
                  Cuenta k = cuentas.get(i);
                  
                   
                  System.out.println(".....................Cuenta N" + (i+1)+".....................");
                  System.out.println("Nombre propietario "+k.getName());                 
                  System.out.println("N Cuenta " +k.getNcuenta());
                  System.out.println("Saldo Cuenta "+k.getSaldoC());
                  System.out.println("Fecha creacion "+k.getDcreation().print());
                  System.out.println("..............................................................");
                  }
                //   Arraylist<Movimiento> movimientos = cuenta.ListarMovimientos();
                    break;
                
                    
                case 3:
                    ArrayList<Movimiento> mov = banco.ListarMov();
                    
                    
                     for(int i=0; i<mov.size();i++){
                         
                      Movimiento m = mov.get(i);
                      System.out.println(".....................Cuenta N" + (i+1)+".....................");
                      System.out.println("Cantidad: "+ m.getCantidad()); 
                      System.out.println( "Fecha: "+ m.getDate().print());
                      System.out.println(  m.getTipo().imprimir());
                      System.out.println("Saldo Precedente: " + m.getSprecedente());
                      System.out.println("..............................................................");
                     }
                  
                  break;
                        
                case 4:
                System.out.println("....................Saliendo.......................");
                ejec = false;
                break;
            }
        }
      }

   }   
      

    

