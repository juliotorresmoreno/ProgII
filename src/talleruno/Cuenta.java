
package talleruno;

public class Cuenta {
    private int idCuenta;
    private double saldo;
    private String cedula;
    private String titular;
    private String estado;
    private static  int  idSiguiente=1;
    
public Cuenta(String cedula,String titular, double deposito,String estado){
    this.titular = titular;
    this.cedula = cedula;
    this.estado = estado;
    saldo = deposito;
    idCuenta=idSiguiente;
    idSiguiente ++;
}
  
public Cuenta(){
       idCuenta = idSiguiente;
       idSiguiente += 1;
}

public  Cuenta(String titular,double deposito){
 this.titular=titular;
       saldo = deposito;
       estado="Pendiente";
       idCuenta = idSiguiente;  
       idSiguiente += 1;

}

public void depositar(double valor){
    
      saldo += Math.abs(valor);
    
} 

public double getSaldo(){
    return saldo;
}

public  void retirar(double valor){
    if(valor > saldo)   
       valor = saldo;
    
    saldo = saldo - Math.abs(valor);
   
} 

protected void setSaldo(double valor){
  saldo = valor;
}
        
public void setEstado(String estado){
    this.estado=estado;
}

public void getDatos(){
   System.out.println("Titular: "+titular+"\n"+"Cedula : "+cedula+"\n"+" Num Cuenta: "+
                      idCuenta+"\n"+"Saldo : "+saldo+"\n"+"Estado:"+estado);

}
}





