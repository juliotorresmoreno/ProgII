
package talleruno;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;
    private boolean aplicaIntereses;
    
     public CuentaAhorro(String cedula, String titular, double deposito, String estado,double tasa){
          super(cedula,titular,deposito,estado);
          tasaInteres = tasa;
          aplicaIntereses = true;
     }
     
     public double getTasa(){
     return tasaInteres;
    }
    
     public void setTasa(double valor){
        tasaInteres=valor;
    }
     
     public void  saldoConIntereses(){
        if (aplicaIntereses){
            setSaldo(getSaldo()*(1 +getTasa()));
            aplicaIntereses=false;
        } 
     
     
     
     
     
     }
}
