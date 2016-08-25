
package talleruno;

public class CuentaPunto  extends CuentaAhorro {
    
    private double depositoMin;
    private int puntosAcum;

    public CuentaPunto(int idCliente, double deposito, String estado,double tasa,double montoMin){
     super(idCliente,deposito,estado,tasa);
      depositoMin = montoMin ;           
    }
    
    @Override
    public void depositar(double cant){
        super.depositar(cant);
        if (cant > depositoMin) puntosAcum++;
    }
}
