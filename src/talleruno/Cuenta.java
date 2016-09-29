package talleruno;
public abstract class Cuenta {

  
    private int id;
    private double saldo;
  
    private String estado; 

   
    private static int idSiguiente=1;
   
    public int getId() {
        return id;
    }
    public Cuenta(){}
    
    public Cuenta(int id, double deposito, String estado){        
        
      saldo = deposito;
      this.estado = estado;
      id = idSiguiente;
      idSiguiente += 1;
    }
    
    public Cuenta(int id,double deposito){
       
       saldo = deposito;
       estado="Activa";
       id = idSiguiente;
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
   
     public void setId(int id) {
        this.id = id;
    }
    
    
     public void getDatos(){
    
        
      System.out.println("id : "+id+"\n"+"Num. Cuenta : "+getId()+"\n"+"Estado : "+estado+"\n"+"Saldo : "+saldo);
    }
    
     public String getEstado() {
        return estado;
    }
    public void setEstado(String valor){
     estado=valor;
    }
    
    
}
