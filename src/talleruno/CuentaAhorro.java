package talleruno;

public class CuentaAhorro extends Cuenta {
       private double tasaInteres; 
       private boolean aplicaIntereses;
       
       public CuentaAhorro(int idCliente, double deposito, String estado,double tasa){
           super(idCliente,deposito,estado);
           tasaInteres = tasa;
           aplicaIntereses = true;
       }
       
       public CuentaAhorro(int idCliente,double deposito,double tasa){
        super(idCliente,deposito);
        setSaldo(deposito);
        tasaInteres = tasa;
        setEstado("Activa");    
        aplicaIntereses=true;
    }
    
    public double getTasa(){
         return tasaInteres;   
    }
    protected void setTasa(double tasa) {    
       this.tasaInteres = tasa;
    }  
       
    public void saldoConIntereses(){  
      if (aplicaIntereses){
         setSaldo(getSaldo()*(1+getTasa()));
         aplicaIntereses = false;
      }
    } 
    
  }
