package talleruno;
public abstract class Cuenta {

  
    private int idCuenta;
    private double saldo;
    private  int idCliente;  
    private String estado; 

   
    private static int idSiguiente=1;
   
    public int getIdCuenta() {
        return idCuenta;
    }
    public Cuenta(){}
    
    public Cuenta(int idCliente, double deposito, String estado){        
      this.idCliente = idCliente;      
      saldo = deposito;
      this.estado = estado;
      idCuenta = idSiguiente;
      idSiguiente += 1;
    }
    
    public Cuenta(int idCliente,double deposito){
       this.idCliente= idCliente;
       saldo = deposito;
       estado="Activa";
       idCuenta = idSiguiente;
       idSiguiente += 1;
    }
    
    public void  depositar(double valor ){
       saldo += valor;
    }
    
    public double getSaldo(){
      return saldo;
    }
    
    protected void setSaldo(double valor){        
       saldo = valor;
    }
    
    public  abstract void  retirar(double valor);
   
     public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public void getDatos(){
        
      System.out.println("idCliente : "+idCliente+"\n"+"Num. Cuenta : "+getIdCuenta()+"\n"+"Estado : "+estado+"\n"+"Saldo : "+saldo);
    }
    
     public String getEstado() {
        return estado;
    }
    public void setEstado(String valor){
     estado=valor;
    }
    
    
}
