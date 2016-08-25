
package talleruno;
public class CuentaCorriente extends Cuenta {
    
    private double sobregiro;
    private String estado;
    
    public CuentaCorriente(int idCliente, double deposito,double sobregiro, String estado){        
           super(idCliente,deposito,estado);
           this.sobregiro=sobregiro;       
    }
    
    @Override
    public void retirar(double cant){
        double saldoDisponible = getSaldo()+sobregiro;
        if (cant > saldoDisponible)
            super.setSaldo(saldoDisponible);
        else 
            super.setSaldo(cant);
    }
}
